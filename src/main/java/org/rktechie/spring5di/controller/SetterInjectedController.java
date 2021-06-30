package org.rktechie.spring5di.controller;

import org.rktechie.spring5di.org.rktechie.spring5di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;
    private String messageType;

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
        messageType = " =====Displaying through SetterBasedInjection=====";
    }

    public String getGreeting(){
        return greetingService.displayGreeting() + messageType;
    }
}
