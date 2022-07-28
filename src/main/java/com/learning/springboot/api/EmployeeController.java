package com.learning.springboot.api;

import com.learning.springboot.model.Employee;
import com.learning.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("employees/")
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("{id}")
    Employee one(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/add")
    Employee newEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
}
