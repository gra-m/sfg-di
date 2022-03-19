package guru.springframework.sfgdi.scopesetting;

import org.springframework.stereotype.Component;

/**
 * Created by Gra_m on 2022 03 19
 */
@Component
public class SingletonBean {
    public static int count;

    public SingletonBean() {
        System.out.println("Creating a singleton bean..");
        count++;
    }

    public String getMyScope(){
        return "I'm a singleton, there is only ever " + count + " of me." ;
    }
}
