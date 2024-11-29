package com.example.Document.Management.System.repositories;

import com.example.Document.Management.System.model.documentData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface documentDataRepository extends JpaRepository<documentData, Long>{
    List<documentData> findByShelf_id(Long shelfId);
}
