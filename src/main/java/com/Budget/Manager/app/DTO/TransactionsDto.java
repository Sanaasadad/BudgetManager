package com.Budget.Manager.app.DTO;

import lombok.Value;

import java.io.Serializable;
import java.util.Date;


@Value
public class TransactionsDto implements Serializable {
    Long id;
    double montant;
    String description;
    Date date;
    boolean type;
}