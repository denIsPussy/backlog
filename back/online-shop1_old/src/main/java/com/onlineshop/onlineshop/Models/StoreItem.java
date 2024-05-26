package com.onlineshop.onlineshop.Models;

import com.onlineshop.onlineshop.Models.DTO.StoreItemDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
@Entity
@Table(name = "storeItems")
public class StoreItem {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "quantity")
    @NotNull
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    public StoreItem(){

    }

    public StoreItem(StoreItemDTO storeItemDTO) {
        this.id = storeItemDTO.getId();
        this.quantity = storeItemDTO.getQuantity();
        this.product = new Product(storeItemDTO.getProduct());
        this.store = new Store(storeItemDTO.getStore());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
