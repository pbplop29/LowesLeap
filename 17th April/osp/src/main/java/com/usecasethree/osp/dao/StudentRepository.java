package com.usecasethree.osp.dao;

import com.usecasethree.osp.entity.Student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {}
