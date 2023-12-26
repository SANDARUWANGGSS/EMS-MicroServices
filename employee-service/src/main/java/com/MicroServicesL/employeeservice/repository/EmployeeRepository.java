package com.MicroServicesL.employeeservice.repository;

import com.MicroServicesL.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long>  {
}
