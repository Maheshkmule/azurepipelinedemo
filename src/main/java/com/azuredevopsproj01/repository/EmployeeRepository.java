package com.azuredevopsproj01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azuredevopsproj01.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


}
