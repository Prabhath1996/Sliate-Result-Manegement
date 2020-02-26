/**
 * 
 */
package com.Sliate.student_subject;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Prabhath
 *
 */
@RestController
@Controller
@RequestMapping(path="/StudentSubject")
public class StudentSubject_Controller {
	@Autowired
	private StudentSubject_Repository StudentSubject_repository;
	@Autowired
	private StudentSubject_CrudRepository StudentSubject_Crepository;

	@PostMapping(path="/add")
	public @ResponseBody String test (@RequestParam String id , @RequestParam String name, @RequestParam String email)
	{
		StudentSubject_Module StudentSubject_Module=new StudentSubject_Module();
		StudentSubject_Module.setStudentSubjectId(id);
		
		StudentSubject_repository.save(StudentSubject_Module);
		return "saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<StudentSubject_Module> getAll()
	{
		return StudentSubject_repository.findAll();
	}	

	@GetMapping(path="/searchid")
	@ResponseBody
	public Optional<StudentSubject_Module> findByID( @RequestParam String id)
	{
		return StudentSubject_Crepository.findById(id);
	}
	
	@GetMapping(path="/deleteid")
	@ResponseBody
	public void deleteByID( @RequestParam String id)
	{
		StudentSubject_Crepository.deleteById(id);
		System.out.println("delete sucssufull");
	}
}
