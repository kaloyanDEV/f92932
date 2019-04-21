package bulkcode.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bulkcode.model.Company;

@RestController
public class CompanyController {

	@PostMapping("/companies")
	public Company create(@Valid @RequestBody Company question) {
//        return questionRepository.save(question);
		Company company = new Company();
		company.setName("ME");
		return company;
	}
	
	//Single item
	
	@GetMapping("/companies/{id}")
	public Company getSingle(@PathVariable long id) {
//        return questionRepository.save(question);
		Company company = new Company();
		company.setName("ME");
		return company;
	}
	

}
