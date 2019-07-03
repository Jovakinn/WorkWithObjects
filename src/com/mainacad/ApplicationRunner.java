package com.mainacad;

import com.mainacad.model.Gender;
import com.mainacad.model.User;
import com.mainacad.service.UserGenerationService;

import java.util.Date;

public class ApplicationRunner {

    private static final  String PROJECT_DIR_PATH = System.getProperty("user.dir");

    public static void main(String[] args) {

        Date birthDay = UserGenerationService.getDate(2004,1,5);
        User user1 = new User("Jovakinn", "12345", "Max", "Khodakov", birthDay, Gender.MALE);
        User user2 = new User(Gender.FEMALE);

        user1.setPassword("98765");
        System.out.println(user1);
        System.out.println(user1.equals(user2));

        System.out.println(PROJECT_DIR_PATH);
    }
}
