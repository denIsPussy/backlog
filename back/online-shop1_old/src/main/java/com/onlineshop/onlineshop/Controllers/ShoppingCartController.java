package com.onlineshop.onlineshop.Controllers;

import com.onlineshop.onlineshop.Models.DTO.CartItemDTO;
import com.onlineshop.onlineshop.Models.DTO.ShoppingCartDTO;
import com.onlineshop.onlineshop.Services.ShoppingCartService;
import com.onlineshop.onlineshop.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping(path="/clear")
    public void clear(){

    }
    @PostMapping(path="/addToCart")
    public void addToCart(@RequestBody CartItemDTO cartItemDTO){

    }
    @DeleteMapping(path="/removeFromCart/{id}")
    public void removeFromCart(@PathVariable int productId){

    }
    @PutMapping(path="/updateCartItems")
    public void updateCartItems(@RequestBody CartItemDTO cartItemDTO){

    }
    @GetMapping(path="/{id}")
    public ShoppingCartDTO getById(@PathVariable int id){
        return null;
    }
    @GetMapping(path="/byUser/{id}")
    public ShoppingCartDTO getByUserId(@PathVariable int userId){
        return null;
    }
}
