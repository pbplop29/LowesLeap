package com.example.lowes.demo.service;

import com.example.lowes.demo.dao.DepartmentRepository;
import com.example.lowes.demo.dao.EmployeeRepository;
import com.example.lowes.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;


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
        if(emp.isPresent()) {
            return emp.get().toString();
        }else {
            return null;
        }
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
