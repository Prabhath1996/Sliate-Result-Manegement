/**
 * 
 */
package com.Sliate.Attempt;

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
@RequestMapping(path ="/Attempt")
public class Attempt_Controller {
	@Autowired
	private Attempt_Repository Attempt_repository;
	@Autowired
	private Attempt_CrudRepository Attempt_Crepository;

	@PostMapping(path="/add")
	public @ResponseBody String test (@RequestParam String id , @RequestParam String name, @RequestParam String email)
	{
		Attempt_Module Attempt_Module=new Attempt_Module();
		Attempt_Module.setAttemts_Id(id);
		Attempt_repository.save(Attempt_Module);
		return "saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Attempt_Module> getAll()
	{
		return Attempt_repository.findAll();
	}	

	@GetMapping(path="/searchid")
	@ResponseBody
	public Optional<Attempt_Module> findByID( @RequestParam String id)
	{
		return Attempt_Crepository.findById(id);
	}
	
	@GetMapping(path="/deleteid")
	@ResponseBody
	public void deleteByID( @RequestParam String id)
	{
		Attempt_Crepository.deleteById(id);
		System.out.println("delete sucssufull");
	}
}
