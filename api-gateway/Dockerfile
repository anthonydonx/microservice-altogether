FROM amazoncorretto:17-alpine-jdk
LABEL authors="asankaa"
LABEL name="gateway-server"

# Set the working directory
WORKDIR /app

# Copy the Spring Boot JAR file and configuration files to the container
COPY build/libs/api-gateway-*.jar /app/gateway-server.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/gateway-server.jar"]
