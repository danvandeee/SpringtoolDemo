package nl.isential.training.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.isential.training.backend.model.Winkel;

@Service
public class WinkelService implements IWinkelService{

	@Autowired  					//inject de ipersonservice in deze code!
	private IWinkelService iWinkelService;
	
	
	@Override
	public List<Winkel> findAll() {
		// TODO Auto-generated method stub
		return this.iWinkelService.findAll();
	}

	@Override
	public List<Winkel> findByNaamWinkel(String naamwinkel) {
		// TODO Auto-generated method stub
		return this.iWinkelService.findByNaamWinkel(naamwinkel);
	}

	@Override
	public List<Winkel> findByIsService(Boolean isservice) {
		// TODO Auto-generated method stub
		return this.iWinkelService.findByIsService(isservice);
	}

}
