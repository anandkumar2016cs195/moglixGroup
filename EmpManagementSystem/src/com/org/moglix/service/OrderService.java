package com.org.moglix.service;

import java.util.List;

import com.org.moglix.domain.Orders;

public interface OrderService {
	public Orders saveOrUpdate(Orders order);

	public Orders getById(Long orderId);

	public List<Orders> getList();

	public void deleteById(Long orderId);
}
