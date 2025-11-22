package com.example.KD_Store.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "prodcuts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    // TODO :: add createdAt & updatedAt
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(length = 2500)
    private String description;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private Double price;
    @Column(nullable = false)
    private Integer stock = 0;
    @ElementCollection
    @CollectionTable(name = "product_images", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "img_url", length = 500)
    private List<String> imgUrls = new ArrayList<>();
    @ElementCollection
    @CollectionTable(name = "product_sizes", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "size", length = 500)
    private List<String> sizes = new ArrayList<>();
}
