package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
//not mandatory
@Repository                                         //class,primary key
public interface HomeRepository extends CrudRepository<Student,Integer> {
	public Student findByUnameAndPass(String uname,String pass);

}
