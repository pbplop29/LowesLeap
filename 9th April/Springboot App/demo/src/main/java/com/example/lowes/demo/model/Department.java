package com.example.lowes.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

// An entity represents a table in a relational database,
// and each entity instance corresponds to a row in that table.
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="department_details")
public class Department {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer deptId;
    @Column(name = "name")
    private String deptName;

    @OneToMany(targetEntity = Employee.class,fetch = FetchType.LAZY,mappedBy = "department")
    private List<Employee> employees;
}
