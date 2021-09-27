package com.org.moglix.dao;

import java.util.List;

import com.org.moglix.domain.User;

public interface UserDao {
	public String saveOrUpdate(User user);

	public User getById(Long userId);

	public List<User> getList();

	public String deleteById(Long userId);
}
