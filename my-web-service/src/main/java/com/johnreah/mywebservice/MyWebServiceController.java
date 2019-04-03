package com.johnreah.mywebservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Optional;

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

    @GetMapping("/localServerPort")
    public String getInfo() {
        String localServerPort = environment.getProperty("local.server.port");
        log.info(String.format("%s", localServerPort));
        return localServerPort;
    }

}
