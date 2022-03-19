package guru.springframework.sfgdi.scopesetting;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Gra_m on 2022 03 19
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
    public static int count;

    public PrototypeBean() {
        System.out.println("Creating a prototype bean..");
        count++;
    }

    public String getMyScope(){
        return "I'm a prototype, there are ever increasing amounts of me " + count;
    }
}
