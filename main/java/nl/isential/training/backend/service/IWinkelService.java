package nl.isential.training.backend.service;

import java.util.List;

import nl.isential.training.backend.model.Winkel;

public interface IWinkelService {

	public List<Winkel> findAll ();
	
	
	public List<Winkel> findByNaamWinkel(String naamwinkel);
	
	public List<Winkel> findByIsService(Boolean isservice);
	
	
}
