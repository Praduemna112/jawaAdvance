package com.app.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entity.Category;
import com.app.Entity.Railway;

public interface RailwayRepositories extends JpaRepository<Railway, Integer> {
	List<Railway> findByCategory(Category category);
}
