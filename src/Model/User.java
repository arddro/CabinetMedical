package Model;

public class User {

private int id;
private String username;
private String parola;
private String tip_user;

    public User() {

    }

    public User(int id, String username, String parola, String tip_user) {
        this.id = id;
        this.username = username;
        this.parola = parola;
        this.tip_user = tip_user;

    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getTip_user() {
        return tip_user;
    }

    public void setTip_user(String tip_user) {
        this.tip_user = tip_user;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", parola='" + parola + '\'' +
                ", tip_user='" + tip_user + '\'' +
                '}';
    }
}

