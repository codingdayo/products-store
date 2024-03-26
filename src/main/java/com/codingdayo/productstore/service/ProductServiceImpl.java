package com.codingdayo.productstore.service;

import com.codingdayo.productstore.entity.ProductDtl;
import com.codingdayo.productstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;


    @Autowired
    public void EmployeeServiceImpl(ProductRepository theProductRepository) {
        productRepository = theProductRepository;
    }

    @Override
    public List<ProductDtl> findAll() {

        return productRepository.findAll();
    }

    @Override
    public ProductDtl findById(int theId) {
            Optional<ProductDtl> result = productRepository.findById(theId);

        ProductDtl theProductDtl = null;

        if (result.isPresent()) {
            theProductDtl = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theProductDtl;
    }

    @Override

    public void save(ProductDtl theProductDtl) {

 productRepository.save(theProductDtl);
    }


    @Override
    public void deleteById(int theId) {

        productRepository.deleteById(theId);
    }

}
