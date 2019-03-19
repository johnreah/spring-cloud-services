FROM openjdk:8-jdk-alpine

MAINTAINER john.reah@htk.co.uk

COPY config-service.jar /opt

ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/config-service.jar"]

EXPOSE 8888
