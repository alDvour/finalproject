//package com.axis.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.axis.exception.InvalidSemException;
//import com.axis.model.Student;
//import com.axis.repository.StudentRepository;
//import com.axis.utils.AppConstants;
//
//@Service
//public  class StudentServiceImpl implements StudentService{
//	
//	@Autowired
//	StudentRepository studentRepository;
//
//	@Override
//	public Student addStudent(Student student) {
//		if(student.getSem()> 8)
//			throw new InvalidSemException(AppConstants.INVALID_SEM_MESSAGE);
//		return studentRepository.save(student);
//	}
//
//	@Override
//	public List<Student> getAllStudents() {
//		return studentRepository.findAll();
//	}
//
//	@Override
//	public Student getStudentByUsn(int usn) {
//		return studentRepository.findByUsn(usn);
//	}
//
//	@Override
//	public Student findByUsn(int usn) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public List<Student> getStudentBySem(int sem) {
//		return studentRepository.findBySem(sem);
//	}
//	@Override
//	public List<Student> getStudentByBranch(String branch) {
//		return studentRepository.findByBranch(branch);
//	}
//
//}
