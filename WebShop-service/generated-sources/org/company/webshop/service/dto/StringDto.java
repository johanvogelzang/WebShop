
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:12 CEST 2011
 *     Application model: StringDto
 *     Generator        : Mod4j BusinessDomainDsl generator: dtoBean.xpt
 */

package org.company.webshop.service.dto;

import java.io.Serializable;

/**
 * String transfer object.
 *
 * @author Generated by Mod4j
 */
@SuppressWarnings("serial")
public class StringDto implements Serializable {

	/**
	 *  stringAttribute: A string attribute
	 */

	private String stringAttribute;

	/**
	 * Default no-argument constructor.
	 */
	public StringDto() {
		super();
	}

	/**
	 *
	 * @return stringAttribute (String) A string attribute
	 */
	public String getStringAttribute() {
		return this.stringAttribute;
	}

	/**
	 * @param stringAttribute (String) A string attribute
	 */
	public void setStringAttribute(final String stringAttribute) {
		this.stringAttribute = stringAttribute;
	}

}
