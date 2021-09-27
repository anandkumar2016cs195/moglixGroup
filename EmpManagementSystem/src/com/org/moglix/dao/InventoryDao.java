package com.org.moglix.dao;

import java.util.List;

import com.org.moglix.domain.Inventory;

public interface InventoryDao {
	public String saveOrUpdate(Inventory inventory);

	public Inventory getById(Long inventoryId);

	public List<Inventory> getList();

	public String deleteById(Long inventoryId);
}
