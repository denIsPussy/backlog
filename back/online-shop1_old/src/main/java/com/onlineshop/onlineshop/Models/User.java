package com.onlineshop.onlineshop.Models;

import com.onlineshop.onlineshop.Models.DTO.UserDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "firstname")
    @NotNull
    private String firstName;

    @Column(name = "lastname")
    @NotNull
    private String lastName;

    @Column(name = "patronymic")
    @NotNull
    private String patronymic;

    @Column(name = "login")
    @NotNull
    private String login;

    @Column(name = "password")
    @NotNull
    private String password;

    @Column(name = "deposit")
    @NotNull
    private float deposit;

    @Column(name = "isChildModeEnabled")
    @NotNull
    private boolean isChildModeEnabled;

    @Column(name = "areNotificationsEnabled")
    @NotNull
    private boolean areNotificationsEnabled;

    @JoinColumn(name = "cart_id")
    @OneToOne
    private ShoppingCart shoppingCart = new ShoppingCart();

    @JoinColumn(name = "user_id")
    @OneToMany
    private List<Order> orderList = new ArrayList<>();

    @JoinColumn(name = "user_id")
    @OneToMany
    private List<Notification> notificationList = new ArrayList<>();

    public User(){

    }

    public User(UserDTO userDTO) {
        this.id = userDTO.getId();
        this.firstName = userDTO.getFirstName();
        this.lastName = userDTO.getLastName();
        this.patronymic = userDTO.getPatronymic();
        this.login = userDTO.getLogin();
        this.password = userDTO.getPassword();
        this.deposit = userDTO.getDeposit();
        this.isChildModeEnabled = userDTO.isChildModeEnabled();
        this.areNotificationsEnabled = userDTO.isAreNotificationsEnabled();
        this.shoppingCart = userDTO.getShoppingCart();
        this.orderList = userDTO.getOrderList().stream().map(Order::new).toList();
        this.notificationList = userDTO.getNotificationList().stream().map(Notification::new).toList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public boolean isChildModeEnabled() {
        return isChildModeEnabled;
    }

    public void setChildModeEnabled(boolean childModeEnabled) {
        isChildModeEnabled = childModeEnabled;
    }

    public boolean isAreNotificationsEnabled() {
        return areNotificationsEnabled;
    }

    public void setAreNotificationsEnabled(boolean areNotificationsEnabled) {
        this.areNotificationsEnabled = areNotificationsEnabled;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public void addToOrderList(Order order) {
        this.orderList.add(order);
    }

    public void removeFromToOrderList(Order order) {
        this.orderList.removeIf(item -> item.getId() == order.getId());
    }

    public List<Notification> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<Notification> notificationList) {
        this.notificationList = notificationList;
    }

    public void addToNotificationList(Notification notification) {
        this.notificationList.add(notification);
    }

    public void removeFromNotificationList(Notification notification) {
        this.notificationList.removeIf(item -> item.getId() == notification.getId());
    }
}