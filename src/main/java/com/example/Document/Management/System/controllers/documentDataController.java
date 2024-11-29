package com.example.Document.Management.System.controllers;

import com.example.Document.Management.System.model.documentData;
import com.example.Document.Management.System.services.documentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
public class documentDataController {
    @Autowired
    private documentDataService documentDataService;

    @PostMapping
    public ResponseEntity<documentData> createDocumentData(@RequestBody documentData documentData) {
        documentData createdDocument = documentDataService.createDocumentData(documentData);
        return ResponseEntity.ok(createdDocument);
    }
    @GetMapping
    public ResponseEntity<List<documentData>> getAllDocumentData(){
        List<documentData> documents = documentDataService.getAllDocumentData();
        return  ResponseEntity.ok(documents);
    }
    @GetMapping("/shelf/{shelfId}")
    public ResponseEntity<List<documentData>> getDocumentDataByShelfId(@PathVariable Long shelfId){
        List<documentData> documents = documentDataService.getDocumentDataByShelfId(shelfId);
        return ResponseEntity.ok(documents);
    }
    @GetMapping("/{id}")
    public ResponseEntity<documentData> getDocumentById(@PathVariable Long id){
        documentData document = documentDataService.getDocumentDataById(id);
        if (document == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(document);
    }
}
