package com.Sliate.ALStream;

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
@RequestMapping(path ="/AlStream")
public class ALStream_Controller {
	@Autowired
	private ALStream_Repository AlStream_repository;
	@Autowired
	private ALStream_CrudRepository AlStream_Crepository;

	@PostMapping(path="/add")
	public @ResponseBody String test (@RequestParam String id )
	{
		AlStream AlStream=new AlStream();
		AlStream.setStream_Id(id);
	
		AlStream_repository.save(AlStream);
		return "saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<AlStream> getAll()
	{
		return AlStream_repository.findAll();
	}	

	@GetMapping(path="/searchid")
	@ResponseBody
	public Optional<AlStream> findByID( @RequestParam String id)
	{
		return AlStream_Crepository.findById(id);
	}
	
	@GetMapping(path="/deleteid")
	@ResponseBody
	public void deleteByID( @RequestParam String id)
	{
		AlStream_Crepository.deleteById(id);
		System.out.println("delete sucssufull");
	}
}
