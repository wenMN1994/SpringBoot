package com.dragon.springboot.domain;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2019/9/20 16:04
 * @description：
 * @modified By：
 * @version: $
 */
public class User {

    private String username;

    private int gender;

    public User(String username, int gender) {
        this.username = username;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
