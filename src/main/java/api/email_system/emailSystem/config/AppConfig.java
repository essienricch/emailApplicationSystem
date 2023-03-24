package api.email_system.emailSystem.config;

import api.email_system.emailSystem.data.repository.AppUserRepository;
import api.email_system.emailSystem.service.UserService;
import api.email_system.emailSystem.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    private AppUserRepository appUserRepository;

    @Bean
    public UserService userService(){
        return new UserServiceImpl(appUserRepository);
    }

//    @Bean
//    public UserController userController(){
//        return new UserController(new UserServiceImpl(appUserRepository));
//    }
}
