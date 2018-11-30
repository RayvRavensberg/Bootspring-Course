package com.example.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/com/example/springbootstarter/hello")
    public String sayHi() {
        return "Hi";
     }
}
