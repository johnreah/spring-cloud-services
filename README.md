# spring-cloud-services
This project started as an experiment with some of the Spring Boot services that support
running distributed systems in a cloud environment. It was triggered by reading the 5th edition of Craig
Walls's Spring In action book, and it tied in with a project at work that looks like it will be deployed
on Docker containers.

These libraries and services include:
- [Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/): a module that exposes operational information
about the running application
- [Spring Cloud Config](https://spring.io/projects/spring-cloud-config): provides client & server support for
externalised configuration
- [Netflix Eureka](https://spring.io/guides/gs/service-registration-and-discovery/): a service registration and discovery
service contributed to Spring by Netflix
- [Spring Boot Admin](https://github.com/codecentric/spring-boot-admin): a community project that uses the facilities
provided by the other services to provide monitoring and management capability for a suite of collaborating services.

## What's in the project
The project is structured as a multi-module Maven project. The parent POM has a number of sub-modules, each of which
builds a web service packaged as an executable JAR by the `spring-boot-maven-plugin`. Within each of the sub-modules'
directories there is also a `docker` subdirectory which includes files and scripts to build Docker images. There are
also `docker-compose.yml` files to bring up different combinations of services for testing.

