package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Gra_m on 2022 03 18
 */
@Configuration
public class GreetingServiceConfig {

    // Trad use case == working with 3rd party component
    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean // bean name == method name below
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }




}
