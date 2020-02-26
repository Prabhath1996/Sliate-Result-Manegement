package com.Sliate.Semester;

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
@RequestMapping(path="/semester")
public class Semester_Controller {
	
	@Autowired
	private Semester_Repository Semester_repository;
	@Autowired
	private Semester_CrudRepository Semester_Crepository;

	@PostMapping(path="/add")
	public @ResponseBody String test (@RequestParam String id)
	{
		Semester_model Semester_model=new Semester_model();
		Semester_model.setId(id);;
		Semester_repository.save(Semester_model);
		return "saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Semester_model> getAll()
	{
		return Semester_repository.findAll();
	}	

	@GetMapping(path="/searchid")
	@ResponseBody
	public Optional<Semester_model> findByID( @RequestParam String id)
	{
		return Semester_Crepository.findById(id);
	}
	
	@GetMapping(path="/deleteid")
	@ResponseBody
	public void deleteByID( @RequestParam String id)
	{
		Semester_Crepository.deleteById(id);
		System.out.println("delete sucssufull");
	}

}
