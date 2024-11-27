package com.example.Document.Management.System.services;

import com.example.Document.Management.System.model.shelfCategory;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Document.Management.System.repositories.shelfCategoryRepository;
import com.example.Document.Management.System.repositories.shelfRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class shelfCategoryService {
    @Autowired
    private shelfCategoryRepository shelfCategoryRepository;

    public shelfCategory createshelfCategory(shelfCategory shelfCategory){
        return shelfCategoryRepository.save(shelfCategory);
    }

    public List<shelfCategory> getAllShelfCategories() {
        return shelfCategoryRepository.findAll();
    }

    public shelfCategory getShelfCategoryById(Long id){
        return shelfCategoryRepository.findById(id).orElse(null);
    }
    //additional methods for updating, deleting, and searching ShelfCategories

}
