package com.example.Document.Management.System.services;

import com.example.Document.Management.System.model.shelf;
import com.example.Document.Management.System.repositories.shelfRepository;
import com.example.Document.Management.System.repositories.shelfCategoryRepository;
import com.example.Document.Management.System.model.shelfCategory;
import com.example.Document.Management.System.services.shelfCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class shelfService {
    @Autowired
    private shelfRepository shelfRepository;

    public shelf createShelf(shelf shelf){
        return shelfRepository.save(shelf);
    }

    public List<shelf> getAllShelves(){
        return shelfRepository.findAll();
    }
    public List<shelf> getShelvesByShelfCategoryId(Long shelfCategoryId){
        return shelfRepository.findByShelfCategory_Id(shelfCategoryId);
    }

    public shelf getShelfById(Long id) {
        return shelfRepository.findById(id).orElse(null);
    }
    //additional methods
}
