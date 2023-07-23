package com.Ravsaheb.JPAApplicationMethod;





import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.Ravsaheb.JPAApplicationMethod.Controller.StudentController;
import com.Ravsaheb.JPAApplicationMethod.model.Student;

@SpringBootApplication
public class JpaRepositoryprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(JpaRepositoryprojectApplication.class, args);
		StudentController controller = run.getBean(StudentController.class);
		
	   //     Student stu=new Student();
		
	//		stu.setStudentfname("Ravsaheb");
	//		stu.setStudentlname("Patil");
	//	    stu.setStudentaddress("Kanhere");
	//		stu.setStudentemail("ravsaheb@123");
		//	stu.setStudentpass("ravsa123");
		 //   stu.setStudentrollno(1);
		
		//	controller.savestudent(stu);
		
		

//	        Student stu1=new Student();
//		
//			stu1.setStudentfname("sunil");
//			stu1.setStudentlname("Patil");
//		    stu1.setStudentaddress("pune");
//			stu1.setStudentemail("sunil@123");
//			stu1.setStudentpass("sunil123");
//		   
//		
//		
//
//	        Student stu2=new Student();
//		
//			stu2.setStudentfname("Rav");
//			stu2.setStudentlname("Patil");
//		    stu2.setStudentaddress("dhule");
//			stu2.setStudentemail("rav@123");
//			stu2.setStudentpass("rav123");
//		   
//		
//		
//
     //   Student stu3=new Student();
	
		//	stu3.setStudentfname("prasant");
		//	stu3.setStudentlname("Patil");
		//    stu3.setStudentaddress("kalkheda");
		//	stu3.setStudentemail("prasant@123");
		//	stu3.setStudentpass("prasant123");
		    
		
		    

	  //      Student stu4=new Student();
		
	//		stu4.setStudentfname("vasant");
	//		stu4.setStudentlname("Patil");
	//	    stu4.setStudentaddress("Kanhere");
	//		stu4.setStudentemail("vasant@123");
	//		stu4.setStudentpass("vasant123");
		    
		    
	    

	//        Student stu5=new Student();
		
//			stu5.setStudentfname("pooja");
	//		stu5.setStudentlname("Patil");
	//	    stu5.setStudentaddress("Kanhere");
	//		stu5.setStudentemail("poojapatil@123");
	//	stu5.setStudentpass("pooja123");
	  
//		
//		List<Student> al=new ArrayList<Student>();
//    	al.add(stu1);
//		al.add(stu2);
//		al.add(stu3);
//		al.add(stu4);
//		al.add(stu5);
//		
//	
//		
	//	controller.saveAllstudent(al);
//	
//		
	
//	Student student = controller.getstudent(5);
	//System.out.println(student);
	
	//	List<Integer> ids= new ArrayList<Integer>();
		  
		//ids.add(2);
		//ids.add(5);
		//ids.add(1);
		//List<Student> multiplsstudent = controller.getMultiplsstudent(ids);
	
		//System.out.println(multiplsstudent);
	
	//	boolean recordExistsOrNot = controller.RecordExistsOrNot(27);
	//	System.out.println(recordExistsOrNot);
		
	//	long countNoOfRecords = controller.CountNoOfRecords();
   //	System.out.println(countNoOfRecords);
	
	//boolean deleteRecordByIdstudent = controller.deleteRecordByIdstudent(27);
	//System.out.println(deleteRecordByIdstudent);
	
		
	//	boolean deleteRecordAllByIdstudent = controller.deleteRecordAllByIdstudent(29);
	//System.out.println(deleteRecordAllByIdstudent);
	
		//Page<Student> studentPagination = controller.studentPagination();
	//	System.out.println(studentPagination);
	//	for(Student s:studentPagination);
	
		
	//  Student studentId = controller.getStudentId(2);
	//	System.out.println();
	
	//Student studentName = controller.getStudentName("ravsaheb");
	//System.out.println(studentName);
	
		
		Student studentByStudentfname = controller.getStudentByStudentfname("Rav");
		System.out.println(studentByStudentfname);
	
	}
}
		