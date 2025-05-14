package com.Budget.Manager.app.services;

import com.Budget.Manager.app.DTO.TransactionsDto;
import com.Budget.Manager.app.Entity.Categories;
import com.Budget.Manager.app.Entity.Transactions;
import com.Budget.Manager.app.repositories.CategorieRepositorie;
import com.Budget.Manager.app.repositories.TrasactionRepositorie;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class TransactionServices {
    private TrasactionRepositorie trasactionRepositorie;
    private CategorieRepositorie categorieRepositorie;
    private ModelMapper modelMapper;

    public TransactionServices(TrasactionRepositorie trasactionRepositorie, ModelMapper modelMapper, CategorieRepositorie categorieRepositorie) {
        this.trasactionRepositorie = trasactionRepositorie;
        this.modelMapper = modelMapper;
        this.categorieRepositorie = categorieRepositorie;
    }

    public TransactionsDto save(TransactionsDto transactionDto) {
        Categories categorie = categorieRepositorie.findById(transactionDto.getIdCategorie())
                .orElseThrow(() -> new RuntimeException("Catégorie introuvable avec l'id: " + transactionDto.getIdCategorie()));
        Transactions transaction = modelMapper.map(transactionDto, Transactions.class);
        transaction.setCategorie(categorie);
        Transactions savedTransaction = trasactionRepositorie.save(transaction);
        TransactionsDto result = modelMapper.map(savedTransaction, TransactionsDto.class);
        result.setIdCategorie(savedTransaction.getCategorie().getIdCategorie()); // en cas de bug ModelMapper
        return result;
    }






}
