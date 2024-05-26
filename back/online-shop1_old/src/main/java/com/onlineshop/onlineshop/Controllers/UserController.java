package com.onlineshop.onlineshop.Controllers;

import com.onlineshop.onlineshop.Models.DTO.UserDTO;
import com.onlineshop.onlineshop.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path="/clear")
    public void clear(){

    }

    @PostMapping(path="/registration")
    public void create(@RequestBody UserDTO userDTO){

    }

    @PostMapping(path="/vk_authorization")
    public void vkAuthorization(@RequestBody UserDTO userDTO){

    }

    @DeleteMapping(path="/update")
    public void update(@RequestBody UserDTO userDTO){

    }

    @PutMapping(path="/login")
    public void authorization(@RequestBody UserDTO userDTO){

    }

    @PutMapping(path="/confirm_access")
    public void authentication(@RequestBody UserDTO userDTO){

    }

    @GetMapping(path="/setChildMode")
    public UserDTO setChildMode(@RequestParam boolean isEnabled) {
        return null;
    }

    @GetMapping(path="/configureNotifications")
    public UserDTO configureNotifications(@RequestParam boolean isEnabled){
        return null;
    }
}
