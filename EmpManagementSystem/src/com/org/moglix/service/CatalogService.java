package com.org.moglix.service;

import java.util.List;

import com.org.moglix.domain.Catelog;

public interface CatalogService {
	public Catelog saveOrUpdate(Catelog catelog);

	public Catelog getById(Long catelogId);

	public List<Catelog> getList();

	public void deleteById(Long catelogId);
}
