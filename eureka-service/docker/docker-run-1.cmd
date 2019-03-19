docker container stop eureka1
docker container rm eureka1

docker run ^
	--name=eureka1 ^
	--publish=8761:8761 ^
	-e SPRING_PROFILES_ACTIVE=desktop-docker ^
	-e SERVER_PORT=8761 ^
	-e SPRING_APPLICATION_NAME=eureka ^
	-e INFO_DESCRIPTION="Service registry" ^
	-e MANAGEMENT_ENDPOINTS_WEB_EXPOSURE_INCLUDE=* ^
	-e EUREKA_CLIENT_SERVICEURL_DEFAULTZONE=http://eureka2:8762/eureka ^
	eureka-service:latest

