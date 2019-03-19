FROM openjdk:8-jdk-alpine

MAINTAINER john.reah@htk.co.uk

COPY admin-service.jar /opt

ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/admin-service.jar"]

EXPOSE 9090
