package com.graymatter.dto;

import org.springframework.stereotype.Component;

import com.graymatter.entities.Student;

@Component
public class StudentMapper {
	
	public Student mapToStudent(StudentDto studentDto) {

		return new Student(studentDto.getName(), studentDto.getId());
		
	}

	
	public StudentDto mapToStudentDto(Student student) {
		
		return new StudentDto(student.getName(), student.getId());

		
	}
}
