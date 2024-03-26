package com.codingdayo.productstore.service;

import com.codingdayo.productstore.entity.ProductDtl;

import java.util.List;

public interface ProductService {

    List<ProductDtl> findAll();

    ProductDtl findById(int theId);

    void save(ProductDtl theProductDll);

    void deleteById(int theId);
}
