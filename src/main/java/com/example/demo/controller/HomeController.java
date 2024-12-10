package com.example.demo.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Student;
import com.example.demo.serviceI.HomeService;

@Controller
public class HomeController {
	@Autowired
	private HomeService service;

	@RequestMapping(value = "/")
	public String landingPage() {
		return "index";
	}

	@RequestMapping(value = "/log")
	public String logPage() {
		return "login";
	}

	@RequestMapping(value = "/login")
	public String loginPage(@RequestParam String uname, @RequestParam String pass, Model m) {
		Student st = service.loginCheck(uname, pass);
		if (st != null) {
			List<Student> stuList = service.getAlldata();
			System.out.println(stuList);
			m.addAttribute("data", stuList);
			return "success";
		}
		return "login";

	}

	@RequestMapping(value = "/reg")
	public String regPage() {
		return "register";
	}

	@RequestMapping(value = "/register")
	public String registerPage(@ModelAttribute Student stud, Model m) {
		System.out.println("In controller:" + stud);
		service.saveData(stud);
		return "login";
	}

	@RequestMapping(value = "/delete")
	public String deleteData(@RequestParam int rollno, Model m) {
		service.deleteData(rollno);
		List<Student> stuList = service.getAlldata();
		m.addAttribute("data", stuList);
		return "success";
	}

	@RequestMapping(value = "/update")
	public String updateData(@RequestParam int rollno, Model m) {
		Student stUpdate = service.updateData(rollno);
//		m.addAttribute(attributeValue)
		m.addAttribute("data", stUpdate);

		return "edit";
	}

	@RequestMapping(value = "/edit")
	public String editData(@ModelAttribute Student studInfo, Model m) {
		service.saveData(studInfo);
		List<Student> stuList = service.getAlldata();
		m.addAttribute("data", stuList);
		return "success";
	}

	public String checkEvenNo() {
		int no;
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		return null;

	}

	public String checkPrimeNo() {
		int no;

		return null;
	}

	public String checkOddNo() {
		int no;
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
        if(no%2 != 0)
        {
        	System.out.println("Enter number is odd");
        }
        else
        {
        	System.out.println("Enter no is even");
        }
		return null;

	}

}
