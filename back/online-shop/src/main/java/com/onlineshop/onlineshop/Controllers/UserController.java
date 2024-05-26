package com.onlineshop.onlineshop.Controllers;

import com.onlineshop.onlineshop.Models.DTO.SignInDTO;
import com.onlineshop.onlineshop.Models.DTO.SignUpDTO;
import com.onlineshop.onlineshop.Models.DTO.UserDTO;
import com.onlineshop.onlineshop.Models.User;
import com.onlineshop.onlineshop.Services.EmailService;
import com.onlineshop.onlineshop.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private EmailService emailService;

    @PostMapping(path="/clear")
    public void clear(){

    }

    @DeleteMapping(path="/update")
    public void update(@RequestBody UserDTO userDTO){

    }

    @PostMapping(path="/email")
    public void sendEmail(@RequestParam String emailTo, @RequestParam String text){
        emailService.sendSimpleMessage(emailTo, "Your 2FA Code", text);
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
