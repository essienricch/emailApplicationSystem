package api.email_system.config;

import api.email_system.data.repository.AppUserRepository;
import api.email_system.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    private AppUserRepository appUserRepository;

    @Bean
    public UserServiceImpl userService(){
        return new UserServiceImpl(appUserRepository);
    }

//    @Bean
//    public UserController userController(){
//        return new UserController(new UserServiceImpl(appUserRepository));
//    }
}
