package com.jbk.product.service;//service-business logic

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jbk.product.dao.ProductDao;
import com.jbk.product.entity.Product;
@Service
public class ProductServiceImpl implements ProductService {
  @Autowired
	private ProductDao dao;
	
  @Override
	public boolean saveproduct(Product product) {
		String Id = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new java.util.Date());
		product.setProductId(Id);
		boolean isAdded = dao.saveproduct(product);
	
		return isAdded;
		
	} 	//save product is method of session factory implemented class.
	// left side of object is created by using shift+Alt+L.

	@Override
	public List<Product> getAllProduct() {
	
		return null;
	}

	@Override
	public List<Product> getproductById(int productId) {
		
		return null;
	}

	@Override
	public boolean deleteProduct(int productId) {
		
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		
		return false;
	}

	@Override
	public List<Product> sortProduct() {
		
		return null;
	}



}
