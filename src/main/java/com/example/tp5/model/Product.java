package com.example.tp5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "pro_id")
    private String id;
    @Column(name = "pname")

    private String name;
    @Column(name = "pdesription")

    private String description;
    @Column(name = "pprice")

    private BigDecimal price;
}
