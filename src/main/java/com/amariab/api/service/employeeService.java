package com.amariab.api.service;


import com.amariab.api.repository.EmployeeRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class employeeService {

    private EmployeeRepository employeeRepository;


}
