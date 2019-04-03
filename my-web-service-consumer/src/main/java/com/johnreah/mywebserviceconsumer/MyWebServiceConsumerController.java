package com.johnreah.mywebserviceconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/mywebserviceconsumer")
@CrossOrigin(origins = {"*"})
@Slf4j
public class MyWebServiceConsumerController {

    private Environment environment;
    private RestTemplate restTemplate;

    @Autowired
    public MyWebServiceConsumerController(Environment environment, RestTemplate restTemplate) {
        this.environment = environment;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/info")
    public String getInfo() {
        Integer restResult = restTemplate.getForObject("http://my-web-service/mywebservice/localServerPort", Integer.class);
        String info;
        info = String.format("Consumer's localServerPort = %s, web service localServerPort = %d",
                environment.getProperty("local.server.port"), restResult);
        log.info(String.format("Controller returning: %s", info));
        return info;
    }

}
