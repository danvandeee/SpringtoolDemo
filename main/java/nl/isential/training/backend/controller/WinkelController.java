package nl.isential.training.backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.isential.training.backend.model.Winkel;
import nl.isential.training.backend.service.IWinkelService;

@RestController
public class WinkelController {

	@Autowired									//inject de ipersonservice in deze code!
	private IWinkelService iWinkelService;
	
	@GetMapping("/api/winkel/all")
	public List<Winkel> findAll() {
		return this.iWinkelService.findAll();
	}
	
}
