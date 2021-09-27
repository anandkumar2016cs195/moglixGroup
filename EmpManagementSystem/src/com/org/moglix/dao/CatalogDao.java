package com.org.moglix.dao;

import java.util.List;

import com.org.moglix.domain.Catalog;

public interface CatalogDao {
	public Catalog saveOrUpdate(Catalog catelog);

	public Catalog getById(Long catelogId);

	public List<Catalog> getList();

	public void deleteById(Long catelogId);
}
