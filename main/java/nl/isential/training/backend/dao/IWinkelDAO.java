package nl.isential.training.backend.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import nl.isential.training.backend.model.Winkel;
import java.lang.String;
import java.lang.Boolean;

public interface IWinkelDAO extends CrudRepository<Winkel, Long> {

	
	@Override
	List<Winkel> findAll() ;
	
	List<Winkel> findByNaamWinkel(String naamwinkel);
	
	List<Winkel> findByIsService(Boolean isservice);
	
	
	
	
}
