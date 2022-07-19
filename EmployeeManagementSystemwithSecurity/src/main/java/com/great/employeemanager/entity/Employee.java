package com.great.employeemanager.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//@Component
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Table(name="Employee")
public class Employee {
	@Id
	private long employeeId;
	private String firstName;
	private String lastName;
	private String email;
}