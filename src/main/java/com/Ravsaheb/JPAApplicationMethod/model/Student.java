package com.Ravsaheb.JPAApplicationMethod.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_DETAILES")
public class Student {
	
	
	@Id
	@Column(name ="STUDENT_ROLLNO")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Studentrollno;
	
	@Column(name ="STUDENT_FNAME")
	private String Studentfname;
	
	@Column(name ="STUDENT_LNAME")
	private String Studentlname;
	
	@Column(name ="STUDENT_ADDRESS")
	private String Studentaddress;
	
	@Column(name ="STUDENT_EMAIL")
	private String Studentemail;
	
	@Column(name ="STUDENT_PASS")
	private String Studentpass;

	public int getStudentrollno() {
		return Studentrollno;
	}

	public void setStudentrollno(int studentrollno) {
		Studentrollno = studentrollno;
	}

	public String getStudentfname() {
		return Studentfname;
	}

	public void setStudentfname(String studentfname) {
		Studentfname = studentfname;
	}

	public String getStudentlname() {
		return Studentlname;
	}

	public void setStudentlname(String studentlname) {
		Studentlname = studentlname;
	}

	public String getStudentaddress() {
		return Studentaddress;
	}

	public void setStudentaddress(String studentaddress) {
		Studentaddress = studentaddress;
	}

	public String getStudentemail() {
		return Studentemail;
	}

	public void setStudentemail(String studentemail) {
		Studentemail = studentemail;
	}

	public String getStudentpass() {
		return Studentpass;
	}

	public void setStudentpass(String studentpass) {
		Studentpass = studentpass;
	}

	@Override
	public String toString() {
		return "Student [Studentrollno=" + Studentrollno + ", Studentfname=" + Studentfname + ", Studentlname="
				+ Studentlname + ", Studentaddress=" + Studentaddress + ", Studentemail=" + Studentemail
				+ ", Studentpass=" + Studentpass + "]";
	}
	
	
	
	
	
	

}
