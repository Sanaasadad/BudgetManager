package com.Budget.Manager.app.services;

import com.Budget.Manager.app.Entity.Categories;
import com.Budget.Manager.app.repositories.CategorieRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CategoriesServices {

    @Autowired
    private CategorieRepositorie categorieRepositorie;

    public Categories addCategories(@RequestBody Categories categories) {
        return categorieRepositorie.save(categories);
    }
    public List<Categories> getAllCategories() {
        return categorieRepositorie.findAll();
    }
    public Categories getCategoriesById(Long id) {
            return categorieRepositorie.findById(id).get();
    }

    public Categories updateCategories(@RequestBody Categories categories) {
        return categorieRepositorie.save(categories);
    }
    public void deleteCategories(Long id) {
        categorieRepositorie.deleteById(id);

    }



}
