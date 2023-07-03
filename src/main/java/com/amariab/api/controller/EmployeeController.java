package com.amariab.api.controller;


import com.amariab.api.model.Employees;
import com.amariab.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * Read - Get all employees
     * @return - An Iterable object of Employee full filled
     */
    @GetMapping("/employees")
    public Iterable<Employees> getEmployees() {
        return employeeService.getEmployees();
    }

}
