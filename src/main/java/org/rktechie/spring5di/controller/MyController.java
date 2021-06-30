package org.rktechie.spring5di.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String displayWorld(){
        System.out.println("Hello World!!");
        return "Welcome to Spring Boot application world!!";
    }
}
