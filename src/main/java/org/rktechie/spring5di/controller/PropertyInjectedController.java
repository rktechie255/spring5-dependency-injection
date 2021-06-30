package org.rktechie.spring5di.controller;

import org.rktechie.spring5di.org.rktechie.spring5di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("propertyGreetingService")
    public GreetingService greetingService;
    private String messageType;

    public String getGreeting() {
        messageType = " =====Displaying through PropertyBasedInjection===== ";
        return greetingService.displayGreeting() + messageType;
    }
}
