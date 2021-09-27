package com.org.moglix.controller;

import java.util.List;

import com.org.moglix.domain.Cart;
import com.org.moglix.service.CartService;
import com.org.moglix.service.impl.CartServiceImpl;

public class CartController {
	CartService cartSevice = new CartServiceImpl();

	public Cart saveOrUpdate(Cart cart) {
		return this.cartSevice.saveOrUpdate(cart);
	}

	public Cart getById(Long cartId) {
		return this.cartSevice.getById(cartId);
	}

	public List<Cart> list() {
		return this.cartSevice.getList();
	}

	public void delete(Long cartId) {
		this.cartSevice.deleteById(cartId);
	}
}
