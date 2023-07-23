package com.Ravsaheb.JPAApplicationMethod.Controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;


import org.springframework.stereotype.Controller;

import com.Ravsaheb.JPAApplicationMethod.Service.StudentServiceI;
import com.Ravsaheb.JPAApplicationMethod.model.Student;
@Controller
public class StudentController {
	
	
	@Autowired
	private StudentServiceI studentServiceI;
	
     
	
	   public Student savestudent(Student student) {
       
	   Student studentService = studentServiceI.studentService(student);
	   return studentService;
	   } 
	  public  List<Student> saveAllstudent(List<Student> students){
		  
		     List<Student> saveAllstudent = studentServiceI.saveAllstudent(students);
		     
		       return saveAllstudent;
	  }
	   
	  public Student getstudent(int StudentId) {
		Student student = studentServiceI.getstudent(StudentId);
		  
		  return student;
		  
		  
	  }
	  
	  public List<Student> getMultiplsstudent(List<Integer> ids){
		List<Student> multiplesstudent = studentServiceI.getMultiplesstudent(ids);
		
		  
		  return multiplesstudent;
		  
		  
	  }
	  
	  public boolean RecordExistsOrNot(int StudentId) {
		boolean recordExistsOrNot = studentServiceI.RecordExistsOrNot(StudentId);
		
		  
		  return recordExistsOrNot;
		  
		  
	  }
	  
		public long CountNoOfRecords() {
			
			long countNoOfRecords = studentServiceI.CountNoOfRecords();
			
			return countNoOfRecords;
           
			
	  
}
		public boolean deleteRecordByIdstudent(int Studentid) {
			boolean deleteRecordByIdstudent = studentServiceI.deleteRecordByIdstudent(Studentid);
			
			return deleteRecordByIdstudent;
	
     }
		public boolean deleteRecordAllByIdstudent(int Studentids) {
			boolean deleteRecordAllByIdstudent = studentServiceI.deleteRecordAllByIdstudent(Studentids);
			
			
			return deleteRecordAllByIdstudent;
}	
		public Page<Student> studentPagination() {
			Page<Student> studentPagination = studentServiceI.studentPagination();
			return  studentPagination;
		}	
			public Student getStudentId(int StudentId) {
				Student studentByStudentId = studentServiceI.getStudentByStudentId(StudentId);
				return studentByStudentId;
				
			
}
			public Student getStudentByStudentfname(String Studentfname) {
				
				Student studentByStudentfname = studentServiceI.getStudentByStudentfname(Studentfname);
				
				return studentByStudentfname;
			
			}

}