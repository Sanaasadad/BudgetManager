package com.Budget.Manager.app.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Budgets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date_de_debut;
    private LocalDate date_de_fin;
    private double montant_depense;
     @OneToOne
     @JoinColumn(name = "categorie_id")
    private Budgets budget;

}
