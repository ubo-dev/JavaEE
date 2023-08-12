package com.example.springdatajpa.repository;

import com.example.springdatajpa.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
