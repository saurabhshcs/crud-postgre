package com.techsharezone.crud.postgre.model;

/*
 * @created 27/05/2021 -17:13
 * @project crud-postgre
 * @author  saurabhshcs
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private Long id;
    private String name;
    private String department;
}
