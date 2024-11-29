package com.example.Document.Management.System.controllers;

import com.example.Document.Management.System.model.shelf;
import com.example.Document.Management.System.services.shelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class shelfController {
    @Autowired
    private shelfService shelfService;

    @PostMapping
    public ResponseEntity<shelf> createdShelf(@RequestBody shelf shelf){
        shelf createdShelf = shelfService.createShelf(shelf);
        return ResponseEntity.ok(createdShelf);
    }
    @GetMapping
    public ResponseEntity<List<shelf>> getAllshelves() {
        List<shelf> shelves = shelfService.getAllShelves();
        return ResponseEntity.ok(shelves);
    }
    @GetMapping("/category/{shelfCategoryId}")
    public ResponseEntity<List<shelf>> getShelvesByShelfCategoryId(@PathVariable Long shelfCategoryId){
      List<shelf> shelves = shelfService.getShelvesByShelfCategoryId(shelfCategoryId);
      return ResponseEntity.ok(shelves);
    }
    @GetMapping("/{id}")
    public ResponseEntity<shelf> getShelfById (@PathVariable Long id){
        shelf shelf = shelfService.getShelfById(id);
        if (shelf==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(shelf);
    }
    //Additional methods for updating and deleting shelves

}
