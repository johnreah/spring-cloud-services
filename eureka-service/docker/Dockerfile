FROM openjdk:8-jdk-alpine

MAINTAINER john.reah@htk.co.uk

COPY eureka-service.jar /opt

ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/eureka-service.jar"]

EXPOSE 8761
