FROM amazoncorretto:17-alpine-jdk
LABEL authors="asankaa"
LABEL name="eureka-server"

# Set the working directory
WORKDIR /app

# Copy the Spring Boot JAR file and configuration files to the container
COPY build/libs/service-discovery-*.jar /app/eureka-server.jar

EXPOSE 8761
ENTRYPOINT ["java","-jar","/app/eureka-server.jar"]
