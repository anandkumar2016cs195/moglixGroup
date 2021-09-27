package com.org.moglix.service;

import java.util.List;

import com.org.moglix.domain.User;

public interface UserService {
	public User saveOrUpdate(User user);

	public User getById(Long userId);

	public List<User> getList();

	public void deleteById(Long userId);
}
