FROM amazoncorretto:17-alpine-jdk
LABEL authors="asankaa"
LABEL name="book-service"

# Set the working directory
WORKDIR /app

# Copy the Spring Boot JAR file and configuration files to the container
COPY build/libs/book-service-*.jar /app/book-service.jar

EXPOSE 8071
ENTRYPOINT ["java","-jar","/app/book-service.jar"]
