package com.example.demo.service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void createEmployee(String name, String department, Integer salary) {
         employeeRepository.createEmployee(name, department, salary);
    }

    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.readEmployee(id);
    }

    public void updateEmployee(Integer id, String name, String department, Integer salary) {
        employeeRepository.updateEmployee(id, name, department, salary);
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteEmployee(id);
    }
}