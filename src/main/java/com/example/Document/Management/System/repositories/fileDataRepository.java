package com.example.Document.Management.System.repositories;

import com.example.Document.Management.System.model.fileData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface fileDataRepository extends JpaRepository<fileData, Long> {

}
