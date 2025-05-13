package com.Budget.Manager.app.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Transactions {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double montant;
    private String description;
    private Date date;

    private boolean type;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categories categorie;

}
