package com.example.lowes.demo.service;

import com.example.lowes.demo.model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public String getEmployeeById(Integer empId);
    public String updateEmployee(Employee employee);
    public void deleteEmployeeById(Integer empId);
}
