/**
 * 
 */
package com.Sliate.Attendants;

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
@RequestMapping (path ="/Attendants")
public class Attendants_Controller {
	@Autowired
	private Attendants_Repository Attendants_repository;
	@Autowired
	private Attendants_CrudRepository Attendants_Crepository;

	@PostMapping(path="/add")
	public @ResponseBody String test (@RequestParam String id , @RequestParam String name, @RequestParam String email)
	{
		Attendants_Model Attendants_Model=new Attendants_Model();
		Attendants_Model.setAttendants_Id(id);
		
		Attendants_repository.save(Attendants_Model);
		return "saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Attendants_Model> getAll()
	{
		return Attendants_repository.findAll();
	}	

	@GetMapping(path="/searchid")
	@ResponseBody
	public Optional<Attendants_Model> findByID( @RequestParam String id)
	{
		return Attendants_Crepository.findById(id);
	}
	
	@GetMapping(path="/deleteid")
	@ResponseBody
	public void deleteByID( @RequestParam String id)
	{
		Attendants_Crepository.deleteById(id);
		System.out.println("delete sucssufull");
	}
}
