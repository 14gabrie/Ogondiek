package com.example.Document.Management.System.repositories;

import com.example.Document.Management.System.model.shelf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface shelfRepository extends JpaRepository<shelf, Long> {

    List<shelf> findByShelfCategory_Id(Long shelfCategoryId);
}
