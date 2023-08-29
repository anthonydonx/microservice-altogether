FROM amazoncorretto:17-alpine-jdk
LABEL authors="asankaa"
LABEL name="config-server"
LABEL intended-container-name="my-config-server"

# Set the working directory
WORKDIR /app

# Copy the Spring Boot JAR file and configuration files to the container
COPY build/libs/config-server-*.jar /app/config-server.jar
COPY src/main/resources/config /app/config

EXPOSE 8088
ENTRYPOINT ["java","-jar","/app/config-server.jar"]
