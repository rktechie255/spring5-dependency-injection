package org.rktechie.spring5di.org.rktechie.spring5di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nGreetingService")
public class I18nEnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String displayGreeting() {
        return "Welcome to English Spring Boot DI framework!!";
    }
}
