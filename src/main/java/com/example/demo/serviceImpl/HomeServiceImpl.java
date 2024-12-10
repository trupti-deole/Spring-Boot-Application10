package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.HomeRepository;
import com.example.demo.serviceI.HomeService;
@Service
public class HomeServiceImpl implements HomeService {
	@Autowired
	HomeRepository repository;

	@Override
	public void saveData(Student stud) {
		// TODO Auto-generated method stub
		System.out.println(stud);
		repository.save(stud);
	}
	@Override
	public Student loginCheck(String uname, String pass) {
		// TODO Auto-generated method stub
		Student st=repository.findByUnameAndPass(uname, pass);
		return st;
//		return "success";
	}
	@Override
	public List<Student> getAlldata() { 
		// TODO Auto-generated method stub
		List<Student> studentList=(List<Student>) repository.findAll();
		return studentList;
	}
	public void deleteData(int rollno)
	{
		repository.deleteById(rollno);
		//return studInfo;
	}
	public Student updateData(int rollno)
	{
	   Optional<Student> op = repository.findById(rollno);  
	   Student st=op.get();
	   return st;
	}
	

}
