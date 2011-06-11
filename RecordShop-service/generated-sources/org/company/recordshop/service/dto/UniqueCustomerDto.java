
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:12 CEST 2011
 *     Application model: UniqueCustomerDto
 *     Generator        : Mod4j BusinessDomainDsl generator: dtoBean.xpt
 */

package org.company.recordshop.service.dto;

import java.io.Serializable;

/**
 * Customer unique key.
 *
 * @author Generated by Mod4j
 */
@SuppressWarnings("serial")
public class UniqueCustomerDto implements Serializable {

	/**
	 *  firstName: firstName
	 */

	private String firstName;

	/**
	 *  lastName: lastName
	 */

	private String lastName;

	/**
	 * Default no-argument constructor.
	 */
	public UniqueCustomerDto() {
		super();
	}

	/**
	 *
	 * @return firstName (String) firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * @param firstName (String) firstName
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	/**
	 *
	 * @return lastName (String) lastName
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * @param lastName (String) lastName
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

}
