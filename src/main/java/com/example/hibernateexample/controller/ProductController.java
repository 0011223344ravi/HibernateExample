package com.example.hibernateexample.controller;

import com.example.hibernateexample.entity.Product;
import com.example.hibernateexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService  productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody  Product product){
        return productService.saveProduct(product);

    }

    @PostMapping("/addAllProduct")
    public List<Product> addAllProduct(@RequestBody List<Product> productList){
        return productService.saveAllProduct(productList);

    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts(  ){
        return productService.getProduct();

    }
    @GetMapping("/productById/{id}")
    public Product getProductById(@PathVariable int pid){
        return productService.getProductById(pid);

    }


    @GetMapping("/getProductByName/{Name}")
    public Product getProductByName(@PathVariable String Name){
        return productService.getProductByName(Name);

    }
    @DeleteMapping("/deleteAllProduct")
    public void deleteAllProduct(){
        productService.deleteAllProduct();

    }

    @DeleteMapping("/deleteProductById")
    public void deleteProductById(int id ){
        productService.deleteProductById(id);

    }

}
