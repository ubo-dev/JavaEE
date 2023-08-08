package com.example.springdatajpa.repository;

import com.example.springdatajpa.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
