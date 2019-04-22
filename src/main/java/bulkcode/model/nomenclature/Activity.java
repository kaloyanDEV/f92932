package bulkcode.model.nomenclature;

import lombok.Getter;

/**
 * static representation for the activity of company
 * 
 * @author kaloyan
 *
 */
@Getter
public enum Activity {

	A1("Безхаберие"), A2("Бачкане");

	private String desc;

	private Activity(String desc) {
		this.desc = desc;
	}

}
