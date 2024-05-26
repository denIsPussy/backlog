package com.onlineshop.onlineshop.Services;

import com.onlineshop.onlineshop.Models.ShoppingCart;
import com.onlineshop.onlineshop.Repositories.CartItemRepository;
import com.onlineshop.onlineshop.Repositories.ShoppingCartRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ShoppingCartService {
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;
    private CartItemRepository cartItemRepository;

    public ShoppingCartService(ShoppingCartRepository shoppingCartRepository, CartItemRepository cartItemRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
        this.cartItemRepository = cartItemRepository;
    }

    public void clear(int id){
        return;
    }

    public void addToCart(int productId, int quantity){
        return;
    }

    public void removeFromCart(int productId, int quantity){
        return;
    }

    public void update(int productId, int quantity){
        return;
    }

    public ShoppingCart getById(int id){
        return null;
    }

    public List<ShoppingCart> getByUserId(int userId){
        return null;
    }
}

