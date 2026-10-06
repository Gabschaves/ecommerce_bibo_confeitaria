package com.bibo.ecommerce.services;


import com.bibo.ecommerce.entities.Product;
import com.bibo.ecommerce.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public Product saving (Product product){
        return productRepository.save(product);
    }
    public List<Product> listAll (){
        return productRepository.findAll();
    }
    public List<Product> findingActiveProducts (){
        return productRepository.findByStatusTrue();
    }
}
