package com.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Custom_exception.Custom_Exception;
import com.app.Entity.Category;
import com.app.Entity.Railway;
import com.app.Repositories.RailwayRepositories;
@Service
@Transactional
public class RailwayServiceImpl implements RailwayService{
	
	@Autowired
	private RailwayRepositories railwayRepositories;
	@Override
	public Railway AddNewRailway(Railway railway) {
		// TODO Auto-generated method stub
		return railwayRepositories.save(railway);
	}

	@Override
	public List<Railway> GetAll() {
		// TODO Auto-generated method stub
		return railwayRepositories.findAll();
	}

	@Override
	public String deleteRailway(int id) {
		Railway deleterailway=railwayRepositories
				.findById(id).orElseThrow(()->new Custom_Exception("invalid id"));
		railwayRepositories.delete(deleterailway);
		
		return "delete railway seccessful";
	}

	@Override
	public Railway UpdateRailway(Railway railway) {
		Railway updateRailway=railwayRepositories
				.findById(railway.getId()).orElseThrow(()->new Custom_Exception("invalid id"));
		updateRailway.setName(railway.getName());
		updateRailway.setCategory(railway.getCategory());
		updateRailway.setDistance(railway.getDistance());

		return railwayRepositories.save(updateRailway);
	}

	@Override
	public List<Railway> findbyCategory(Category category) {
		return railwayRepositories.findByCategory(category);
	}

	@Override
	public Optional<Railway> findbyId(int id) {
		  return railwayRepositories.findById(id);
		
	}

}
