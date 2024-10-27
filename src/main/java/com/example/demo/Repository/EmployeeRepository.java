package com.example.demo.Repository;

import com.example.demo.Entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

   ;
    @Procedure(procedureName = "create_employee1")
    void createEmployee(String emp_name, String emp_department, Integer emp_salary);

    //@Procedure(procedureName = "read_employee1")
    @Query(value= "Select read_employee(?1)", nativeQuery = true)
    Optional<Employee> readEmployee(int emp_id);

    @Procedure(procedureName = "update_employee1")
    void updateEmployee(Integer emp_id, String emp_name, String emp_department, Integer emp_salary);

    @Procedure(procedureName = "delete_employee1")
    void deleteEmployee(Integer emp_id);
}