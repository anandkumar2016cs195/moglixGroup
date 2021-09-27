package com.org.moglix.service;

import java.util.List;

import com.org.moglix.domain.Cart;

public interface CartService {
	public Cart saveOrUpdate(Cart cart);

	public Cart getById(Long cartId);

	public List<Cart> getList();

	public void deleteById(Long cartId);
}
