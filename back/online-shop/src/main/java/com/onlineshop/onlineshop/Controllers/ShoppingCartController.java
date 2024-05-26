package com.onlineshop.onlineshop.Controllers;

import com.onlineshop.onlineshop.Models.CartItem;
import com.onlineshop.onlineshop.Models.DTO.CartItemDTO;
import com.onlineshop.onlineshop.Models.DTO.ShoppingCartDTO;
import com.onlineshop.onlineshop.Models.ShoppingCart;
import com.onlineshop.onlineshop.Models.User;
import com.onlineshop.onlineshop.Services.ShoppingCartService;
import com.onlineshop.onlineshop.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;
    @Autowired
    private UserService userService;

    @PostMapping(path="/clear")
    public void clear(){

    }
    @PostMapping(path="/addToCart")
    public ShoppingCartDTO addToCart(@RequestBody CartItemDTO cartItemDTO){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userService.getByUsername(userDetails.getUsername());
        ShoppingCart shoppCart = user.getShoppingCart();
        ShoppingCart newCart = shoppingCartService.addToCart(shoppCart, new CartItem(cartItemDTO));
        return new ShoppingCartDTO(newCart);
    }
    @DeleteMapping(path="/removeFromCart/{id}")
    public void ShoppingCartDTO(@PathVariable int productId){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userService.getByUsername(userDetails.getUsername());
        ShoppingCart shoppCart = user.getShoppingCart();
        ShoppingCart newCart = shoppingCartService.removeFromCart(shoppCart, productId);
        return new ShoppingCartDTO(newCart);
    }
    @PutMapping(path="/updateCartItems")
    public void updateCartItems(@RequestBody CartItemDTO cartItemDTO){

    }
    @GetMapping(path="/{id}")
    public ShoppingCartDTO getById(@PathVariable int id){
        return new ShoppingCartDTO(shoppingCartService.getById(id));
    }
    @GetMapping(path="/byUser/{id}")
    public ShoppingCartDTO getByUserId(@PathVariable int userId){
        return null;
    }
}
