package main.entity;

import java.sql.Time;

public class User {
    private int id;
    private String account;
    private  String password;
    private  String nickname;
    private String registertime;


    public void setId(int id) {
        this.id = id;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setRegistertime(String registertime) {
        this.registertime = registertime;
    }


    public int getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getRegistertime() {
        return registertime;
    }


}
