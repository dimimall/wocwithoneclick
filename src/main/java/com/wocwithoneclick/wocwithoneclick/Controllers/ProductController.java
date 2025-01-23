package com.wocwithoneclick.wocwithoneclick.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wocwithoneclick.wocwithoneclick.Models.Product;
import com.wocwithoneclick.wocwithoneclick.Services.ProductServiceImpl;


@RestController
public class ProductController {

	@Autowired
	ProductServiceImpl productServicelmpl;
	
	@PostMapping("/addproduct")
	public  ResponseEntity<Product> addProduct(@RequestBody Product product) {
		return new  ResponseEntity<>(productServicelmpl.saveProduct(product), HttpStatus.OK);
	}
	
	@GetMapping("/findproductsbyuserid/{userId}") 
	public ResponseEntity<List<Product>> getAllProductsById(@PathVariable long userId) {
		return new ResponseEntity<>(productServicelmpl.getProductsByUser(userId), HttpStatus.OK);
	}
	
	@GetMapping("/findproductbyid/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable long id) {
		Product product = productServicelmpl.getProduct(id);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	@PutMapping("/updateProduct/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable long id, @RequestBody Product product) {
		Product updatedProduct = productServicelmpl.updateProduct(id, product);
	    return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteproduct/{id}")
	public ResponseEntity<Product> deleteProduct(@PathVariable long id) {
		Product deleteProduct = productServicelmpl.deleteproduct(id);
		return new ResponseEntity<>(deleteProduct,HttpStatus.OK);
	}
	
}
