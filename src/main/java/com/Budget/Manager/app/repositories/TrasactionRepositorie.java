package com.Budget.Manager.app.repositories;

import com.Budget.Manager.app.Entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrasactionRepositorie extends JpaRepository<Transactions,Long> {
}
