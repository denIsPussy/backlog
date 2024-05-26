package com.onlineshop.onlineshop.Models.DTO;

import com.onlineshop.onlineshop.Models.Notification;
import com.onlineshop.onlineshop.Models.Order;
import com.onlineshop.onlineshop.Models.ShoppingCart;
import com.onlineshop.onlineshop.Models.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String login;
    private String password;
    private float deposit;
    private boolean isChildModeEnabled;
    private boolean areNotificationsEnabled;
    private ShoppingCart shoppingCart;
    private List<OrderDTO> orderList;
    private List<NotificationDTO> notificationList;

    public UserDTO(){

    }

    public UserDTO(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.patronymic = user.getPatronymic();
        this.login = user.getLogin();
        this.password = user.getPassword();
        this.deposit = user.getDeposit();
        this.isChildModeEnabled = user.isChildModeEnabled();
        this.areNotificationsEnabled = user.isAreNotificationsEnabled();
        this.shoppingCart = user.getShoppingCart();
        this.orderList = user.getOrderList().stream().map(OrderDTO::new).toList();
        this.notificationList = user.getNotificationList().stream().map(NotificationDTO::new).toList();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public float getDeposit() {
        return deposit;
    }

    public boolean isChildModeEnabled() {
        return isChildModeEnabled;
    }

    public boolean isAreNotificationsEnabled() {
        return areNotificationsEnabled;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public List<OrderDTO> getOrderList() {
        return orderList;
    }

    public List<NotificationDTO> getNotificationList() {
        return notificationList;
    }
}
