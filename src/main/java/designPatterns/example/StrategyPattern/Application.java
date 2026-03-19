package designPatterns.example.StrategyPattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import designPatterns.example.StrategyPattern.Services.DependencyInjectionService;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
	CommandLineRunner run(DependencyInjectionService diService) {
		return args -> {

		};
	}
	/* 
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.createUser("Alice");
        };
    }*/
}