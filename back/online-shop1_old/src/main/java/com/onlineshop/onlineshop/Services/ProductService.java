package com.onlineshop.onlineshop.Services;

import com.onlineshop.onlineshop.Models.DTO.OrderDTO;
import com.onlineshop.onlineshop.Models.DTO.ProductDTO;
import com.onlineshop.onlineshop.Models.Product;
import com.onlineshop.onlineshop.Repositories.OrderRepository;
import com.onlineshop.onlineshop.Repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product>  filterByRating(String rating){
        return null;
    }
    public List<Product> filterByPrice(String price){
        return null;
    }
    public List<Product> filterByCategory(String category){
        return null;
    }
    public List<Product> search(String name){
        return null;
    }
    public List<Product> getAll(){
        return productRepository.findAll();
    }
}
