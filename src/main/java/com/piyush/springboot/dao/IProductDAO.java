package com.piyush.springboot.dao;

import java.util.List;

import com.piyush.springboot.entity.Product;


public interface IProductDAO {
    List<Product> getAllProducts();
    Product getProductById(int productId);
    Product getProductByBarcode(String barcode);
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productId);
    boolean productExists(String title, String category);
} 