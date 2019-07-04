package com.mainacad.service;

import com.mainacad.model.Cart;

public class CartSrvice {

    public static  Double getTotalSum(Cart cart){
         return  cart.getOrder().getAmount() * cart.getOrder().getItem().getPrice();
    }
}
