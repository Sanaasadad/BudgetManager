package com.Budget.Manager.app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private String categorie;

}
