package com.Budget.Manager.app.repositories;

import com.Budget.Manager.app.Entity.Budgets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface budgetRepositorie extends JpaRepository<Budgets,Long> {
}
