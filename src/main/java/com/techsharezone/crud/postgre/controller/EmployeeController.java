package com.techsharezone.crud.postgre.controller;

/*
 * @created 27/05/2021 -17:19
 * @project crud-postgre
 * @author  saurabhshcs
 */

import com.techsharezone.crud.postgre.model.Employee;
import com.techsharezone.crud.postgre.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }
}
