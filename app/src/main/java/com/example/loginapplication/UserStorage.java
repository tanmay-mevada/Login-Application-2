package com.example.loginapplication;

import java.util.HashMap;

public class UserStorage {
    private static final HashMap<String, String> users = new HashMap<>();

    public static HashMap<String, String> getUsers() {
        return users;
    }
}
