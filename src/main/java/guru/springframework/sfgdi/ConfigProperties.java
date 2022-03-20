package guru.springframework.sfgdi;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Gra_m on 2022 03 20
 *  had to add this to the pom
 * <dependency>
 *     <groupId>org.springframework.boot</groupId>
 *     <artifactId>spring-boot-configuration-processor</artifactId>
 *     <optional>true</optional>
 * </dependency
 */

@ConfigurationProperties("fun")
@Configuration
public class ConfigProperties {
    private String userName;
    private String password;
    private String urlToDBSource;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrlToDBSource() {
        return urlToDBSource;
    }

    public void setUrlToDBSource(String urlToDBSource) {
        this.urlToDBSource = urlToDBSource;
    }

}
