package com.wocwithoneclick.wocwithoneclick.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wocwithoneclick.wocwithoneclick.Models.Product;
import com.wocwithoneclick.wocwithoneclick.Repositories.ProductRepository;

@Service
public class ProductServiceImpl {

	@Autowired
	private ProductRepository productRepository;
	
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	   }


	   public Product getProduct(long productId) {
	       return productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Not Found"));
	   }


	   public List<Product> getProducts() {
	       return (List<Product>) productRepository.findAll();
	   }


	   public Product updateProduct(long productId, Product product) {
	       Product existingProduct = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Not Found"));
	       existingProduct.setTitle(product.getTitle());
	       existingProduct.setPrice(product.getPrice());
	       existingProduct.setActive(product.isActive());
	       existingProduct.setCategoryId(product.getCategoryId());
	       existingProduct.setBase64Image(product.getBase64Image());
	       existingProduct.setDescription(product.getDescription());
	       existingProduct.setSubTitle(product.getSubTitle());
	       existingProduct.setUserId(product.getUserId());
	       existingProduct.setProductId(product.getProductId());
	       productRepository.save(existingProduct);
	       return existingProduct;
	   }


	   public Product deleteproduct(long productId) {
	       Product existingProduct = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Not Found"));
	       productRepository.deleteById(productId);
	       return existingProduct;
	   }


	   public List<Product> getProductsByUser(long userId) {
	       return productRepository.getProductsById(userId);
	   }
}
