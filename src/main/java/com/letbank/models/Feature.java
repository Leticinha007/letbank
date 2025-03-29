package com.letbank.models;

import jakarta.persistence.*;

@Entity
public class Feature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon;
    private String description;

    @ManyToOne
    private User user;
    // getters, setters
}