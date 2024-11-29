package com.example.Document.Management.System.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "shelf_category")
public class shelfCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String abbreviation;
    @Column(nullable = false)
    private String status;
    @Column(name = "created_at")
    private LocalDate createdAt;
    @Column(name = "updated_at")
    private LocalDate updatedAt;


    //Relationship with shelf
    @OneToMany(mappedBy = "shelfCategory", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<shelf> shelves = new HashSet<>();

    public shelfCategory(){

    }

    public shelfCategory(Long id, String name, String abbreviation, String status, LocalDate createdAt, LocalDate updatedAt, Set<shelf> shelves) {
        this.id = id;
        this.name = name;
        this.abbreviation = abbreviation;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.shelves = shelves;
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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Set<shelf> getShelves() {
        return shelves;
    }

    public void setShelves(Set<shelf> shelves) {
        this.shelves = shelves;
    }
}

