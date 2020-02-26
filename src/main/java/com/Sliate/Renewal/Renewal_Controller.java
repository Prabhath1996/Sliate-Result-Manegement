/**
 * 
 */
package com.Sliate.Renewal;

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
@RequestMapping (path ="/Renewal")
public class Renewal_Controller {
	@Autowired
	private Renewal_Repository Renewal_repository;
	@Autowired
	private Renewal_CrudRepository Renewal_Crepository;

	@PostMapping(path="/add")
	public @ResponseBody String test (@RequestParam String id , @RequestParam String name, @RequestParam String email)
	{
		Renewal_Model Renewal_Model=new Renewal_Model();
		Renewal_Model.setRenewal_Id(id);
		Renewal_repository.save(Renewal_Model);
		return "saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Renewal_Model> getAll()
	{
		return Renewal_repository.findAll();
	}	

	@GetMapping(path="/searchid")
	@ResponseBody
	public Optional<Renewal_Model> findByID( @RequestParam String id)
	{
		return Renewal_Crepository.findById(id);
	}
	
	@GetMapping(path="/deleteid")
	@ResponseBody
	public void deleteByID( @RequestParam String id)
	{
		Renewal_Crepository.deleteById(id);
		System.out.println("delete sucssufull");
	}
}
