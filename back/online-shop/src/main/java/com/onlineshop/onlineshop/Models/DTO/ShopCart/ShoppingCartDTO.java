package com.onlineshop.onlineshop.Models.DTO.ShopCart;

import com.onlineshop.onlineshop.Models.ShoppingCart;

import java.util.List;

public class ShoppingCartDTO {
    private int id;
    private List<CartItemDetailDTO> cartItems;

    public ShoppingCartDTO(){

    }

    public ShoppingCartDTO(ShoppingCart shoppingCart) {
        this.id = shoppingCart.getId();
        this.cartItems = shoppingCart.getCartItems().stream().map(CartItemDetailDTO::new).toList();
    }

    public int getId() {
        return id;
    }

    public List<CartItemDetailDTO> getCartItems() {
        return cartItems;
    }
}
