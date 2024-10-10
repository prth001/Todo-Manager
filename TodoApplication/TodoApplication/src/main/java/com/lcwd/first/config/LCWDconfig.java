package com.lcwd.first.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "lcwd.config")
@Component
public class LCWDconfig {
    private String name;
    private String password;
    private String email;
    private int Emailexpire;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmailexpire() {
        return Emailexpire;
    }

    public void setEmailexpire(int emailexpire) {
        Emailexpire = emailexpire;
    }

    @Override
    public String toString() {
        return "LCWDconfig{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", Emailexpire=" + Emailexpire +
                '}';
    }
}
