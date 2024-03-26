package com.codingdayo.productstore.controller;
import com.codingdayo.productstore.entity.ProductDtl;
import com.codingdayo.productstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;


import java.util.List;


@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    public ProductController(ProductService theProductService) {

        productService = theProductService;
    }

    @GetMapping({"", "/"})
    public String showProducts(Model theModel){

        List<ProductDtl> products = productService.findAll();

        theModel.addAttribute("productDtl", products);

        return "index";
    }

    @GetMapping("/create")
    public String showCreatePage(Model theModel){

        ProductDtl productDtl = new ProductDtl();

        theModel.addAttribute("productDtl", productDtl);

        return "createProduct";

    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") ProductDtl productDtl) {


        productService.save(productDtl);


        return "redirect:/products/";
    }

//    To update form
@GetMapping("/update")

public String updateProduct(@RequestParam("productId") int id, Model theModel){


    ProductDtl theProductDtl = productService.findById(id);

    theModel.addAttribute("productDtl", theProductDtl);

    //send over to our form
    return "createProduct";
}



    //to delete from form
    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("productId") int id, Model theModel){

        productService.deleteById(id);


        //send over to our form
        return "redirect:/products/";
    }



}
