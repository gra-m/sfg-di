package guru.springframework.sfgdi;

/**
 * Created by Gra_m on 2022 03 19
 */

public class FakeDataSource {
    private String userName;
    private String password;
    private String urlToDBSource;

    public FakeDataSource(String userName, String password, String urlToDBSource) {
        this.userName = userName;
        this.password = password;
        this.urlToDBSource = urlToDBSource;
    }

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
