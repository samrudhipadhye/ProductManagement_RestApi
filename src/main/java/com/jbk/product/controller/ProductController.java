package com.jbk.product.controller; 
//works-request mapping and response delegate/dispatch. 
//i.e client response given by controller class.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jbk.product.entity.Product;
import com.jbk.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping(value="/saveproduct")
	public ResponseEntity<Boolean> saveproduct(@RequestBody Product product){
		boolean isAdded = service.saveproduct(product);
		
		if(isAdded) {
			
			return new ResponseEntity<Boolean>(isAdded, HttpStatus.CREATED);//201-created status.	
		}
		else {
			return new ResponseEntity<Boolean>(isAdded, HttpStatus.INTERNAL_SERVER_ERROR);	
			//500-internal server error status from postman.
			
		}
		

	
	}
	
}
