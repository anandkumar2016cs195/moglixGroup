package com.org.moglix.controller;

import java.util.List;

import com.org.moglix.domain.Role;
import com.org.moglix.service.RoleService;
import com.org.moglix.service.impl.RoleServiceImpl;

public class RoleController {
	RoleService roleService = new RoleServiceImpl();

	public Role saveOrUpdate(Role role) {
		return this.roleService.saveOrUpdate(role);
	}

	public Role getById(Long roleId) {
		return this.roleService.getById(roleId);
	}
	public List<Role> list(){
		return this.roleService.getList();
	}
	public void delete (Long roleId) {
		this.roleService.deleteById(roleId);
	}
}
