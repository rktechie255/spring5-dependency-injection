package org.rktechie.spring5di.controller;

import org.rktechie.spring5di.org.rktechie.spring5di.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    private String messageType;

    public String getGreeting() {
        messageType = " =====Displaying through PropertyBasedInjection===== ";
        return greetingService.displayGreeting() + messageType;
    }
}
