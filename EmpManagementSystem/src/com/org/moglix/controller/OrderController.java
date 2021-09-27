package com.org.moglix.controller;

import java.util.List;

import com.org.moglix.domain.Orders;
import com.org.moglix.service.impl.OrderServiceImpl;

public class OrderController {
	OrderServiceImpl orderService = new OrderServiceImpl();

	public Orders saveOrUpdate(Orders order) {
		return this.orderService.saveOrUpdate(order);
	}

	public Orders getById(Long orderId) {
		return this.orderService.getById(orderId);
	}

	public List<Orders> list() {
		return this.orderService.getList();
	}

	public void delete(Long orderId) {
		this.orderService.deleteById(orderId);
	}
}
