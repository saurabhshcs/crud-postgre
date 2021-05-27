package com.techsharezone.crud.postgre.services;

/*
 * @created 27/05/2021 -17:17
 * @project crud-postgre
 * @author  saurabhshcs
 */

import com.techsharezone.crud.postgre.model.Employee;
import com.techsharezone.crud.postgre.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee save(Employee employee) {
        return repository.save(employee);
    }
}
