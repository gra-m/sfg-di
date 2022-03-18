package guru.springframework.sfgdi.repositories;

/**
 * Created by Gra_m on 2022 03 18
 */

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository{
    
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
