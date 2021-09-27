package com.org.moglix.dao;

import com.org.moglix.domain.Catalog;

public interface CatalogDao {
	public String saveOrUpdate(Catalog catelog);

	public Catalog getById(Long catelogId);

	public Catalog[] getList();

	public String  deleteById(Long catelogId);
}
