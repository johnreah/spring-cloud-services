package com.johnreah.mywebservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mywebservice")
@CrossOrigin(origins = {"*"})
@Slf4j
public class MyWebServiceController {

    private Environment environment;

    @Autowired
    public MyWebServiceController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/info")
    public String getInfo() {
        String info;
        info = String.format("localServerPort = %s", environment.getProperty("local.server.port"));
        log.info(String.format("Controller returning: %s", info));
        return info;
    }

}
