package com.johnreah.mywebservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mywebservice")
@CrossOrigin(origins = {"*"})
@Slf4j
public class MyWebServiceController {

    @GetMapping("/info")
    public String getInfo() {
        String info;
        info = "hello";
        log.info(String.format("Controller returning %s", info));
        return info;
    }

}
