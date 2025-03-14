package com.EMS.EMS.mapper;

import com.EMS.EMS.dto.EmployeeDto;
import com.EMS.EMS.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }

}
