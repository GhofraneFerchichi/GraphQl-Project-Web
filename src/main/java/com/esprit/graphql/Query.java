package com.esprit.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.esprit.entities.Student;
import com.esprit.repository.StudentRepository;

public class Query implements GraphQLRootResolver {
    private final StudentRepository studentRepository;
    
    public Query(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    public List<Student> allStudents() {
        return studentRepository.getAllStudents();
        
    }
    public Student getStudentbycin(String cin)
	{
		for (Student S:studentRepository.getAllStudents())
		{if (S.getCin().equals(cin))
			
		return S;
		
		}
		return null;
		
		}
}
