package com.example.springdatajpa.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String userName;

    @ManyToMany(mappedBy = "subscribers", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Channel> channel = new ArrayList<>();
}
