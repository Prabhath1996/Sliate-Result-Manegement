package com.Sliate.ALSubject;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sliate.ALStream.ALStream_Repository;

@RestController
@Controller
@RequestMapping(path="/Al_subject")
public class ALSubject_Controller {
	
	
	@Autowired
	private ALSubject_Repository ALSubject_repository;
	@Autowired
	private ALSubject_CrudRepository ALSubject_Crepository;

	@PostMapping(path="/add")
	public @ResponseBody String test (@RequestParam String id )
	{
		ALSubject_Module ALSubject_Module=new ALSubject_Module();
		ALSubject_Module.setSubject_Id(id);
		ALSubject_repository.save(ALSubject_Module);
		return "saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<ALSubject_Module> getAll()
	{
		return ALSubject_repository.findAll();
	}	

	@GetMapping(path="/searchid")
	@ResponseBody
	public Optional<ALSubject_Module> findByID( @RequestParam String id)
	{
		return ALSubject_Crepository.findById(id);
	}
	
	@GetMapping(path="/deleteid")
	@ResponseBody
	public void deleteByID( @RequestParam String id)
	{
		ALSubject_Crepository.deleteById(id);
		System.out.println("delete sucssufull");
	}

}
