package com.Budget.Manager.app.controllers;

import com.Budget.Manager.app.Entity.Transactions;
import com.Budget.Manager.app.repositories.TrasactionRepositorie;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    private final TrasactionRepositorie trasactionRepositorie;
    public TransactionController(TrasactionRepositorie trasactionRepositorie){
        this.trasactionRepositorie=trasactionRepositorie;
    }

    @PostMapping("/ajouter")
    public Transactions save(@RequestBody Transactions transactions){
        return trasactionRepositorie.save(transactions);
    }
    @GetMapping("/products")
    public List<Transactions> getProducts() {
        return trasactionRepositorie.findAll();
    }
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Long id) {
        trasactionRepositorie.deleteById(id);
    }
    @PutMapping("/product")
    public Transactions updateProduct( @RequestBody Transactions product) {
        return trasactionRepositorie.save(product);


    }

}
