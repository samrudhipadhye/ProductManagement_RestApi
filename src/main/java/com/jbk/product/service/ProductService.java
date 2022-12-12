package com.jbk.product.service;

import java.util.List;
import com.jbk.product.entity.Product;

public interface ProductService {
	

	public boolean saveproduct(Product product);
	
	public List<Product> getAllProduct();
	
	public List<Product> getproductById(int productId);
	
	
	public boolean deleteProduct(int productId);
	
	public boolean updateProduct(Product product);
	
	public List<Product> sortProduct();
	
	
	
}
