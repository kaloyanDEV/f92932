package bulkcode.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bulkcode.model.Company;
import bulkcode.model.dto.CompanyDto;
import bulkcode.service.ICompanyService;

@RestController
public class CompanyController {

    @Autowired
    private ICompanyService companyService;

    // Single item

    @PostMapping("/companies")
    public ResponseEntity<HttpStatus> create(@Valid @RequestBody Company question) {
        // Company company = Company.builder().name("ME").build();
        return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
    }

    @GetMapping("/companies/{id}")
    public ResponseEntity<CompanyDto> get(@PathVariable long id) {
        CompanyDto companyDto = companyService.findById(new Long(id));
        return new ResponseEntity<CompanyDto>(companyDto, HttpStatus.OK);
    }

    @PutMapping("/companies/{id}")
    public ResponseEntity<HttpStatus> put(@Valid @RequestBody Company question) {

        return null;
    }

    @DeleteMapping("/companies/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable long id) {

        return null;
    }

}
