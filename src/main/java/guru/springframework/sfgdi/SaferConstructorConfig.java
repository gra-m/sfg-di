package guru.springframework.sfgdi;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * Created by Gra_m on 2022 03 20
 */

@ConstructorBinding
@ConfigurationProperties("fun")
public class SaferConstructorConfig {
    private final String userName;
    private final String password;
    private final String urlToDBSource;

    public SaferConstructorConfig(String userName, String password, String urlToDBSource) {
        this.userName = userName;
        this.password = password;
        this.urlToDBSource = urlToDBSource;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUrlToDBSource() {
        return urlToDBSource;
    }
}
