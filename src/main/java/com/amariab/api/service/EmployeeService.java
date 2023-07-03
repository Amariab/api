package com.amariab.api.service;


import com.amariab.api.model.Employees;
import com.amariab.api.repository.EmployeeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Data
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employees> getEmployees(final Long id) {
        return employeeRepository.findById(id);
    }

    public Iterable<Employees> getEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployee(final Long id) {
        employeeRepository.deleteById(id);
    }

    public Employees saveEmployee(Employees employees) {
        Employees savedEmployee = employeeRepository.save(employees);
        return savedEmployee;
    }



}
