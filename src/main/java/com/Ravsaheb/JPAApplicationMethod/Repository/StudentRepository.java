package com.Ravsaheb.JPAApplicationMethod.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.Ravsaheb.JPAApplicationMethod.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student ,Integer > {

	
	
	public Student findByStudentId(int StudnetId);
	
	public Student findByStudentfname(String studentfname);
}
