package com.onlineshop.onlineshop.Models.DTO.ShopCart;

import com.onlineshop.onlineshop.Models.CartItem;
import com.onlineshop.onlineshop.Models.DTO.Product.ProductViewDTO;

public class CartItemDetailDTO {
    private int id;
    private ProductViewDTO product;
    //private ShoppingCartDTO shoppingCart;
    private int quantity;

    public CartItemDetailDTO(){

    }

    public CartItemDetailDTO(CartItem cartItem) {
        this.id = cartItem.getId();
        this.product = new ProductViewDTO(cartItem.getProduct());
        //this.shoppingCart = new ShoppingCartDTO(cartItem.getShoppingCart());
        this.quantity = cartItem.getQuantity();
    }

    public int getId() {
        return id;
    }

    public ProductViewDTO getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

//    public ShoppingCartDTO getShoppingCart() {
//        return shoppingCart;
//    }
}
