package com.example.Document.Management.System.repositories;

import com.example.Document.Management.System.model.documentData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface documentDataRepository extends JpaRepository<documentData, Long> {

    List findByShelf_id(Long shelfId);
}
