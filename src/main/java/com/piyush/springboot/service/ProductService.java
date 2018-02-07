package com.piyush.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.springboot.dao.IProductDAO;
import com.piyush.springboot.entity.Product;
@Service
public class ProductService implements IProductService {
	@Autowired
	private IProductDAO productDAO;
	@Override
	public Product getProductById(int productId) {
		Product obj = productDAO.getProductById(productId);
		return obj;
	}	
	@Override
	public List<Product> getAllProducts(){
		return productDAO.getAllProducts();
	}
	@Override
	public void updateProduct(Product product) {
		productDAO.updateProduct(product);
	}
	@Override
	public void deleteProduct(int productId) {
		productDAO.deleteProduct(productId);
	}
	@Override
	public boolean productLoader(Product product) {
//        if (productDAO.productExists(product.getTitle(), product.getCategory())) {
//            return false;
//        } else {
            productDAO.addProduct(product);
            return true;
//        }
}
	@Override
	public Product getProductByBarcode(String barcode) {
		productDAO.getProductByBarcode(barcode);
		return null;
	}
} 