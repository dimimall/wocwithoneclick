package com.wocwithoneclick.wocwithoneclick.Controllers;

import java.util.List;
import java.util.Optional;

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

import com.wocwithoneclick.wocwithoneclick.Models.Category;
import com.wocwithoneclick.wocwithoneclick.Services.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@PostMapping("/addcategory") 
	public ResponseEntity<Category> addCategory(@RequestBody Category category) {
		return new ResponseEntity<>(categoryService.saveCategory(category), HttpStatus.OK);
	}
	
	@GetMapping("/findallcategories")
	public List<Category> getAllCategories() {
		return categoryService.getAllCategories();
	}
	
	@GetMapping("/findcategorybyid/{Id}")
	public ResponseEntity<Optional<Category>> getCategory(@PathVariable long Id) {
		return new ResponseEntity<>(categoryService.getCategoryById(Id), HttpStatus.OK);
	}
	
	@PutMapping("/category")
	public ResponseEntity<Category> updateCategory(@PathVariable long Id, @RequestBody Category category){
		return new ResponseEntity<>(categoryService.updateCategory(Id, category), HttpStatus.OK);
	}
	
	@DeleteMapping("deletecategory/{Id}")
	public ResponseEntity<Category> deleteCategory(@PathVariable long Id) {
		return new ResponseEntity<>(categoryService.deleteCategory(Id), HttpStatus.OK);
	}
}
