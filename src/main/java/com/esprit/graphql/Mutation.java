package com.esprit.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.esprit.entities.Student;
import com.esprit.repository.StudentRepository;

public class Mutation implements GraphQLRootResolver {
	  private final StudentRepository studentRepository;

	  public Mutation(StudentRepository studentRepository) {
	    this.studentRepository = studentRepository;
	  }

	  public Student createStudent(String cin, String nompre, String email) {
	    Student student = new Student(cin, nompre, email);
	    studentRepository.saveStudent(student);
	    return student;
	  }
	  public  List<Student> deleteStudent(String cin) {
		   this.studentRepository.deleteStudent(cin);
		  return   this.studentRepository.getAllStudents();
		}
	  public Boolean updateStudent(String cin, String nompre, String email) {
			Student s= new Student(cin,nompre,email);
			int st = this.studentRepository.updateStudent(s);
			if (st==1)
					return true;
			else return false;
		}
	}