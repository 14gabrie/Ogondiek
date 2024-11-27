package com.example.Document.Management.System.services;

import com.example.Document.Management.System.model.documentData;
import com.example.Document.Management.System.repositories.documentDataRepository;
import com.example.Document.Management.System.repositories.documentDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class documentDataService {
    @Autowired
    private documentDataRepository documentDataRepository;

    public documentData createDocumentData(documentData documentData){
        return documentDataRepository.save(documentData);
    }
    public List<documentData> getAllDocumentData() {
        return documentDataRepository.findAll();
    }
    public List<documentData> getDocumentDataByShelfId(Long shelfId) {
        return documentDataRepository.findByShelf_id(shelfId);
    }
    public documentData getDocumentDataById(Long id) {
        return documentDataRepository.findById(id).orElse(null);
    }
}
