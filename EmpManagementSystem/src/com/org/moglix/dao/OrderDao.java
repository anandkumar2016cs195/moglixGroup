package com.org.moglix.dao;

import java.util.List;

import com.org.moglix.domain.Orders;

public interface OrderDao {
	public Orders saveOrUpdate(Orders order);

	public Orders getById(Long orderId);

	public List<Orders> getList();

	public void deleteById(Long orderId);
}
