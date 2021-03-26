package com.formacionbdi.springboot.generic.dao;


import java.util.Collection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.formacionbdi.springboot.generic.entity.Citas;


public interface CitasDao extends CrudRepository<Citas, Long>{
	

	// Query nativa
		@Query(value = "SELECT * FROM citas WHERE estatus = 1;", nativeQuery = true)
		Collection<Citas> findAllQN();
		
}
