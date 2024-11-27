package com.example.Document.Management.System.repositories;

import com.example.Document.Management.System.model.shelf;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface shelfRepository extends JpaRepository<shelf, Long> {

    List<shelf> findByShelfCategory_Id(Long shelfCategoryId);
}
