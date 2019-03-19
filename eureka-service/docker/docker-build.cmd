copy ..\target\eureka-service-0.0.1-SNAPSHOT.jar .\eureka-service.jar
docker build --file=Dockerfile --tag=eureka-service:latest --no-cache --rm=true .
