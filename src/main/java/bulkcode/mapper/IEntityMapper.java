package bulkcode.mapper;

import bulkcode.model.Company;
import bulkcode.model.dto.CompanyDto;

public interface IEntityMapper {

    /**
     * dummy dto mapper
     * 
     * @param company
     * @return
     */
    CompanyDto toDto(Company company);

    /**
     * when we want to update
     * 
     * @param company
     * @return
     */
    Company toDto(CompanyDto company);
}
