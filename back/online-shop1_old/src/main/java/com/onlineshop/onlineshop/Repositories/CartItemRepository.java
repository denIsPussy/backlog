package com.onlineshop.onlineshop.Repositories;

import com.onlineshop.onlineshop.Models.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
}
