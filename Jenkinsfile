pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t calculator-app .'
            }
        }

        stage('Docker Push') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                    sh '''
                        echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin
                        docker tag calculator-app $DOCKER_USER/calculator-app:latest
                        docker push $DOCKER_USER/calculator-app:latest
                    '''
                }
            }
        }

        stage('Deploy') {
            steps {
                sh 'ansible-playbook -i ansible/inventory.ini ansible/deploy.yml'
            }
        }
    }
post {

        success {
            emailext(
                subject: "SUCCESS: Build #${env.BUILD_NUMBER} - ${env.JOB_NAME}",
                body: "Good news!\n\nBuild succeeded.\n\nProject: ${env.JOB_NAME}\nBuild Number: ${env.BUILD_NUMBER}\nCheck Jenkins for details.",
                to: "your-email@gmail.com"
            )
        }

        failure {
            emailext(
                subject: "FAILED: Build #${env.BUILD_NUMBER} - ${env.JOB_NAME}",
                body: "Attention!\n\nBuild failed.\n\nProject: ${env.JOB_NAME}\nBuild Number: ${env.BUILD_NUMBER}\nCheck Jenkins logs immediately.",
                to: "your-email@gmail.com"
            )
        }
    }
}