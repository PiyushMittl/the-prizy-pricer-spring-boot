package com.piyush.springboot.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.piyush.springboot.entity.Product;
@Service
public interface IProductService {
     List<Product> getAllProducts();
     Product getProductById(int articleId);
     Product getProductByBarcode(String barcode);
     boolean productLoader(Product product);
     void updateProduct(Product article);
     void deleteProduct(int articleId);
} 