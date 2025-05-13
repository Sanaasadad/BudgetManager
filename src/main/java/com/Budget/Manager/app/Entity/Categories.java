package com.Budget.Manager.app.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private boolean type;
    @OneToMany (mappedBy = "categories", cascade = CascadeType.ALL)
    private List<Transactions> transactions;
    @OneToOne (mappedBy = "categories")
    private Budgets budgets;
}
