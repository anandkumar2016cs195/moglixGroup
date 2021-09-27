package com.org.moglix.dao;

import java.util.List;

import com.org.moglix.domain.Category;

public interface CategoryDao {
	public String saveOrUpdate(Category category);

	public Category getById(Long categyId);

	public List<Category> getList();

	public String deleteById(Long categoryId);
}
