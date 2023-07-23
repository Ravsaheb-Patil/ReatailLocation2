package com.Ravsaheb.JPAApplicationMethod.Service;

import java.util.List;



import org.springframework.data.domain.Page;

import com.Ravsaheb.JPAApplicationMethod.model.Student;

public interface StudentServiceI {
	
	public Student studentService(Student student);
	
	List<Student>  saveAllstudent(List<Student> student);
	
	public List<Student> sortingStudent();
	
	
	public Student getStudentId(int StudentId);
	
	
	public Student getstudent(int StudentId);
	
	public List<Student>  getMultiplesstudent(List<Integer> ids);
	
	boolean  RecordExistsOrNot(int StudentId);
	
	public long CountNoOfRecords();
	
	public boolean deleteRecordByIdstudent(int Studentid);
	
	public boolean deleteRecordAllByIdstudent(int Studentids);
   
	public Page<Student>  studentPagination();
	
	public Student getStudentByStudentId(int StudnetId);
	
	public Student getStudentByStudentfname(String Studentfname);
	
	
	
	
}