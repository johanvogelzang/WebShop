
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:10 CEST 2011
 *     Application model: Subclass
 *     Generator        : Mod4j BusinessDomainDsl generator: NewJavaBean.xpt
 */

package org.company.webshop.domain;

import org.company.webshop.domain.Subclass;
import org.company.webshop.domain.Superclass;
import org.mod4j.runtime.validation.NotNullValidator;

/**
 * 
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
@SuppressWarnings("serial")
public abstract class SubclassImplBase extends Superclass
		implements
			java.io.Serializable {

	/**
	 * toString method for SubclassImplBase
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("org.company.webshop.domain.Subclass[");
		result.append("id=");
		result.append(getId());
		result.append(",");
		result.append("version=");
		result.append(getVersion());

		result.append(",");
		result.append("name=");
		result.append(name);

		result.append(",");
		result.append("active=");
		result.append(active);

		result.append("]");
		return result.toString();
	}

	/**
	 *  active: 
	 */
	protected Boolean active = true;

	private void addValidators() {

		validation.addValidator(new NotNullValidator(Subclass.class, "active"));

	}

	/**
	 * Default no-argument constructor for SubclassImplBase 
	 */
	protected SubclassImplBase() {
		super();
		addValidators();
	}

	/**
	 * Minimal constructor for SubclassImplBase
	 *
	 * @param name (String) 
	 */
	public SubclassImplBase(String name) {
		super(name);

		addValidators();
		validation.validate();
	}

	/**
	 * @return active (Boolean) 
	 */
	public Boolean isActive() {
		return this.active;
	}

	/**
	 * Extra getter for Boolean properties, because the "is<property>()" syntax does not
	 * always work.
	 *
	 * @return active (Boolean) 
	 */
	public Boolean getActive() {
		return isActive();
	}

	/**
	 * @param active (Boolean) 
	 */
	public void setActive(final Boolean active) {
		this.active = active;
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
