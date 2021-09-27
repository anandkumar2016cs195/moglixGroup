package com.org.moglix.dao;

import java.util.List;

import com.org.moglix.domain.Role;

public interface RoleDao {
	public Role saveOrUpdate(Role Role);

	public Role getById(Long roleId);

	public List<Role> getList();

	public void deleteById(Long roleId);
}
