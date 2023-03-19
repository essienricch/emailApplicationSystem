package api.email_system;

import api.email_system.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "api.email_system.controller")
@EnableAutoConfiguration
public class EmailSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailSystemApplication.class, args);
    }

}
