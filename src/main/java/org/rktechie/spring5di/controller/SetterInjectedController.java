package org.rktechie.spring5di.controller;

import org.rktechie.spring5di.org.rktechie.spring5di.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;
    private String messageType;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
        messageType = " =====Displaying through SetterBasedInjection=====";
    }

    public String getGreeting(){
        return greetingService.displayGreeting() + messageType;
    }
}
