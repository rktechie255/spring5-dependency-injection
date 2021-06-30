package org.rktechie.spring5di.controller;

import org.rktechie.spring5di.org.rktechie.spring5di.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;
    private final String messageType;


    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
        messageType = " =====Displaying through ConstructorBasedInjection=====";
    }

    public String getGreeting() {
        return greetingService.displayGreeting() + messageType;
    }
}
