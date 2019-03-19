docker container stop config-service
docker container rm config-service
docker run ^
	--name=config-service ^
	--publish=8888:8888 ^
	-e SPRING_PROFILES_ACTIVE=desktop-docker ^
	-e SERVER_PORT=8888 ^
	-e SPRING_APPLICATION_NAME=config-service ^
	-e INFO_DESCRIPTION="Configuration service" ^
	-e MANAGEMENT_ENDPOINTS_WEB_EXPOSURE_INCLUDE=* ^
	-e EUREKA_CLIENT_SERVICEURL_DEFAULTZONE=http://192.168.20.199:8761/eureka ^
	-e SPRING_CLOUD_CONFIG_SERVER_GIT_URI=https://github.com/johnreah/spring-boot-config ^
	-e SPRING_CLOUD_CONFIG_SERVER_GIT_USERNAME=%GITHUB_USERNAME% ^
	-e SPRING_CLOUD_CONFIG_SERVER_GIT_PASSWORD=%GITHUB_PASSWORD% ^
	config-service:latest
