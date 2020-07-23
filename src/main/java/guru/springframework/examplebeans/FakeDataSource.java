package guru.springframework.examplebeans;

public class FakeDataSource {

    private String userName;
    private String psw;
    private String url;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "FakeDataSource{" +
                "userName='" + userName + '\'' +
                ", psw='" + psw + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
