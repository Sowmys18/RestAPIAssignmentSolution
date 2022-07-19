package com.great.employeemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.great.employeemanager.entity.Role;
import com.great.employeemanager.service.RoleServiceImpl;
@RestController
@RequestMapping("/roles")
public class RoleController {
	@Autowired
	private RoleServiceImpl roleService;

	@PostMapping("/addRole")
	public void addRole(@RequestBody Role role) {
		 roleService.addRole(role);
	}

}
