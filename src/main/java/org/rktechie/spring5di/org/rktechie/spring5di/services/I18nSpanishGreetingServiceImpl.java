package org.rktechie.spring5di.org.rktechie.spring5di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nGreetingService")
public class I18nSpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String displayGreeting() {
        return "In spanish :- ¡Bienvenido al marco DI de Spring Boot español! ";
    }
}
