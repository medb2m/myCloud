package com.med.memanagement.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
    long idUser;

    @Column(nullable = false)
    String nomUser;
}
