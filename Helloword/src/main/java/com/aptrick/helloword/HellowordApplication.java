package com.aptrick.helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HellowordApplication {

    public static void main(String[] args) {

        SpringApplication.run(HellowordApplication.class, args);

    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Patrick") String name) {
        return String.format("Kiongozi %s!", name);
    }
}