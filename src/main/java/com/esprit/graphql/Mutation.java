package com.esprit.graphql;

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
	  public Student deleteStudent(String cin) {
		  this.studentRepository.deleteStudent(cin);
		  return null;
		}
	  public Boolean updateStudent(String cin, String nompre, String email) {
			Student s= new Student(cin,nompre,email);
			int st = this.studentRepository.updateStudent(s);
			if (st==1)
					return true;
			else return false;
		}
	}