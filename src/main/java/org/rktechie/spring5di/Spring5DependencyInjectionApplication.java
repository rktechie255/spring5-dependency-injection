package org.rktechie.spring5di;

import org.rktechie.spring5di.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Spring5DependencyInjectionApplication.class, args);

		MyController controller = context.getBean(MyController.class);
		String message = controller.displayWorld();
		System.out.println(message);
	}

}
