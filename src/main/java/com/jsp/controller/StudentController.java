package com.jsp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.entity.Student;
import com.jsp.reopsitory.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository sr;
	
	@PostMapping("/savestudent")
	public String insertStudent(@RequestBody Student s) {
		sr.save(s);
		return "Student Saved Successfully";
		
	}
	@GetMapping("/showstudent")
	public Student selectStudent(@RequestParam int id) {
		Optional<Student> s=sr.findById(id);
		return s.get();
		
	}
	@GetMapping("/showall")
	public List<Student> showAllStudent() {
		return sr.findAll();
		
	}
	@PutMapping("/updatestudent")
	public String updateStudent(@RequestBody Student s) {
		sr.save(s);
		return "Student Updated";
	}
	@DeleteMapping("/deletestudent")
	public String deleteStudent(@RequestParam int id) {
		sr.deleteById(id);
		return "Student Deleted";
	}
}
