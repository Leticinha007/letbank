package com.letbank.models;

import jakarta.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;
    private double limit;

    @OneToOne
    private User user;
    // getters, setters
}