package com.retail.retail_app.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<String> products = new ArrayList<>();

    public List<String> getAllProducts() {
        return products;
    }

    public String addProduct(String product) {
        products.add(product);
        return "Product added: " + product;
    }

    public String updateProduct(int index, String newProduct) {
        if (index >= 0 && index < products.size()) {
            products.set(index, newProduct);
            return "Product updated at index " + index;
        }
        return "Invalid index";
    }

    public String deleteProduct(int index) {
        if (index >= 0 && index < products.size()) {
            String removed = products.remove(index);
            return "Product removed: " + removed;
        }
        return "Invalid index";
    }
}
