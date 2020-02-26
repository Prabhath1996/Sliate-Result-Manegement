/**
 * 
 */
package com.Sliate.Time;

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
@RequestMapping(path="/Time")
public class Time_Controller {

	@Autowired
	private Time_Repository Time_repository;
	@Autowired
	private Time_CrudRepository Time_Crepository;

	@PostMapping(path="/add")
	public @ResponseBody String test (@RequestParam String id , @RequestParam String name, @RequestParam String email)
	{
		Time_Module Time_Module = new Time_Module();
		Time_Module.setTime_ID(id);
		Time_repository.save(Time_Module);
		return "saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Time_Module> getAll()
	{
		return Time_repository.findAll();
	}	

	@GetMapping(path="/searchid")
	@ResponseBody
	public Optional<Time_Module> findByID( @RequestParam String id)
	{
		return Time_Crepository.findById(id);
	}
	
	@GetMapping(path="/deleteid")
	@ResponseBody
	public void deleteByID( @RequestParam String id)
	{
		Time_Crepository.deleteById(id);
		System.out.println("delete sucssufull");
	}
}
