# wmms



## Getting started

To make it easy for you to get started with GitLab, here's a list of recommended next steps.

Already a pro? Just edit this README.md and make it your own. Want to make it easy? [Use the template at the bottom](#editing-this-readme)!

## To run the project
### Prerequisites
- Java 17 or above
- Docker
- Docker compose
- Gradle
### Steps
- Clone the repository
- Build each project using the following command
```gradle clean build```
- Build each micro service by docker compose using the following command
```docker compose build {service name}```
  - example : to build auth-service
```docker compose build auth-service```

| Service           | Build                                  | Run                                 |
|-------------------|----------------------------------------|-------------------------------------|
| gateway           | docker compose build gateway           | docker compose up gateway           |
| author-service    | docker compose build author-service    | docker compose up author-service    |
| book-service      | docker compose build book-service      | docker compose up book-service      |
| config-server     | docker compose build config-server     | docker compose up config-server     |
| service-discovery | docker compose build service-discovery | docker compose up service-discovery |

- Run the following command in the root directory of the project
```docker compose up```
```
cd existing_repo
git remote add origin https://git.zone24x7.lk/SFIKS/wmms.git
git branch -M main
git push -uf origin main
```
## Services and Ports
| Service           | URL                                    |
|-------------------|----------------------------------------|
| RabbitMQ          | http://localhost:15672/                |
## Integrate with your tools

- [ ] [Set up project integrations](https://git.zone24x7.lk/SFIKS/wmms/-/settings/integrations)

## Collaborate with your team

- [ ] [Invite team members and collaborators](https://docs.gitlab.com/ee/user/project/members/)
- [ ] [Create a new merge request](https://docs.gitlab.com/ee/user/project/merge_requests/creating_merge_requests.html)
- [ ] [Automatically close issues from merge requests](https://docs.gitlab.com/ee/user/project/issues/managing_issues.html#closing-issues-automatically)
- [ ] [Enable merge request approvals](https://docs.gitlab.com/ee/user/project/merge_requests/approvals/)
- [ ] [Automatically merge when pipeline succeeds](https://docs.gitlab.com/ee/user/project/merge_requests/merge_when_pipeline_succeeds.html)

## Test and Deploy

Use the built-in continuous integration in GitLab.

- [ ] [Get started with GitLab CI/CD](https://docs.gitlab.com/ee/ci/quick_start/index.html)
- [ ] [Analyze your code for known vulnerabilities with Static Application Security Testing(SAST)](https://docs.gitlab.com/ee/user/application_security/sast/)
- [ ] [Deploy to Kubernetes, Amazon EC2, or Amazon ECS using Auto Deploy](https://docs.gitlab.com/ee/topics/autodevops/requirements.html)
- [ ] [Use pull-based deployments for improved Kubernetes management](https://docs.gitlab.com/ee/user/clusters/agent/)
- [ ] [Set up protected environments](https://docs.gitlab.com/ee/ci/environments/protected_environments.html)

***

# Tools & Resources
- Complete architecture diagram of the system can be found [here](https://app.diagrams.net/#G1eFr_q_jVQSYunKLsVoyEItZl7E0PJxvG#%7B%22pageId%22%3A%22XUmDpPqW0UtqAgkQeeMO%22%7D).
- API Gateway implementation resource [api gateway resource](https://www.javaguides.net/2022/10/spring-boot-microservices-spring-cloud-api-gateway.html)
- Spring Cloud Config Server implementation resource [config server resource](https://www.javaguides.net/2022/10/spring-boot-microservices-spring-cloud-config-server.html)
- Spring Cloud Eureka Server implementation resource [eureka server resource](https://www.javaguides.net/2022/10/spring-boot-microservices-spring-cloud-eureka-server.html)
- Zipkin Server implementation resource [zipkin server resource](https://www.javaguides.net/2022/10/spring-boot-microservices-spring-cloud-zipkin-server.html)
- open telemetry implementation resource [open telemetry resource](https://www.javaguides.net/2022/10/spring-boot-microservices-spring-cloud-opentelemetry.html)
- Spring Cloud Gateway implementation resource [gateway resource](https://www.javaguides.net/2022/10/spring-boot-microservices-spring-cloud-gateway.html)
- overall implementation resource [overall resource](https://piotrminkowski.com/2023/03/13/microservices-with-spring-boot-3-and-spring-cloud/)
- Spring cloud strems with RabbitMQ implementation resource [rabbitmq resource](https://medium.com/javarevisited/event-driven-microservices-with-spring-cloud-stream-and-rabbitmq-add4166fe223)
# How to run the system
- Clone the repository
- Run the following command in the root directory of the project
```docker compose up```