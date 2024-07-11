package com.app.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.Category;
import com.app.Entity.Railway;
import com.app.Service.RailwayService;

@RestController
@RequestMapping("/Railway")
public class RailwayController {
	@Autowired
	private RailwayService railwayService;
	
	@PostMapping("/addNewRailway")
	public Railway addNewRailway(@RequestBody Railway railway) {
		return railwayService.AddNewRailway(railway);
	}
	@GetMapping("/Get")
	public List<Railway> GetAll(){
		return railwayService.GetAll();
	}
	@GetMapping("/find By Category/{category}")
	public List<Railway> FindByCategory(@PathVariable Category category){
		return railwayService.findbyCategory(category);
	}
	@GetMapping("/getbyid/{id}")
	public Optional<Railway> findbyid(@PathVariable int id) {
		return railwayService.findbyId(id);
	}
}

