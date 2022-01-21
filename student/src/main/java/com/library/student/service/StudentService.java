package com.library.student.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.library.student.model.Student;
import com.library.student.repository.StudentRepository;




@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student registerStudent(Student student) {
		return studentRepository.save(student);
		
	}
	
	public List<Student> getStudents() {
		return (List) studentRepository.findAll();
	}
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}
	public Student updateStudent(Student student) {
		Integer rollNumber = student.getRollNumber();
		Student std = studentRepository.findById(rollNumber).get();
		std.setStudentName(student.getStudentName());
		std.setAddress(student.getAddress());
		std.setBookName(student.getBookName());
		return studentRepository.save(std);
		
	}
	
	}

