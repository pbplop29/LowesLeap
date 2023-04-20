package com.example.lowes.demo.service;

import com.example.lowes.demo.model.Employee;
import org.springframework.stereotype.Service;

//Any method in a servlet class that provides a service to a client.
//There are multiple implementations for a service and they are called as service providers.
@Service
public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public String getEmployeeById(Integer empId);
    public String updateEmployee(Employee employee);
    public void deleteEmployeeById(Integer empId);
}
