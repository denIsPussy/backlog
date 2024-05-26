package com.onlineshop.onlineshop.Repositories;

import com.onlineshop.onlineshop.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
