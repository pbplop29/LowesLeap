package com.example.lowes.demo.controller;

import com.example.lowes.demo.model.Employee;
import com.example.lowes.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//This annotation is applied to a class to mark it as a request handler.
//Spring RestController annotation is used to create RESTful web services using Spring MVC.
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService empService;

    //http://localhost:8080/saveEmployee
    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        Employee emp = empService.saveEmployee(employee);
        return emp;
    }
    //http://localhost:8080/getEmployeeByIdUsingRequestParam?empId=1
    @GetMapping("/getEmployeeByIdUsingRequestParam")
    public String getEmployeeByIdUsingRequestParam(@RequestParam("empId") Integer empId) {
        return empService.getEmployeeById(empId);
    }
    //http://localhost:8080/updateEmployee
    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){
        return empService.updateEmployee(employee);
    }
    //http://localhost:8080/deleteEmployee/1
    @GetMapping("/deleteEmployee/{empId}")
    public void deleteEmployeeById(@PathVariable("empId") Integer empId){
        empService.deleteEmployeeById(empId);
    }
}
