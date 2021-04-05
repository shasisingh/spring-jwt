package nl.shashi.springsecurityjwt.models;

import java.io.Serializable;
import java.util.StringJoiner;

public class AuthenticationRequest implements Serializable {

    private String username;
    private String password;

    public AuthenticationRequest() {

    }

    public AuthenticationRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AuthenticationRequest.class.getSimpleName() + "[", "]").add("username='" + username + "'")
                .add("password='" + password + "'").toString();
    }
}
