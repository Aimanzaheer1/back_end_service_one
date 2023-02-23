package com.service.back_end_service_one;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/add")
    public Product saveProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
    @GetMapping("/all")
    public List<Product> getProduct(){
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return productRepository.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id){
        productRepository.deleteById(id);
        return "Deleted";
    }

    
}
