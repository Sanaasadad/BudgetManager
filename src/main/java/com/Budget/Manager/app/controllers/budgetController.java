package com.Budget.Manager.app.controllers;

import com.Budget.Manager.app.Entity.Budgets;
import com.Budget.Manager.app.services.BudgetSevices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/budget")
public class budgetController {
    @Autowired
    private BudgetSevices budgetSevices;

    @PostMapping("/add")
    public Budgets addBudget(Budgets budget) {
        return budgetSevices.addBudgets(budget);
    }

    @GetMapping("/getall")
    public List<Budgets> getAllBudgets() {
        return budgetSevices.getAllBudgets();
    }

    @PutMapping("/update")
    public Budgets updateBudget(Long id, Budgets budget) {
        return budgetSevices.updateBudgetById(budget);
    }

    @DeleteMapping("/delete")
    public void deleteBudget(Long id) {
        budgetSevices.deleteBudgetById(id);
    }
}
