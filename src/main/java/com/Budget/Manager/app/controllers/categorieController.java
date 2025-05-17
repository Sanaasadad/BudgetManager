package com.Budget.Manager.app.controllers;

import com.Budget.Manager.app.Entity.Categories;
import com.Budget.Manager.app.services.CategoriesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:64944") // ✅ هذا هو السطر المهم
@RestController
@RequestMapping("/category")
public class categorieController {
    @Autowired
    private CategoriesServices categoriesServices;



    @PostMapping
    public Categories addCategory(@RequestBody Categories categories) {
        return this.categoriesServices.addCategories(categories);
    }

    @GetMapping
    public List<Categories> getCategories() {
        return this.categoriesServices.getAllCategories();
    }

    @PutMapping
    public Categories updateCategorie(@RequestBody Categories categories) {
        return this.categoriesServices.updateCategories(categories);
    }


    @DeleteMapping
    public void deleteCategory(@RequestParam Long id) {
         this.categoriesServices.deleteCategories(id);
    }


}
