package com.Budget.Manager.app.controllers;

import com.Budget.Manager.app.DTO.TransactionsDto;
import com.Budget.Manager.app.Entity.Transactions;
import com.Budget.Manager.app.repositories.TrasactionRepositorie;
import com.Budget.Manager.app.services.TransactionServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    private final TransactionServices transactionServices;
    public TransactionController(TransactionServices transactionServices){
        this.transactionServices=transactionServices;
    }

    @PostMapping("transaction")
    public ResponseEntity<TransactionsDto> save(@RequestBody TransactionsDto dto) {
        TransactionsDto saved = transactionServices.save(dto);
        return ResponseEntity.ok(saved);
    }

}
