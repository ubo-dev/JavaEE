package com.example.springdatajpa.repository;

import com.example.springdatajpa.models.Cart;
import com.example.springdatajpa.models.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriberRepository extends JpaRepository<Subscriber, Integer> {

}
