package com.onlineshop.onlineshop.Controllers;

import com.onlineshop.onlineshop.Models.DTO.CartItemDTO;
import com.onlineshop.onlineshop.Models.DTO.OrderDTO;
import com.onlineshop.onlineshop.Models.DTO.ShoppingCartDTO;
import com.onlineshop.onlineshop.Services.OrderService;
import com.onlineshop.onlineshop.Services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping(path="/create")
    public void create(@RequestBody OrderDTO orderDTO){

    }
    @GetMapping(path="/{id}")
    public OrderDTO getById(@PathVariable int id){
        return null;
    }
    @GetMapping(path="/byUser/{id}")
    public OrderDTO getByUserId(@PathVariable int userId){
        return null;
    }
}
