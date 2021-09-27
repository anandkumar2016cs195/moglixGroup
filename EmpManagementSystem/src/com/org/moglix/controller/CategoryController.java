package com.org.moglix.controller;

import java.util.List;

import com.org.moglix.domain.Category;
import com.org.moglix.service.CategoryService;
import com.org.moglix.service.impl.CategoryServiceImpl;

public class CategoryController {
	CategoryService categoryService = new CategoryServiceImpl();

	public Category saveOrUpdate(Category category) {
		return this.categoryService.saveOrUpdate(category);
	}

	public Category getById(Long categoryId) {
		return this.categoryService.getById(categoryId);
	}

	public List<Category> list() {
		return this.categoryService.getList();
	}

	public void delete(Long categoryId) {
		this.categoryService.deleteById(categoryId);
	}
}
