package com.mainacad;

import com.mainacad.model.*;
import com.mainacad.service.CartSrvice;
import com.mainacad.service.UserGenerationService;

import java.util.Date;

public class ApplicationRunner {

    public static void main(String[] args) {

        Date birthDay = UserGenerationService.getDate(2004,1,5);
        User user = new User("Jovakinn", "12345", "Max", "Khodakov", birthDay, Gender.MALE);

        Item item = new Item("adbdab", "someName", 15.05);
        Order order =  new Order(item, 12);
        Cart cart = new Cart(user, order, new Date().getTime());

        System.out.println(CartSrvice.getTotalSum(cart));


    }
}
