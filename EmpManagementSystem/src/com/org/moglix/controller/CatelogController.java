package com.org.moglix.controller;

import java.util.List;

import com.org.moglix.domain.Catalog;
import com.org.moglix.service.CatalogService;
import com.org.moglix.service.impl.CatalogServiceImpl;

public class CatelogController {
	CatalogService catalogService = new CatalogServiceImpl();

	public String saveOrUpdate(Catalog catalog) {
		return this.catalogService.saveOrUpdate(catalog);
	}

	public Catalog getById(Long catalogId) {
		return this.catalogService.getById(catalogId);
	}

	public Catalog[] list() {
		return this.catalogService.getList();
	}

	public String delete(Long catalogId) {
		return this.catalogService.deleteById(catalogId);

	}
}
