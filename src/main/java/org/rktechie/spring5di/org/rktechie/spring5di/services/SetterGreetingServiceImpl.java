package org.rktechie.spring5di.org.rktechie.spring5di.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("setterGreetingService")
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String displayGreeting() {
        return "Welcome to Spring Boot DI framework!!";
    }
}