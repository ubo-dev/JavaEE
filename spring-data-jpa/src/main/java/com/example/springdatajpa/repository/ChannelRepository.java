package com.example.springdatajpa.repository;

import com.example.springdatajpa.models.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel, Integer> {

}
