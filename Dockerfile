# Use a lightweight JDK base image
FROM eclipse-temurin:17-jdk-jammy

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file from the host to the container
COPY build/libs/*.jar app.jar

# Expose the application port (adjust if your app runs on a different port)
EXPOSE 8080

# Define the command to run the application
CMD ["java", "-jar", "app.jar"]
