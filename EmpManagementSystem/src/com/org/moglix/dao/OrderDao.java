package com.org.moglix.dao;

import java.util.List;

import com.org.moglix.domain.Orders;

public interface OrderDao {
	public String saveOrUpdate(Orders order);

	public Orders getById(Long orderId);

	public List<Orders> getList();

	public String deleteById(Long orderId);
}
