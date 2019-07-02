package com.mainacad;

import com.mainacad.model.Gender;
import com.mainacad.model.User;
import com.mainacad.service.UserGenerationService;

import java.util.Date;

public class ApplicationRunner {
    public static void main(String[] args) {
        Date birthDay = UserGenerationService.getDate(2004,1,5);
        User user1 = new User("Jovakinn", "12345", "Max", "Khodakov", birthDay, Gender.MALE);
        User user2 = new User("Jovakiiiii", "12345", "Max", "Khodakov", birthDay, Gender.MALE);

        System.out.println(user1.equals(user2));
    }
}
