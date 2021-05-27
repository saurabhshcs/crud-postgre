package com.techsharezone.crud.postgre.repository;

/*
 * @created 27/05/2021 -17:16
 * @project crud-postgre
 * @author  saurabhshcs
 */

import com.techsharezone.crud.postgre.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
