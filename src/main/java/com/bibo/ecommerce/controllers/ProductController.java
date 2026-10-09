package com.bibo.ecommerce.controllers;

import com.bibo.ecommerce.entities.Product;
import com.bibo.ecommerce.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/products")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public Product savingProduct(@RequestBody Product product){
        return productService.saving(product);
    }
    @GetMapping
    public List<Product> findAll(){
        return productService.listAll();
    }
    @GetMapping("/actives")
    public List<Product> findAllByStatusTrue(){
        return productService.findingActiveProducts();
    }
}
