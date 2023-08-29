FROM amazoncorretto:17-alpine-jdk
LABEL authors="asankaa"
LABEL name="author-service"

# Set the working directory
WORKDIR /app

# Copy the Spring Boot JAR file and configuration files to the container
COPY build/libs/author-service-*.jar /app/author-service.jar

EXPOSE 8070
ENTRYPOINT ["java","-jar","/app/author-service.jar"]
