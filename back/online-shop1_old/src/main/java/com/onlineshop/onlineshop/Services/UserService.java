package com.onlineshop.onlineshop.Services;

import com.onlineshop.onlineshop.Models.User;
import com.onlineshop.onlineshop.Repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(User user){
    }

    public void update(User user){
    }

    public boolean verifyUserCredentials(User user){
        return true;
    }

    public void authorization(User user){
        return;
    }

    public void addBonuses(User user, int bonus){
        return;
    }

    public void writeOffBonuses(User user, int bonus){
        return;
    }

    public void setChildMode(boolean isEnabled){
    }

    public void configureNotifications(boolean isEnabled){
    }

    public void passwordEncryption(String password){
    }

    public void decryptingPassword(String password){
    }
}
