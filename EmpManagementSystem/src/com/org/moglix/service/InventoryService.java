package com.org.moglix.service;

import java.util.List;

import com.org.moglix.domain.Inventory;

public interface InventoryService {
	public Inventory saveOrUpdate(Inventory inventory);

	public Inventory getById(Long inventoryId);

	public List<Inventory> getList();

	public void deleteById(Long inventoryId);
}
