# 🚀 CI/CD Pipeline for Scientific Calculator (DevOps Mini Project)

A **DevOps-enabled Scientific Calculator Application** implemented using **Java, Maven, Jenkins, Docker, and Ansible**.

This project demonstrates a **complete CI/CD pipeline** that automatically **builds, tests, containerizes, and deploys** the application whenever code is pushed to GitHub.

---

# 📌 Project Overview

This project implements a **fully automated CI/CD pipeline** for a Java-based **Scientific Calculator**.

The pipeline integrates modern DevOps tools to ensure that every code change goes through automated stages including:

- Source Code Integration
- Automated Build
- Unit Testing
- Docker Image Creation
- Image Publishing to DockerHub
- Automated Deployment using Ansible

The goal of this project is to **demonstrate real-world DevOps practices** used in modern software delivery pipelines.

---

# 🧮 Scientific Calculator Features

The application is a **menu-driven CLI calculator** that supports the following operations:

| Option | Operation |
|--------|-----------|
| 1 | Addition |
| 2 | Subtraction |
| 3 | Multiplication |
| 4 | Division |
| 5 | Power |
| 6 | Square Root |
| 7 | Factorial |
| 8 | Natural Logarithm |
| 9 | Exit |

The application also handles **invalid inputs and mathematical edge cases**, including:

- Division by zero
- Negative square root
- Invalid logarithmic values
- Negative factorial inputs

---

# ⚙️ Technology Stack

| Technology | Purpose |
|------------|---------|
| **Java** | Application development |
| **Maven** | Build automation |
| **JUnit** | Unit testing |
| **Git & GitHub** | Version control |
| **Jenkins** | CI/CD automation |
| **Docker** | Containerization |
| **DockerHub** | Image registry |
| **Ansible** | Automated deployment |

---

# 🏗️ CI/CD Pipeline Architecture

```
Developer Push
│
▼
GitHub
│
▼
GitHub Webhook
│
▼
Jenkins Pipeline
│
▼
Build Application (Maven)
│
▼
Run Unit Tests (JUnit)
│
▼
Build Docker Image
│
▼
Push Image to DockerHub
│
▼
Deploy using Ansible
│
▼
Running Docker Container
```

---

# 🔄 CI/CD Pipeline Stages

The Jenkins pipeline consists of the following stages:

### 1️⃣ Build Stage
- Compiles the Java application
- Packages the application into a JAR file using Maven

### 2️⃣ Test Stage
- Executes all unit tests using JUnit
- Ensures application reliability before deployment

### 3️⃣ Docker Build Stage
- Builds a Docker image for the application

### 4️⃣ Docker Push Stage
- Pushes the Docker image to DockerHub

### 5️⃣ Deployment Stage
- Uses Ansible to:
  - Pull the latest Docker image
  - Stop the previous container
  - Deploy the new container automatically

---

# 🐳 Docker Container

The application runs inside a **Docker container** to ensure:

- Environment consistency
- Easy deployment
- Platform independence

The container is automatically created and deployed through the **CI/CD pipeline**.

---

# 🤖 Automated Deployment using Ansible

Ansible automates the deployment process by:

1. Pulling the latest image from DockerHub
2. Removing the previous container
3. Starting a new container

This ensures the **latest version of the application is always deployed automatically**.

---

# 📂 Project Structure

```
SPE-Scientific-Calculator
│
├── src
│   ├── main
│   │   └── java
│   │       └── com/calculator
│   │           ├── CalculatorService.java
│   │           └── Main.java
│   │
│   └── test
│       └── java
│           └── CalculatorServiceTest.java
│
├── ansible
│   ├── deploy.yml
│   └── inventory.ini
│
├── Dockerfile
├── Jenkinsfile
├── pom.xml
└── README.md
```

---

# 🚀 How the Pipeline Works

1️⃣ Developer pushes code to **GitHub**

2️⃣ GitHub triggers **Jenkins using Webhook**

3️⃣ Jenkins executes pipeline stages:

- Build
- Test
- Docker Image Creation
- DockerHub Push
- Deployment via Ansible

4️⃣ Updated application is deployed automatically.


---

# 💡 Key DevOps Concepts Demonstrated

This project demonstrates several important DevOps practices:

- Continuous Integration
- Continuous Deployment
- Automated Testing
- Containerization
- Infrastructure Automation
- DevOps Pipeline Implementation

---

# 🎯 Learning Outcomes

Through this project the following concepts were implemented:

- CI/CD pipeline design
- Jenkins pipeline automation
- Docker containerization
- DockerHub image registry
- Infrastructure automation with Ansible
- Automated software delivery

---

# 🔗 Project Links

### GitHub Repository

[https://github.com/vivekvj18/SPE-Scientific-Calculator](https://github.com/vivekvj18/SPE-Scientific-Calculator)

### DockerHub Repository

https://hub.docker.com/repository/docker/2001vivekjoshi/calculator-app/general

---

# 👨‍💻 Author

**Vivek Joshi**  
M.Tech CSE  
International Institute of Information Technology Bangalore

---

# ⭐ Acknowledgement

This project was developed as part of the **Software Production Engineering course** at **IIIT Bangalore**, focusing on practical implementation of **DevOps and CI/CD pipelines**.

---

# 📜 License

This project is created for **educational and academic purposes**.
