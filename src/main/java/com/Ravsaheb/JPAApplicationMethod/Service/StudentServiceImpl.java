package com.Ravsaheb.JPAApplicationMethod.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Service;

import com.Ravsaheb.JPAApplicationMethod.Repository.StudentRepository;
import com.Ravsaheb.JPAApplicationMethod.model.Student;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student studentService(Student student) {
		Student save = studentRepository.save(student);
		return save;
	}

	@Override
	public List<Student> saveAllstudent(List<Student> student) {
		
	List<Student> saveAll =(List<Student>) studentRepository.saveAll(student);
	return saveAll;
		
		
	}

	@Override
	public Student getstudent(int  StudentId) {
		Student findById = studentRepository.findById(StudentId).get();
		return findById;
	}

	@Override
	public List<Student> getMultiplesstudent(List<Integer> ids) {
		List<Student> findAllById = studentRepository.findAllById(ids);
		return  findAllById;
	}

	@Override
	public boolean RecordExistsOrNot(int StudentId) {
		boolean existsById = studentRepository.existsById(StudentId);
		return  existsById;
	}

	@Override
	public long CountNoOfRecords() {
	long count = studentRepository.count();
	
		return count;
	}

	@Override
	public boolean deleteRecordByIdstudent(int Studentid) {
		boolean existsById = studentRepository.existsById(Studentid);
		if(existsById) {
			
			studentRepository.deleteById(Studentid);
			return true;
		}else {
		
		return false;
	}

	
	
	}

	@Override
	public boolean deleteRecordAllByIdstudent(int Studentids) {
		boolean existsById = studentRepository.existsById(Studentids);
		if(existsById) {
			studentRepository.deleteAllInBatch();
			return true;
	}else {
		return existsById;

	
	}
}

	@Override
	public Page<Student> studentPagination() {
		PageRequest of = PageRequest.of(1, 3);
		Page<Student> page = studentRepository.findAll(of); 
		return page;
	}

	@Override
	public List<Student> sortingStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentId(int StudentId) {
		Student findByStudentId = studentRepository.findByStudentId(StudentId);
		return  findByStudentId;
	}

	@Override
	public Student getStudentByStudentId(int StudnetId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentByStudentfname(String Studentfname) {
	 Student findByStudentfname = studentRepository.findByStudentfname(Studentfname);
		
		return findByStudentfname;
	}

	

	
	
	
	
	}
