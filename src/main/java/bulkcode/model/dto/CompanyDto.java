package bulkcode.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyDto {

    private long id;

    private String name;

    private String manager;

    private int founded;

    private float startCapital;

    private String activity;

    private String type;

}
