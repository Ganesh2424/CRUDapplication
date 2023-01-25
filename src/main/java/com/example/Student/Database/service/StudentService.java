package com.example.Student.Database.service;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.Database.domain.Student;
import com.example.Student.Database.repository.StudentRepository;


@Service
public class StudentService {	
	@Autowired
    private StudentRepository repo;
	
	public List<Student> listAll() {
        return repo.findAll();
    }
     
    public void save(Student std) {
        repo.save(std);
    }
     
    public Student get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
 
}


