package com.example.Document.Management.System.controllers;

import com.example.Document.Management.System.model.shelfCategory;
import com.example.Document.Management.System.services.shelfCategoryService;
import com.example.Document.Management.System.DTO.shelfCategoryDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shelf-categories")
public class shelfCategoryController {
    @Autowired
    private shelfCategoryService shelfCategoryService;
    @PostMapping
    public ResponseEntity<shelfCategory> createShelfCategory(@Valid @RequestBody shelfCategoryDTO shelfCategoryDTO){
        // Convert DTO to domain object
        shelfCategory category = new shelfCategory();
       shelfCategory createdCategory = shelfCategoryService.createshelfCategory(category);
       return ResponseEntity.ok(createdCategory);
    }
    @GetMapping
    public ResponseEntity<List<shelfCategory>> getShelfCategories(){
        List<shelfCategory> categories = shelfCategoryService.getAllShelfCategories();
        return ResponseEntity.ok(categories);
    }
    @GetMapping("/{id}")
    public ResponseEntity<shelfCategory> getShelfCategoryById(@PathVariable Long id) {
        shelfCategory category = shelfCategoryService.getShelfCategoryById(id);
        if (category == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(category);
    }
}
