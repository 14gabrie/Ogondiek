package com.example.Document.Management.System.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class fileData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documentId;
    private String title;
    private String author;
    private String fileType;
    private Date createdAt;
    private Date updatedAt;
    private Date removedAt;
    private String CreatedBy;
    private String removedBy;
    private Float size;
    private Float version;

    @ManyToOne
    @JoinColumn(name = "document_data_id", nullable = false)
    private documentData documentData;
    public fileData(){

    }

    public fileData(Long documentId, String title, String author, String fileType, Date createdAt, Date updatedAt, Date removedAt, String createdBy, String removedBy, Float size, Float version, com.example.Document.Management.System.model.documentData documentData) {
        this.documentId = documentId;
        this.title = title;
        this.author = author;
        this.fileType = fileType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.removedAt = removedAt;
        CreatedBy = createdBy;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getRemovedAt() {
        return removedAt;
    }

    public void setRemovedAt(Date removedAt) {
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
