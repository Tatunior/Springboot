package com.mumo.JDBCdemo;

import com.mumo.JDBCdemo.model.Student;
import com.mumo.JDBCdemo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JdbcDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(JdbcDemoApplication.class, args);
		Student s = context.getBean(Student.class);

		s.setStudNo(101);
		s.setName("Brian");
		s.setMarks(367);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
