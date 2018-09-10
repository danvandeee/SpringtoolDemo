package nl.isential.training.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.isential.training.backend.model.Person;
import nl.isential.training.backend.service.IPersonService;

@RestController
public class PersonController {

	@Autowired									//inject de ipersonservice in deze code!
	private IPersonService iPersonService;

	@GetMapping("/api/person/{id}")
	public Person findById(@PathVariable Long id) {
		Optional<Person> optional = this.iPersonService.findOne(id);

		if (optional.isPresent())
			return optional.get();

		return null;
	}

	
	@GetMapping("/api/person/lastname/{lastname}")
	public List<Person> findByLastName (@PathVariable String lastname) {
		return this.iPersonService.findByLastName(lastname);	
		
	}
	
	@GetMapping("api/person/gender/{gender}")
	public List<Person> findByGender (@PathVariable String gender) {
		if (gender.equals("woman")) {
			gender = "vrouw";
			
		}
		return this.iPersonService.findByGender(gender);
		
	}
	
	
	
	
	@GetMapping("/api/person/all")
	public List<Person> findAll() {
		return this.iPersonService.findAll();
	}

	@PostMapping("/api/person")
	public Person create(@RequestBody Person person) {
		return this.iPersonService.create(person);
	}

	@PutMapping("/api/person/{id}")
	public boolean update(@PathVariable Long id, @RequestBody Person person) {
		this.iPersonService.update(person);

		return true;
	}

	@DeleteMapping("/api/person/{id}")
	public boolean delete(@PathVariable Long id) {
		Optional<Person> optional = this.iPersonService.findOne(id);
		if (optional.isPresent()) {
			this.iPersonService.delete(optional.get());

			return true;
		}

		return false;
	}

	@GetMapping("/api/person/under/{age}")
	public List<Person> findUnderCertainAge( @PathVariable int age ) {
		return this.iPersonService.findUnderCertainAge(age);
	}

	@GetMapping("/api/person/name/{name}")
	public List<Person> findByName( @PathVariable String name ) {
		
		return this.iPersonService.findByName(name);
		
		
			
		
		
	}
	
}