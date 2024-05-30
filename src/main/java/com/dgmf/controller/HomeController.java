package com.dgmf.controller;

import com.dgmf.aop.annotation.CheckSomething;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    @CheckSomething(roles = {"roles"})
    public String index() {
        return "Greetings from Spring AOP";
    }
}
