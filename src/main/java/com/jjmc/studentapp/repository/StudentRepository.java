package com.jjmc.studentapp.repository;

import com.jjmc.studentapp.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StudentRepository extends MongoRepository<Student,Integer> {

}
