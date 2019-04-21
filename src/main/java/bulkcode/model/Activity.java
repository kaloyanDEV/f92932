package bulkcode.model;

import lombok.Getter;

/**
 * static representation for the activity of company
 * 
 * @author kaloyan
 *
 */
@Getter
public enum Activity {

	A1("ЕООД"), A2("ООД"), A3("АД"), A4("ЕТ");

	private String desc;

	private Activity(String desc) {
		this.desc = desc;
	}

}
