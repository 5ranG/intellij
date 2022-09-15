package com.intelij;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .username("junil")
                .password("1234")
                .name("김준일")
                .email("email@naver.com")
                .build();

        System.out.println(user);

        UserSerivce userSerivce = new UserServiceImpl();
        userSerivce.insert(user);

        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        String json = gson.toJson(user);
        System.out.println(json);
    }
}