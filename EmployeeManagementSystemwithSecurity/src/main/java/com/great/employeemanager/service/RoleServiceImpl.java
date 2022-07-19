package com.great.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.great.employeemanager.entity.Role;
import com.great.employeemanager.repository.RoleRepository;

@Service
public class RoleServiceImpl {

	@Autowired
	private RoleRepository roleRepository;
	
	public void addRole(Role role) {
		roleRepository.save(role);
	}
}
