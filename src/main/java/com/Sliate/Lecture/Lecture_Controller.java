/**
 * 
 */
package com.Sliate.Lecture;

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
@RequestMapping(path ="/Lecture")
public class Lecture_Controller {

	@Autowired
	private Lecture_Repository Lecture_repository;
	@Autowired
	private Lecture_CrudRepository Lecture_Crepository;

	@PostMapping(path="/add")
	public @ResponseBody String test (@RequestParam String id , @RequestParam String name, @RequestParam String email)
	{
		Lecture_Model Lecture_Model=new Lecture_Model();
		Lecture_Model.setLectureId(id);
		Lecture_repository.save(Lecture_Model);
		return "saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Lecture_Model> getAll()
	{
		return Lecture_repository.findAll();
	}	

	@GetMapping(path="/searchid")
	@ResponseBody
	public Optional<Lecture_Model> findByID( @RequestParam String id)
	{
		return Lecture_Crepository.findById(id);
	}
	
	@GetMapping(path="/deleteid")
	@ResponseBody
	public void deleteByID( @RequestParam String id)
	{
		Lecture_Crepository.deleteById(id);
		System.out.println("delete sucssufull");
	}
}
