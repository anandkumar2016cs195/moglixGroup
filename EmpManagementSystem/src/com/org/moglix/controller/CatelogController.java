package com.org.moglix.controller;

import java.util.List;

import com.org.moglix.domain.Catalog;
import com.org.moglix.service.CatalogService;
import com.org.moglix.service.impl.CatalogServiceImpl;

public class CatelogController {
	CatalogService catalogService = new CatalogServiceImpl();

	public Catalog saveOrUpdate(Catalog catalog) {
		return this.catalogService.saveOrUpdate(catalog);
	}

	public Catalog getById(Long catalogId) {
		return this.catalogService.getById(catalogId);
	}

	public List<Catalog> list() {
		return this.catalogService.getList();
	}

	public void delete(Long catalogId) {
		this.catalogService.deleteById(catalogId);

	}
}
