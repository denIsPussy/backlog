package com.onlineshop.onlineshop.Models.DTO;

import com.onlineshop.onlineshop.Models.Product;
import com.onlineshop.onlineshop.Models.StoreItem;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;

public class StoreItemDTO {
    private int id;
    private int quantity;
    private ProductDTO product;
    private StoreDTO store;

    public StoreItemDTO(){

    }

    public StoreItemDTO(StoreItem storeItem) {
        this.id = storeItem.getId();
        this.quantity = storeItem.getQuantity();
        this.product = new ProductDTO(storeItem.getProduct());
        this.store = new StoreDTO(storeItem.getStore());
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public StoreDTO getStore() {
        return store;
    }
}
