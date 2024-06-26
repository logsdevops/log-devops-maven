package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
	
	Student findByEnrollment(Integer enrolment);
	
	void deleteByEnrollment(Integer enrolment);

}
