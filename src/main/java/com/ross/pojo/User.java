package com.ross.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author zjf
 */
@Component
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    //账户
    private String account;
    //密码
    private String password;

    public User(Integer id, String account, String password) {
        this.id = id;
        this.account = account;
        this.password = password;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}