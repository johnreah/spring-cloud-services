copy ..\target\admin-service-0.0.1-SNAPSHOT.jar .\admin-service.jar
docker build --file=Dockerfile --tag=admin-service:latest --no-cache --rm=true .
