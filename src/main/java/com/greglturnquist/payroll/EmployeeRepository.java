package com.greglturnquist.payroll;

import org.springframework.data.jpa.repository.JpaRepository;
// class we are inheriting mehtods from and using directly without overriding any of these methods:
import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepository extends CrudRepository<Employee, Long> { //(1)

}