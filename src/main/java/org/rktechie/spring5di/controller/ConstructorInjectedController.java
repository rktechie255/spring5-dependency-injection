package org.rktechie.spring5di.controller;

import org.rktechie.spring5di.org.rktechie.spring5di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;
    private final String messageType;


    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
        messageType = " =====Displaying through ConstructorBasedInjection=====";
    }

    public String getGreeting() {
        return greetingService.displayGreeting() + messageType;
    }
}
