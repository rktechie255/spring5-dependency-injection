package org.rktechie.spring5di;

import org.rktechie.spring5di.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Spring5DependencyInjectionApplication.class, args);
		System.out.println("\n=============================================================================\n");
		I18nController i18nController = context.getBean(I18nController.class);
		System.out.println(i18nController.getGreeting());
		System.out.println("===============================================================================\n");
		MyController controller = context.getBean(MyController.class);
		String message = controller.displayWorld();
		System.out.println(message);

		PropertyInjectedController propertyInjectedController = context.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = context.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController = context.getBean(ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());
	}

}
