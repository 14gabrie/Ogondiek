package com.example.Document.Management.System.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class documentData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documentDataId;
    private String documentMetaData;
    private Date additionDate;
    private Date RemovalDate;
    private Float size;
    private Float totalFiles;
    private String CreatedBy;
    private String removedBy;
    private String documentStatus;

    @ManyToOne
    @JoinColumn(name = "shelf_id")
    private shelf shelf;

    @OneToMany(mappedBy = "documentData", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<fileData> files = new HashSet<>();

    public documentData(){

    }
    public documentData(Long documentDataId, String documentMetaData, Date additionDate, Date removalDate, Float size, Float totalFiles, String createdBy, String removedBy, String documentStatus, com.example.Document.Management.System.model.shelf shelf, Set<fileData> files) {
        this.documentDataId = documentDataId;
        this.documentMetaData = documentMetaData;
        this.additionDate = additionDate;
        RemovalDate = removalDate;
        this.size = size;
        this.totalFiles = totalFiles;
        CreatedBy = createdBy;
        this.removedBy = removedBy;
        this.documentStatus = documentStatus;
        this.shelf = shelf;
        this.files = files;
    }

    public Long getDocumentDataId() {
        return documentDataId;
    }

    public void setDocumentDataId(Long documentDataId) {
        this.documentDataId = documentDataId;
    }

    public String getDocumentMetaData() {
        return documentMetaData;
    }

    public void setDocumentMetaData(String documentMetaData) {
        this.documentMetaData = documentMetaData;
    }

    public Date getAdditionDate() {
        return additionDate;
    }

    public void setAdditionDate(Date additionDate) {
        this.additionDate = additionDate;
    }

    public Date getRemovalDate() {
        return RemovalDate;
    }

    public void setRemovalDate(Date removalDate) {
        RemovalDate = removalDate;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public Float getTotalFiles() {
        return totalFiles;
    }

    public void setTotalFiles(Float totalFiles) {
        this.totalFiles = totalFiles;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public String getRemovedBy() {
        return removedBy;
    }

    public void setRemovedBy(String removedBy) {
        this.removedBy = removedBy;
    }

    public String getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
    }

    public com.example.Document.Management.System.model.shelf getShelf() {
        return shelf;
    }

    public void setShelf(com.example.Document.Management.System.model.shelf shelf) {
        this.shelf = shelf;
    }

    public Set<fileData> getFiles() {
        return files;
    }

    public void setFiles(Set<fileData> files) {
        this.files = files;
    }
}
