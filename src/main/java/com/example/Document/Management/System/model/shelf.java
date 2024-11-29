package com.example.Document.Management.System.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Shelf")
public class shelf {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column
    private Float totalDocuments;
    @Column
    private Float size;

    @ManyToOne
    @JoinColumn(name = "shelf_category_id", nullable = false)
    private shelfCategory shelfCategory;

    @OneToMany(mappedBy = "shelf", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<documentData> documents = new HashSet<>();

    public shelf (){

    }

    public shelf(Long id, String name, Float totalDocuments, Float size, com.example.Document.Management.System.model.shelfCategory shelfCategory, Set<documentData> documents) {
        this.id = id;
        this.name = name;
        this.totalDocuments = totalDocuments;
        this.size = size;
        this.shelfCategory = shelfCategory;
        this.documents = documents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getTotalDocuments() {
        return totalDocuments;
    }

    public void setTotalDocuments(Float totalDocuments) {
        this.totalDocuments = totalDocuments;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public com.example.Document.Management.System.model.shelfCategory getShelfCategory() {
        return shelfCategory;
    }

    public void setShelfCategory(com.example.Document.Management.System.model.shelfCategory shelfCategory) {
        this.shelfCategory = shelfCategory;
    }

    public Set<documentData> getDocuments() {
        return documents;
    }

    public void setDocuments(Set<documentData> documents) {
        this.documents = documents;
    }
}
