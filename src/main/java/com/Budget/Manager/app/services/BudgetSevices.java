package com.Budget.Manager.app.services;

import com.Budget.Manager.app.Entity.Budgets;
import com.Budget.Manager.app.repositories.BudgetRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BudgetSevices {

    @Autowired
    private BudgetRepositorie budgetRepositorie;

    public Budgets addBudgets(@RequestBody Budgets budgets) {
        return budgetRepositorie.save(budgets);
    }

    public List<Budgets> getAllBudgets() {
        return budgetRepositorie.findAll();
    }
    public Budgets getBudgetById(Long id) {
        return budgetRepositorie.findById(id).get();
    }

    public Budgets updateBudgetById(@RequestBody Budgets budgets) {
        return budgetRepositorie.save(budgets);
    }
    public void deleteBudgetById(Long id) {
        budgetRepositorie.deleteById(id);
    }
}
