package com.learning.springboot.service;

import com.learning.springboot.dao.EmployeeRepository;
import com.learning.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployeeById(Long id){
        return employeeRepository.findEmployeeById(id);
    }

    public Employee addEmployee(Employee employee){
        return new Employee("Rupesh Khadka", "Devloper");
    }
}
