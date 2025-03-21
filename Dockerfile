#Start with a base image containing Java runtime
FROM openjdk:21-jdk-slim

WORKDIR /app
# Add the application's jar to the image
COPY target/JobApp-0.0.1-SNAPSHOT.jar JobApp-0.0.1-SNAPSHOT.jar

EXPOSE 8080
# execute the application
CMD ["java", "-jar", "JobApp-0.0.1-SNAPSHOT.jar"]
