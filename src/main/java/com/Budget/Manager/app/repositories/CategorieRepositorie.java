package com.Budget.Manager.app.repositories;

import com.Budget.Manager.app.Entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepositorie extends JpaRepository<Categories,Long> {
}
