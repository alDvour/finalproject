//package com.axis.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.axis.model.Student;
//import com.axis.service.StudentService;
//
//@RestController
//@RequestMapping("/api/v1")
//public class StudentController {
//	
//	@Autowired
//	StudentService studentService;
//
//	@PostMapping("/student")
//	public  ResponseEntity<Student> addStudent(@RequestBody Student student)
//	{
//		Student student1 = studentService.addStudent(student);
//		return new ResponseEntity<Student>(student1, HttpStatus.OK);
//	}
//	
//	@GetMapping("/students")
//	public ResponseEntity<List<Student>> getAllStudents()
//	{
//		List<Student> students = studentService.getAllStudents();
//		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
//	}
//	@GetMapping("/student/{usn}")
//	public ResponseEntity<Student> getStudentByUsn(@PathVariable int usn)
//	{
//		Student student = studentService.getStudentByUsn(usn);
//		return new ResponseEntity<Student>(student, HttpStatus.OK);
//	}
//	
//	@GetMapping("/students/{sem}")
//	public ResponseEntity<List<Student>> getStudentBySem(@PathVariable int sem)
//	{
//		List<Student> students = studentService.getStudentBySem(sem);
//		return new ResponseEntity<List<Student>> (students, HttpStatus.OK);
//	}
//	@GetMapping("/studentsb/{branch}")
//	public ResponseEntity<List<Student>> getStudentByBranch(@PathVariable String branch)
//	{
//		List<Student> students = studentService.getStudentByBranch(branch);
//		return new ResponseEntity<List<Student>> (students, HttpStatus.OK);
//	}
//}
//
