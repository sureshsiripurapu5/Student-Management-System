package com.suresh.sms.service;

import java.util.List;

import com.suresh.sms.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
    
    Student saveStudent(Student student);
    
    Student updateStudent(Student student);
    
    Student getStudentById(Integer id);
    
    void deleteStudentById(Integer id);
    //Student updateStudent(Student student);

	//Student getStudentById(Integer id);

	//void updateStudent(Student existingStudent);

	


}
