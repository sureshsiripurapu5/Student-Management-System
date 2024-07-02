package com.suresh.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.suresh.sms.entity.Student;
import com.suresh.sms.repository.StudentRepository;




@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
    @Autowired
    private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		/*Student student1 = new Student(101, "Suresh","Siripurapu","2301050155cse@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student(102,"Siva","Yalakalla","2301050167cse@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student(103,"Teja" ,"Sahoo" , "2301050173cse@gmail.com");
		studentRepository.save(student3);*/
		
	}

}
