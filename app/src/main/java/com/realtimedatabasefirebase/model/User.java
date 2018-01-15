package com.realtimedatabasefirebase.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by SIS310 on 03-Jan-18.
 */
@IgnoreExtraProperties
public class User {
    public String name;
    public String email;

    public User() {

    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
