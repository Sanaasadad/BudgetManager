package com.Budget.Manager.app.controllers;

import com.Budget.Manager.app.Entity.Categories;
import com.Budget.Manager.app.services.CategoriesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class categorieController {
    @Autowired
    private CategoriesServices categoriesServices;



    @PostMapping("/Add")
    public Categories addCategory(@RequestBody Categories categories) {
        return this.categoriesServices.addCategories(categories);
    }

    @GetMapping("/get")
    public List<Categories> getCategories() {
        return this.categoriesServices.getAllCategories();
    }

    @PutMapping("/udapt")
    public Categories updateCategorie(@RequestBody Categories categories) {
        return this.categoriesServices.updateCategories(categories);
    }


    @DeleteMapping("/delete")
    public void deleteCategory(@RequestParam Long id) {
         this.categoriesServices.deleteCategories(id);
    }


}
