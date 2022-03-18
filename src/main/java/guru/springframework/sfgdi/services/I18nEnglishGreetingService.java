package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;

/**
 * Created by jt on 12/27/19.
 */
public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository ENGLISH_GREETING_REPO;

    public I18nEnglishGreetingService(EnglishGreetingRepository english_greeting_repo) {
        ENGLISH_GREETING_REPO = english_greeting_repo;
    }


    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
