package com.example.Document.Management.System.repositories;

import com.example.Document.Management.System.model.shelfCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface shelfCategoryRepository extends JpaRepository<shelfCategory, Long> {

}
