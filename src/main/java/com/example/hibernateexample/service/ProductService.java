package com.example.hibernateexample.service;

import com.example.hibernateexample.entity.Product;
import com.example.hibernateexample.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product saveProduct(Product product){
        return productRepo.save(product);

    }


    public List<Product> saveAllProduct(List<Product> productList){
        return productRepo.saveAll(productList);

    }


    public List<Product> getProduct(  ){
        return productRepo.findAll();

    }

    public Product getProductById(int pid){
        return productRepo.findById(pid).orElse(null);

    }



    public Product getProductByName(String Name){
        return productRepo.findByName(Name);

    }

    public void deleteAllProduct(){
         productRepo.deleteAll();

    }


    public void deleteProductById(int id ){
        productRepo.deleteById(id);

    }


}
