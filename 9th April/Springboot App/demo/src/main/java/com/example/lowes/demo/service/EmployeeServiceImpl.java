package com.example.lowes.demo.service;

import com.example.lowes.demo.dao.DepartmentRepository;
import com.example.lowes.demo.dao.EmployeeRepository;
import com.example.lowes.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;
//It is used to represent a value that may or may not be present.
//In other words, an Optional object can either contain a non-null value (in which case it is considered present)
//or it can contain no value at all (in which case it is considered empty).


//Any method in a servlet class that provides a service to a client.
//There are multiple implementations for a service, and they are called as service providers.
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository empRepo;
    @Autowired
    private DepartmentRepository deptRepo;

    @Override
    public Employee saveEmployee(Employee employee){
        return empRepo.save(employee);
    }
    @Override
    public String getEmployeeById(Integer empId){
        Optional<Employee> emp = empRepo.findById(empId);
        return emp.map(Employee::toString).orElse(null);
    }
    @Override
    public String updateEmployee(Employee employee){
        if(empRepo.existsById(employee.getEmpId())) {
            return empRepo.save(employee).toString();
        }else {
            return null;
        }
    }
    @Override
    public void deleteEmployeeById(Integer empId){
        empRepo.deleteById(empId);
    }
}
