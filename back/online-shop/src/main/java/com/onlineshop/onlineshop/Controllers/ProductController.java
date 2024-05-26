package com.onlineshop.onlineshop.Controllers;

import com.onlineshop.onlineshop.Models.DTO.OrderDTO;
import com.onlineshop.onlineshop.Models.DTO.ProductDTO;
import com.onlineshop.onlineshop.Services.OrderService;
import com.onlineshop.onlineshop.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(path="/byRating")
    public List<ProductDTO> filterByRating(@RequestParam String rating){
        return null;
    }
    @GetMapping(path="/byPrice")
    public List<ProductDTO> filterByPrice(@RequestParam String price){
        return null;
    }
    @GetMapping(path="/byCategory")
    public List<ProductDTO> filterByCategory(@RequestParam String category){
        return null;
    }
    @GetMapping(path="/search")
    public List<ProductDTO> search(@RequestParam String name){
        return null;
    }
    @GetMapping(path="/")
    public List<ProductDTO> getAll(){
        return productService.getAll().stream().map(ProductDTO::new).toList();
    }

    @GetMapping(path="/test")
    public void test(){
        productService.test();
    }
}
