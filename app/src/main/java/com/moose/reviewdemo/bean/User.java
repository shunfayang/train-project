package com.moose.reviewdemo.bean;

import java.io.Serializable;

/**
 * Created by yangshunfa on 2016/11/21.
 * tips:
 */

public class User implements Serializable {
    private String name;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
