package com.org.moglix.service.impl;

import java.util.List;

import com.org.moglix.dao.CatalogDao;
import com.org.moglix.dao.impl.CatalogDaoImpl;
import com.org.moglix.domain.Catalog;
import com.org.moglix.service.CatalogService;

public class CatalogServiceImpl implements CatalogService{
CatalogDao catalogService=new CatalogDaoImpl();
	@Override
	public String saveOrUpdate(Catalog catelog) {
		return catalogService.saveOrUpdate(catelog);
	}

	@Override
	public Catalog getById(Long catelogId) {
		return catalogService.getById(catelogId);
	}

	@Override
	public Catalog[] getList() {
		return catalogService.getList();
	}

	@Override
	public String  deleteById(Long catelogId) {
	return 	catalogService.deleteById(catelogId);		
	}

}
