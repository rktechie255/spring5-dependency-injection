package org.rktechie.spring5di.org.rktechie.spring5di.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String displayGreeting() {
        return "Welcome to Spring Boot DI framework!!";
    }
}
