package com.employees.employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.lang.String;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    Employee findByemailId(String emailId);
}