package com.example.demo.serviceI;

import java.util.List;

import com.example.demo.model.Student;


public interface HomeService {

	void saveData(Student stud);

	Student loginCheck(String uname, String pass);

	List<Student> getAlldata();

	void deleteData(int rollno);

	Student updateData(int rollno);

	

}
