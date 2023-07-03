package com.amariab.api.repository;

import com.amariab.api.model.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Long> {

}