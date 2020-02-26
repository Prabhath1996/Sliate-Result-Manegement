/**
 * 
 */
package com.Sliate.Lecure_Subject;

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
@RequestMapping(path ="/Lecure_Subject")
public class Lecure_Subject_Controller {

	@Autowired
	private Lecure_Subject_Repository Lecure_Subject_repository;
	@Autowired
	private Lecure_Subject_CrudRepository Lecure_Subject_Crepository;

	@PostMapping(path="/add")
	public @ResponseBody String test (@RequestParam String id , @RequestParam String name, @RequestParam String email)
	{
		Lecure_Subject_Model Lecure_Subject_Model=new Lecure_Subject_Model();
		Lecure_Subject_Model.setId(id);
		
		Lecure_Subject_repository.save(Lecure_Subject_Model);
		return "saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Lecure_Subject_Model> getAll()
	{
		return Lecure_Subject_repository.findAll();
	}	

	@GetMapping(path="/searchid")
	@ResponseBody
	public Optional<Lecure_Subject_Model> findByID( @RequestParam String id)
	{
		return Lecure_Subject_Crepository.findById(id);
	}
	
	@GetMapping(path="/deleteid")
	@ResponseBody
	public void deleteByID( @RequestParam String id)
	{
		Lecure_Subject_Crepository.deleteById(id);
		System.out.println("delete sucssufull");
	}
}
