# Use lightweight OpenJDK image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy jar file from target folder to container
COPY target/SPE_MINI_PROJECT_CALCULATOR-1.0-SNAPSHOT.jar app.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]