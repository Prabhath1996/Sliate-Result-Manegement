/**
 * 
 */
package com.Sliate.Date;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * @author Prabhath
 *
 */
public class Date_Controller {
	@Autowired
	private Date_Repository Date_repository;
	@Autowired
	private Date_CrudRepository Date_Crepository;

	@PostMapping(path="/add")
	public @ResponseBody String test (@RequestParam String id , @RequestParam String name, @RequestParam String email)
	{
		Date_Model Date_Model=new Date_Model();
		Date_Model.setId_Date(id);
		
		Date_repository.save(Date_Model);
		return "saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Date_Model> getAll()
	{
		return Date_repository.findAll();
	}	

	@GetMapping(path="/searchid")
	@ResponseBody
	public Optional<Date_Model> findByID( @RequestParam String id)
	{
		return Date_Crepository.findById(id);
	}
	
	@GetMapping(path="/deleteid")
	@ResponseBody
	public void deleteByID( @RequestParam String id)
	{
		Date_Crepository.deleteById(id);
		System.out.println("delete sucssufull");
	}
}
