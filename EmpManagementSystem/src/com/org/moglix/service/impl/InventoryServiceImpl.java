package com.org.moglix.service.impl;

import java.util.List;

import com.org.moglix.dao.InventoryDao;
import com.org.moglix.dao.impl.InventoryDaoImpl;
import com.org.moglix.domain.Inventory;
import com.org.moglix.service.InventoryService;

public class InventoryServiceImpl implements InventoryService {
InventoryDao inventoryDao=new InventoryDaoImpl();
	@Override
	public Inventory saveOrUpdate(Inventory inventory) {
		return inventoryDao.saveOrUpdate(inventory);
	}

	@Override
	public Inventory getById(Long inventoryId) {
		return inventoryDao.getById(inventoryId);
	}

	@Override
	public List<Inventory> getList() {
		return inventoryDao.getList();
	}

	@Override
	public void deleteById(Long inventoryId) {
		inventoryDao.deleteById(inventoryId);
	}

}
