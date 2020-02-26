package com.Sliate.Student;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
@RestController
@RequestMapping(path="/Student")
public class Student_Controller {
	
	@Autowired
	private Student_Repository Student_Repository;
	@Autowired
	private Student_CrudRepository 	Student_CrudRepository ;

	
	/**
	 * Add Student into Student Table
	 * @param id
	 * @return
	 */
	@PostMapping(path="/add")
	public @ResponseBody String test (@RequestParam String id )
	{
		Student student=new Student();
		student.setReg_No(id);
	
		Student_Repository.save(student);
		return "saved";
	}
	
	
	/**
	 * Search All student in Student Table
	 * @return
	 */
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Student> getAll()
	{
		return Student_Repository.findAll();
	}
	
	
	/**
	 * Search Student By Student Registration No
	 * @param id
	 * @return
	 */
	@GetMapping(path="/searchid")
	@ResponseBody
	public Optional<Student> findByID( @RequestParam String id)
	{
		return Student_CrudRepository.findById(id);
	}
	
	/**
	 * Delete Student By Student ID
	 * @param id
	 */
	@GetMapping(path="/deleteid")
	@ResponseBody
	public void deleteByID( @RequestParam String id)
	{
		Student_CrudRepository.deleteById(id);
		System.out.println("delete sucssufull");
	}
	
	
}
