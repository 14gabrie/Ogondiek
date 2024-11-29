package com.example.Document.Management.System.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "file_data")
public class fileData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documentId;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private String fileType;
    @Column(nullable = false)
    private LocalDate createdAt;
    @Column(nullable = false)
    private LocalDate updatedAt;
    @Column
    private LocalDate removedAt;
    @Column(nullable = false)
    private String CreatedBy;
    @Column
    private String removedBy;
    @Column(nullable = false)
    private Float size;
    @Column(nullable = false)
    private Float version;

    @ManyToOne
    @JoinColumn(name = "document_data_id", nullable = false)
    private documentData documentData;
    public fileData(){

    }

    public fileData(Long documentId, String title, String author, String fileType, LocalDate createdAt, LocalDate updatedAt, LocalDate removedAt, String createdBy, String removedBy, Float size, Float version, com.example.Document.Management.System.model.documentData documentData) {
        this.documentId = documentId;
        this.title = title;
        this.author = author;
        this.fileType = fileType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.removedAt = removedAt;
        this.CreatedBy = createdBy;
        this.removedBy = removedBy;
        this.size = size;
        this.version = version;
        this.documentData = documentData;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDate getRemovedAt() {
        return removedAt;
    }

    public void setRemovedAt(LocalDate removedAt) {
        this.removedAt = removedAt;
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

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public Float getVersion() {
        return version;
    }

    public void setVersion(Float version) {
        this.version = version;
    }

    public com.example.Document.Management.System.model.documentData getDocumentData() {
        return documentData;
    }

    public void setDocumentData(com.example.Document.Management.System.model.documentData documentData) {
        this.documentData = documentData;
    }

}
