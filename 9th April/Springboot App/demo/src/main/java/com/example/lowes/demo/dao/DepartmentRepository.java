package com.example.lowes.demo.dao;

import com.example.lowes.demo.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository annotation is used to indicate that the class provides the mechanism for storage, retrieval, search, update
// and delete operation on objects.
@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {}
