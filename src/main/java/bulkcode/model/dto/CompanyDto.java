package bulkcode.model.dto;

import lombok.Builder;
import lombok.Data;

// @Data
// @Builder
public class CompanyDto {

    private long id;

    private String name;

    private String manager;

    private int founded;

    private float startCapital;

    private String activity;

    private String type;

    public CompanyDto() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getFounded() {
        return founded;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }

    public float getStartCapital() {
        return startCapital;
    }

    public void setStartCapital(float startCapital) {
        this.startCapital = startCapital;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
