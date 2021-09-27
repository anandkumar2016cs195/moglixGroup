package com.org.moglix.service;

import java.util.List;

import com.org.moglix.domain.Category;

public interface CategoryService {
	public Category saveOrUpdate(Category category);

	public Category getById(Long categoryId);

	public List<Category> getList();

	public void deleteById(Long categoryId);
}
