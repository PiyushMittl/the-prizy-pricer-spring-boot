package com.piyush.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.piyush.springboot.entity.Product;
@Transactional
@Repository
public class ProductDAO implements IProductDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	@Override
	public Product getProductById(int productId) {
		return entityManager.find(Product.class, productId);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProducts() {
		String hql = "FROM Product as atcl ORDER BY atcl.productId";
		return (List<Product>) entityManager.createQuery(hql).getResultList();
	}	
	@Override
	public void addProduct(Product product) {
		entityManager.persist(product);
	}
	@Override
	public void updateProduct(Product product) {
		//Product artcl = getProductById(product.getProductId());
		entityManager.flush();
	}
	@Override
	public void deleteProduct(int productId) {
		entityManager.remove(getProductById(productId));
	}
	@Override
	public boolean productExists(String title, String category) {
		String hql = "FROM Product as atcl WHERE atcl.title = ? and atcl.category = ?";
		int count = entityManager.createQuery(hql).setParameter(1, title)
		              .setParameter(2, category).getResultList().size();
		return count > 0 ? true : false;
	}
	@Override
	public Product getProductByBarcode(String barcode) {
		int max=(int)entityManager.createNamedQuery("maxamount").getSingleResult();
		int min=(int)entityManager.createNamedQuery("minamount").setParameter("barcode", barcode).getSingleResult();
		
		
		return null;
	}
} 