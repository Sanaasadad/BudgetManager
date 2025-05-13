package com.Budget.Manager.app.repositories;

import com.Budget.Manager.app.Entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categorieRepositorie extends JpaRepository<Categories,Long> {
}
