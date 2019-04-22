package bulkcode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bulkcode.mapper.IEntityMapper;
import bulkcode.model.dto.CompanyDto;
import bulkcode.repository.CompanyRepository;
import bulkcode.service.ICompanyService;

@Service
public class CompanyService implements ICompanyService {

    @Autowired
    private IEntityMapper mapper;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public CompanyDto findById(Long id) {
        return mapper.toDto(companyRepository.findById(id).get());
    }

}
