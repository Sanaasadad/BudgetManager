package com.Budget.Manager.app.repositories;

import com.Budget.Manager.app.Entity.Budgets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepositorie extends JpaRepository<Budgets,Long> {
}
