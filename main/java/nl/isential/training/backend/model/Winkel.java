package nl.isential.training.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Winkel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@Column
	private String naamWinkel;
	
	private Boolean isService;
	
	private int aantalSterren;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaamWinkel() {
		return naamWinkel;
	}

	public void setNaamWinkel(String naamWinkel) {
		this.naamWinkel = naamWinkel;
	}

	public Boolean getIsService() {
		return isService;
	}

	public void setIsService(Boolean isService) {
		this.isService = isService;
	}

	public int getAantalSterren() {
		return aantalSterren;
	}

	public void setAantalSterren(int aantalSterren) {
		this.aantalSterren = aantalSterren;
	}
	
	
	
	
	
}
