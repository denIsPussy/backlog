package com.onlineshop.onlineshop.Models;

import com.onlineshop.onlineshop.Models.DTO.ShippingMethodDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "shippingMethods")
public class ShippingMethod {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "description")
    @NotNull
    private int description;

    public ShippingMethod(){

    }

    public ShippingMethod(ShippingMethodDTO shippingMethodDTO) {
        this.id = shippingMethodDTO.getId();
        this.description = shippingMethodDTO.getDescription();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }
}
