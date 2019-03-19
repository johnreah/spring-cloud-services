docker container stop eureka2
docker container rm eureka2

docker run ^
	--name=eureka2 ^
	--publish=8762:8761 ^
	-e SPRING_PROFILES_ACTIVE=desktop-docker ^
	-e SERVER_PORT=8762 ^
	-e SPRING_APPLICATION_NAME=eureka ^
	-e INFO_DESCRIPTION="Service registry" ^
	-e MANAGEMENT_ENDPOINTS_WEB_EXPOSURE_INCLUDE=* ^
	-e EUREKA_CLIENT_SERVICEURL_DEFAULTZONE=http://eureka1:8761/eureka ^
	eureka-service:latest
