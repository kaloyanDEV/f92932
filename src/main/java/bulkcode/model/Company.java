package bulkcode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "company")
@Getter
@Setter
public class Company extends AuditModel {

	private static final long serialVersionUID = 907063532390231517L;

	@Id
	@GeneratedValue(generator = "company_generator")
	@SequenceGenerator(name = "company_generator", sequenceName = "company_sequence", initialValue = 1000)
	private Long id;

	@NotBlank
	@Size(min = 3, max = 100)
	private String name;

	@Size(min = 3, max = 100)
	private String manager;

	private int founded;

	@Column(name = "capital")
	private float startCapital;

	@Enumerated(EnumType.STRING)
	private Activity activity;

}
