copy ..\target\config-service-0.0.1-SNAPSHOT.jar .\config-service.jar
docker build --file=Dockerfile --tag=config-service:latest --no-cache --rm=true .
