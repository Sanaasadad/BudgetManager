package com.Budget.Manager.app.controllers;

import com.Budget.Manager.app.DTO.TransactionsDto;
import com.Budget.Manager.app.Entity.Transactions;
import com.Budget.Manager.app.repositories.TrasactionRepositorie;
import com.Budget.Manager.app.services.TransactionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
budgetController@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionServices transactionServices;

    @GetMapping
    public List<TransactionsDto> getAllTransactions() {
        return transactionServices.getAll();
    }

    @PostMapping
    public TransactionsDto createTransaction(@RequestBody TransactionsDto transactionsDto) {
        return transactionServices.add(transactionsDto);
    }

    @PutMapping("/{id}")
    public TransactionsDto updateTransaction(@PathVariable Long id ,@RequestBody TransactionsDto transactionsDto) {
        return transactionServices.update(id,transactionsDto);
    }


    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Long id) {
        transactionServices.delete(id);
    }








//    @PostMapping("transaction")
//    public ResponseEntity<TransactionsDto> save(@RequestBody TransactionsDto dto) {
//        TransactionsDto saved = transactionServices.save(dto);
//        return ResponseEntity.ok(saved);
//    }

}
