package com.app.Service;

 import java.util.List;
import java.util.Optional;

import com.app.Entity.Category;
import com.app.Entity.Railway;

public interface RailwayService {
	Railway AddNewRailway(Railway railway);
	
	List<Railway>GetAll();
	
	String deleteRailway(int id);
	
	Railway UpdateRailway(Railway railway);
	
	List<Railway> findbyCategory(Category category);
	
	Optional<Railway> findbyId (int id);
	
	
}
