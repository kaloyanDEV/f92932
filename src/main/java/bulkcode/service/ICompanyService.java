package bulkcode.service;

import bulkcode.model.dto.CompanyDto;

public interface ICompanyService {

    public CompanyDto findById(Long id);
    
}
