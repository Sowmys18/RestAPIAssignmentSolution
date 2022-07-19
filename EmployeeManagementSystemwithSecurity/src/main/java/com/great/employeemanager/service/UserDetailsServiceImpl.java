package com.great.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.great.employeemanager.repository.UserRepository;
import com.great.employeemanager.security.MyUserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if(userRepository.getUserByUsername(username) == null) {
			throw new UsernameNotFoundException("user not found");
		}
		return new MyUserDetails(userRepository.getUserByUsername(username));
	}
	
	

}
