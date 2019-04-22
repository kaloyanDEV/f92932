package bulkcode.model.nomenclature;

import lombok.Getter;

/**
 * static representation for the type of company
 * 
 * @author kaloyan
 *
 */
@Getter
public enum Type {

	T1("ЕООД"), T2("ООД"), T3("АД"), T4("ЕТ");

	private String desc;

	private Type(String desc) {
		this.desc = desc;
	}

}
