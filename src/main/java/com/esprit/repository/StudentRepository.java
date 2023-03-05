package com.esprit.repository;

import java.util.ArrayList;
import java.util.List;

import com.esprit.entities.Student;

public class StudentRepository {
    private final List<Student> students;

    public StudentRepository() {
        students = new ArrayList<>();
        students.add(new Student("123", "ghof fer", "ghofrane@esprit.tn"));
        students.add(new Student("456", "foulen bn", "foulen@esprit.tn"));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void saveStudent(Student student) {
        students.add(student);
    }
    public boolean addStudent(Student S) {
		return students.add(S);}
	
	public Student getStudentbycin(String cin)
	{
		for (Student S:students)
		{if (S.getCin().equals(cin))
			
		return S;
		
		}
		return null;
		
		}
	public void deleteStudent(String cin) {
		Student s = this.getStudentbycin(cin);
		this.students.remove(s);
		
		
	}
	public int updateStudent(Student s) {
		Student st = getStudentbycin(s.getCin());	
		int i = students.indexOf(st);
		if(i!=-1) {
			this.students.set(i, s);
			return 1;
		}
		return 0;
	
	}
}
