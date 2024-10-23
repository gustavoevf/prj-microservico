# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-oracle
# Set the working directory in the container
#WORKDIR /taget
# Copy the current directory contents into the container at /app
COPY target/task-service-0.0.1-SNAPSHOT.jar app.jar
# Make port 8083 available to the world outside this container
EXPOSE 8082
# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"] 