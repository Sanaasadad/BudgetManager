package com.Budget.Manager.app.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity  @NoArgsConstructor @AllArgsConstructor
public class Transactions {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private double montant;
 private String description;
 private Date date;
 private boolean type;
 @ManyToOne

 private Categories categorie;

 public double getMontant() {
  return montant;
 }

 public void setMontant(double montant) {
  this.montant = montant;
 }

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public Date getDate() {
  return date;
 }

 public void setDate(Date date) {
  this.date = date;
 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public boolean isType() {
  return type;
 }

 public void setType(boolean type) {
  this.type = type;
 }

 public Categories getCategorie() {
  return categorie;
 }

 public void setCategorie(Categories categorie) {
  this.categorie = categorie;
 }



}
