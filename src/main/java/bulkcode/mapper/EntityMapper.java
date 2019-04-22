package bulkcode.mapper;

import org.modelmapper.ModelMapper;

import bulkcode.model.Company;
import bulkcode.model.dto.CompanyDto;

public class EntityMapper implements IEntityMapper{

    private ModelMapper mapper = new ModelMapper();
    
    
    @Override
    public CompanyDto toDto(Company company) {
        
        CompanyDto companyDto = mapper.map(mapper, CompanyDto.class);
        companyDto.setActivity(company.getActivity().getDesc());
        companyDto.setType(company.getType().getDesc());
        
        return companyDto;
    }

    @Override
    public Company toDto(CompanyDto company) {
        // TODO Auto-generated method stub
        return null;
    }

}
