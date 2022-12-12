package com.jbk.product.dao; //Dao-database logic.

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jbk.product.entity.Product;

@Repository
//if we cant give annotation bin is not created and we cant autowired.
public class ProductDaoImpl implements ProductDao {

@Autowired
private SessionFactory sessionfactory; 
//sessionfactory object created automatically by using autowired.
//sessionfactory used to store database by using session.
	
	@Override
	public boolean saveproduct(Product product) {
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		boolean isAdded= false;
		try { 
			session.save(product);
			transaction.commit();
			isAdded =true;
			
		}
		catch (Exception e){
			e.printStackTrace();
					
	}
		finally {
			if(session!=null) {
		//session !=not equal to null.
				
		session.close();
			}
		}
		return isAdded;
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
	public List<Product> getAllProduct() {
		
		return null;
	}
	@Override
	public List<Product> sortProduct() {
		
		return null;
	}

}
