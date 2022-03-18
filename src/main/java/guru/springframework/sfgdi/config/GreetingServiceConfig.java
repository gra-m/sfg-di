package guru.springframework.sfgdi.config;

import fun.madeby.pets.CatPetService;
import fun.madeby.pets.DogPetService;
import fun.madeby.pets.PetService;
import fun.madeby.pets.PetServiceFactory;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Created by Gra_m on 2022 03 18
 *
 * Instead of using annotations (slow on startup for large projects with many annotations)
 * a config file can be used:)
 */

@Configuration
public class GreetingServiceConfig {

// Bringing in 3rd P Jar PetServiceFactory..

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Profile("cat")
    @Bean
    PetService catPetService(){
       return petServiceFactory().getPetService("cat");
    }

    @Profile("dog")
    @Bean
    PetService dogPetService(){
        return petServiceFactory().getPetService("dog");
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Profile("ES")
    @Bean("i18nService")
    I18NSpanishService i18NSpanishService() {
        return new I18NSpanishService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }


    @Profile("EN")
    @Bean // this bean depends on the above spring is smart and makes the above first.
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    //Move to xml
    /*@Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }*/

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }




}
