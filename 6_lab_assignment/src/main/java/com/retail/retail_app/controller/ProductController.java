package com.retail.retail_app.controller;

import com.retail.retail_app.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<String> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public String addProduct(@RequestBody String product) {
        return productService.addProduct(product);
    }

    @PutMapping("/{index}")
    public String updateProduct(@PathVariable int index, @RequestBody String newProduct) {
        return productService.updateProduct(index, newProduct);
    }

    @DeleteMapping("/{index}")
    public String deleteProduct(@PathVariable int index) {
        return productService.deleteProduct(index);
    }
}