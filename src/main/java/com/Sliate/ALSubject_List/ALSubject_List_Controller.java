package com.Sliate.ALSubject_List;

import java.util.Optional;

import javax.persistence.Table;

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
@RequestMapping(path="/ALSubject_List")
public class ALSubject_List_Controller {

	@Autowired
	private ALSubject_List_Repository ALSubject_List_repository;
	@Autowired
	private ALSubject_List_CrudRepository ALSubject_List_Crepository;

	@PostMapping(path="/add")
	public @ResponseBody String test (@RequestParam String id , @RequestParam String name, @RequestParam String email)
	{
		ALSubject_List ALSubject_List=new ALSubject_List();
		ALSubject_List.setAL_sub_id(id);
	
		ALSubject_List_repository.save(ALSubject_List);
		return "saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<ALSubject_List> getAll()
	{
		return ALSubject_List_repository.findAll();
	}	

	@GetMapping(path="/searchid")
	@ResponseBody
	public Optional<ALSubject_List> findByID( @RequestParam String id)
	{
		return ALSubject_List_Crepository.findById(id);
	}
	
	@GetMapping(path="/deleteid")
	@ResponseBody
	public void deleteByID( @RequestParam String id)
	{
		ALSubject_List_Crepository.deleteById(id);
		System.out.println("delete sucssufull");
	}
}
