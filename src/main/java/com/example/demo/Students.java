package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "lastName", nullable = false)
    private String lastName;
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;




}
