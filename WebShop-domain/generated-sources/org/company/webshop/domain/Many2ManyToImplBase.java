
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:11 CEST 2011
 *     Application model: Many2ManyTo
 *     Generator        : Mod4j BusinessDomainDsl generator: NewJavaBean.xpt
 */

package org.company.webshop.domain;

import org.company.webshop.domain.Many2ManyTo;
import org.mod4j.runtime.validation.BusinessRuleValidationSupport;
import org.mod4j.runtime.validation.NotNullValidator;

/**
 * This class has no meaning in the webshop application. Its purpose is to test
uni-directional many-to-many associations
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
@SuppressWarnings("serial")
public abstract class Many2ManyToImplBase implements java.io.Serializable {

	/**
	 * validation : Responsible for validating attribute constraints and businessrules for this business class.
	 * 
	 */
	protected BusinessRuleValidationSupport validation = new BusinessRuleValidationSupport(
			this);

	/**
	 *  id: The identifier of this object.
	 */
	private Long id;

	/**
	 *
	 * @return id (Long) The identifier of this object.
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * version: The version of this object 
	 */
	private int version = -1;

	/**
	 * @return version (Integer) The version of this object.
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * toString method for Many2ManyToImplBase
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("org.company.webshop.domain.Many2ManyTo[");
		result.append("id=");
		result.append(getId());
		result.append(",");
		result.append("version=");
		result.append(getVersion());

		result.append(",");
		result.append("property=");
		result.append(property);

		result.append("]");
		return result.toString();
	}

	/**
	 *  property: 
	 */
	protected String property;

	private void addValidators() {

		validation.addValidator(new NotNullValidator(Many2ManyTo.class,
				"property"));

	}

	/**
	 * Default no-argument constructor for Many2ManyToImplBase 
	 */
	protected Many2ManyToImplBase() {

		addValidators();
	}

	/**
	 * Minimal constructor for Many2ManyToImplBase
	 *
	 * @param property (String) 
	 */
	public Many2ManyToImplBase(String property) {

		this.property = property;
		addValidators();
		validation.validate();
	}

	/**
	 * @return property (String) 
	 */
	public String getProperty() {
		return this.property;
	}

	/**
	 * @param property (String) 
	 */
	public void setProperty(final String property) {
		this.property = property;
		validation.validate();
	}

	/**
	 * Activate/deactivate validation for this business class.
	 * When set to active the validation will immediately be executed.
	 * 
	 * @param value (boolean) 
	 */
	public void activateValidation(boolean value) {

		this.validation.setActive(value);
		if (value) {
			validation.validate();
		}
	}

}
