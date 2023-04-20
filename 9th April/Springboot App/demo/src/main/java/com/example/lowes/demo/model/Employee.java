package com.example.lowes.demo.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

// An entity represents a table in a relational database,
// and each entity instance corresponds to a row in that table.
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employee_details")
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empId;
    @Column(name = "name")
    private String empName;
    @Column(name = "salary")
    private Double salary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deptId")
    @Fetch(FetchMode.JOIN)
    private Department department;

    @Override
    public String toString() {
        return "Employee{" + "Id=" + empId + ", Employee Name='" + empName + '\'' + ", Salary=" + salary + ", Department=" + department.getDeptName() + '}';
    }
}
