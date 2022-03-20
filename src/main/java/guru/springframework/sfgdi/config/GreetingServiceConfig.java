package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.ConfigProperties;
import guru.springframework.sfgdi.FakeDataSource;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Gra_m on 2022 03 18
 */
//@PropertySource("classpath:datasource.properties") ==> SpringFramework requirement just put in application properties with Boot.
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(ConfigProperties configProperties)  {
        FakeDataSource fake = new FakeDataSource();
        fake.setUserName(configProperties.getUserName());
        fake.setPassword(configProperties.getPassword());
        fake.setUrlToDBSource(configProperties.getUrlToDBSource());

        return fake;
    }




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
