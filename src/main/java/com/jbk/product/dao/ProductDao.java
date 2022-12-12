package com.jbk.product.dao;

import java.util.List;
import com.jbk.product.entity.Product;

public interface ProductDao {
	

	public boolean saveproduct(Product product);
	
	public List<Product> getproductById(int productId);
	
	public List<Product> getAllProduct();
	
	public boolean deleteProduct(int productId);
	
	public boolean updateProduct(Product product);
	
	public List<Product> sortProduct();
}
