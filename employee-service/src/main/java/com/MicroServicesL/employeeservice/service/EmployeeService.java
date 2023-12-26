package com.MicroServicesL.employeeservice.service;

import com.MicroServicesL.employeeservice.dto.ApiResponseDto;
import com.MicroServicesL.employeeservice.dto.EmployeeDto;

public interface EmployeeService
{
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    ApiResponseDto getEmployeeById(Long id);
}
