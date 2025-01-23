package com.wocwithoneclick.wocwithoneclick.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wocwithoneclick.wocwithoneclick.Models.Category;
import com.wocwithoneclick.wocwithoneclick.Repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}
	
	public Optional<Category> getCategoryById(long categoryId) {
		return categoryRepository.findById(categoryId);
	}
	
	public Category updateCategory(long categoryId, Category category) {
		Category existingCategory = categoryRepository.findById(categoryId).orElseThrow(() -> new RuntimeException("Not Fount"));
		existingCategory.setCategoryID(category.getCategoryID());
		existingCategory.setCategoryName(category.getCategoryName());
		categoryRepository.save(existingCategory);
		return existingCategory;
	}
	
	public Category deleteCategory(long categoryId) {
		Category existingCategory = categoryRepository.findById(categoryId).orElseThrow(() -> new RuntimeException("Not Found"));
		categoryRepository.deleteById(categoryId);
	    return existingCategory;
	}
}
