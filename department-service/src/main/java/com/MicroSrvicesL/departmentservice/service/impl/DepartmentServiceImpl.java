package com.MicroSrvicesL.departmentservice.service.impl;

import com.MicroSrvicesL.departmentservice.dto.DepartmentDto;
import com.MicroSrvicesL.departmentservice.entity.Department;
import com.MicroSrvicesL.departmentservice.repository.DepartmentRepository;
import com.MicroSrvicesL.departmentservice.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;
    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto)
    {
        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
        );

        Department savedDepartment =departmentRepository.save(department);

        DepartmentDto savedDepartmentDto = new DepartmentDto(
                savedDepartment.getId(),
                savedDepartment.getDepartmentName(),
                savedDepartment.getDepartmentDescription(),
                savedDepartment.getDepartmentCode()
        );
        return savedDepartmentDto;
    }

}
