package com.onlineshop.onlineshop.Models;

import com.onlineshop.onlineshop.Models.DTO.StatusDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
@Entity
@Table(name = "statuses")
public class Status {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "description")
    @NotNull
    private int description;

    public Status(){

    }

    public Status(StatusDTO statusDTO) {
        this.id = statusDTO.getId();
        this.description = statusDTO.getDescription();
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
