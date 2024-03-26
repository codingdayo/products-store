package com.codingdayo.productstore.repository;


import com.codingdayo.productstore.entity.ProductDtl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductDtl, Integer> {
    
}
