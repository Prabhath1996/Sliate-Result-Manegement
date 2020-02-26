package com.Sliate.Subject;

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
@RequestMapping(path="/subject")
public class Subject_Controller {

	@Autowired
	private Subject_Repository Subject_repository;
	@Autowired
	private Subject_Repository Subject_Crepository;

	@PostMapping(path="/add")
	public @ResponseBody String test (@RequestParam String id , @RequestParam String name, @RequestParam String email)
	{
		Subject_Model Subject_Model=new Subject_Model();
		Subject_Model.setSubjectId(id);
		
		Subject_repository.save(Subject_Model);
		return "saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Subject_Model> getAll()
	{
		return Subject_repository.findAll();
	}	

	@GetMapping(path="/searchid")
	@ResponseBody
	public Optional<Subject_Model> findByID( @RequestParam String id)
	{
		return Subject_Crepository.findById(id);
	}
	
	@GetMapping(path="/deleteid")
	@ResponseBody
	public void deleteByID( @RequestParam String id)
	{
		Subject_Crepository.deleteById(id);
		System.out.println("delete sucssufull");
	}
}
