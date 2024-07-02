package com.suresh.sms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.suresh.sms.entity.Student;
import com.suresh.sms.repository.StudentRepository;
import com.suresh.sms.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	private StudentRepository studentRepository;
	
     public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository=studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}


	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
		
	}

}
