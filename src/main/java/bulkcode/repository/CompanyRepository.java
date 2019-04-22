package bulkcode.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bulkcode.model.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {

}
