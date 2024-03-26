package com.codingdayo.productstore.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;



@Entity
@Table(name = "products")
public class ProductDtl {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @NotEmpty(message = "The name cannot be empty is required")
    @Column(name="name")
    private String name;

    @NotEmpty(message = "The brand is required")
    @Column(name="brand")
    private String brand;

    @NotEmpty(message = "The category is required")
    @Column(name="category")
    private String category;
    @Column(name="price")
    private double price;

    @Size(min = 10, message = "The Description should be at least 10 characters")
    @Size(max = 2000, message = "The Description cannot exceed 2000 characters")
    @Column(name="description")
    private String description;


    public ProductDtl(){

    }

    public ProductDtl(int id, String name, String brand, String category, double price, String description) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "ProductDtl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
