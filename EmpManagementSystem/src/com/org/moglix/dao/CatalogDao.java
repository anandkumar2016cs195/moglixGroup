package com.org.moglix.dao;

import java.util.List;

import com.org.moglix.domain.Catelog;

public interface CatalogDao {
	public Catelog saveOrUpdate(Catelog catelog);

	public Catelog getById(Long catelogId);

	public List<Catelog> getList();

	public void deleteById(Long catelogId);
}
