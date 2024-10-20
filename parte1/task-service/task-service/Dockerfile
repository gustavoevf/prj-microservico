# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-oracle
# Set the working directory in the container
WORKDIR /app
# Copy the current directory contents into the container at /app
ADD *.jar app.jar
# Make port 8082 available to the world outside this container
EXPOSE 8082
# Run the jar file
ENTRYPOINT ["java","-jar","app.jar"]