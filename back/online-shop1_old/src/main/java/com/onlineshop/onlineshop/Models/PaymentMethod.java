package com.onlineshop.onlineshop.Models;

import com.onlineshop.onlineshop.Models.DTO.PaymentMethodDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
@Entity
@Table(name = "paymentMethods")
public class PaymentMethod {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "description")
    @NotNull
    private int description;

    public PaymentMethod(){

    }

    public PaymentMethod(PaymentMethodDTO paymentMethodDTO) {
        this.id = paymentMethodDTO.getId();
        this.description = paymentMethodDTO.getDescription();
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
