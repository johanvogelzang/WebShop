
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:10 CEST 2011
 *     Application model: Empty
 *     Generator        : Mod4j BusinessDomainDsl generator: NewJavaBean.xpt
 */

package org.company.recordshop.domain;

import org.mod4j.runtime.validation.BusinessRuleValidationSupport;

/**
 * 
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
@SuppressWarnings("serial")
public abstract class EmptyImplBase implements java.io.Serializable {

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
	 * toString method for EmptyImplBase
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("org.company.recordshop.domain.Empty[");
		result.append("id=");
		result.append(getId());
		result.append(",");
		result.append("version=");
		result.append(getVersion());

		result.append("]");
		return result.toString();
	}

	private void addValidators() {

	}

	/**
	 * Minimal constructor for EmptyImplBase
	 *
	 */
	public EmptyImplBase(

	) {

		addValidators();
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
