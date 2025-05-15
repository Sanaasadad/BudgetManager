package com.Budget.Manager.app.services;

import com.Budget.Manager.app.DTO.TransactionsDto;
import com.Budget.Manager.app.Entity.Categories;
import com.Budget.Manager.app.Entity.Transactions;
import com.Budget.Manager.app.Mapper.TransactionMapper;
import com.Budget.Manager.app.repositories.CategorieRepositorie;
import com.Budget.Manager.app.repositories.TrasactionRepositorie;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionServices {
    private TrasactionRepositorie trasactionRepositorie;
    private CategorieRepositorie categorieRepositorie;
    private TransactionMapper transactionMapper;



    public List<TransactionsDto> getAll() {
        return trasactionRepositorie.findAll()
                .stream()
                .map(transactionMapper::toDTO).toList();
    }

    public TransactionsDto add(TransactionsDto transactionsDto) {
        Transactions transactions = transactionMapper.toEntity(transactionsDto);
        transactions.setCategorie(categorieRepositorie.findById(transactionsDto.getIdCategorie()).orElseThrow());
        return transactionMapper.toDTO(trasactionRepositorie.save(transactions));
    }

    public TransactionsDto update(Long id, TransactionsDto transactionsDto) {
        Transactions transactions = trasactionRepositorie.findById(id).orElseThrow();
        transactions.setMontant(transactionsDto.getMontant());
        transactions.setDescription(transactionsDto.getDescription());
        transactions.setDate(transactionsDto.getDate());
        transactions.setType(transactionsDto.isType());
        transactions.setCategorie(categorieRepositorie.findById(transactionsDto.getIdCategorie()).orElseThrow());
        return transactionMapper.toDTO(trasactionRepositorie.save(transactions));

    }

    public void delete(Long id) {
        trasactionRepositorie.deleteById(id);
    }




}
