package com.Budget.Manager.app.DTO;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;



public class BudgetsDto implements Serializable {
    Long id;
    LocalDate date_de_debut;
    LocalDate date_de_fin;
    double montant_depense;
}