package com.Sliate.Student_Result;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Controller
@RequestMapping(path="/Student_Result")
public class Student_Result_Controller {
	
	@Autowired
	private  Student_Result_Repository Student_Result_Repository;
	@Autowired
	private  Student_Result_CrudRepository 	 Student_Result_CrudRepository ;

	
	/**
	 * Add Student into Student Table
	 * @param id
	 * @return
	 */
	@PostMapping(path="/add")
	public @ResponseBody String test (@RequestParam String id )
	{
		Student_Result_Model Student_Result_Model=new Student_Result_Model();
		Student_Result_Model.setResult_id(id);;
	
		Student_Result_Repository.save(Student_Result_Model);
		return "saved";
	}
	
	
	/**
	 * Search All student in Student Table
	 * @return
	 */
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Student_Result_Model> getAll()
	{
		return  Student_Result_Repository.findAll();
	}
	
	
	/**
	 * Search Student By Student Registration No
	 * @param id
	 * @return
	 */
	@GetMapping(path="/searchid")
	@ResponseBody
	public Optional<Student_Result_Model> findByID( @RequestParam String id)
	{
		return Student_Result_CrudRepository.findById(id);
	}
	
	/**
	 * Delete Student By Student ID
	 * @param id
	 */
	@GetMapping(path="/deleteid")
	@ResponseBody
	public void deleteByID( @RequestParam String id)
	{
		Student_Result_CrudRepository.deleteById(id);
		System.out.println("delete sucssufull");
	}
	
	

}
