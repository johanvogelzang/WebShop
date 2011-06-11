
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:10 CEST 2011
 *     Application model: SubclassEmpty2
 *     Generator        : Mod4j BusinessDomainDsl generator: NewJavaBean.xpt
 */

package org.company.recordshop.domain;

import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import org.mod4j.runtime.validation.MinValueValidator;
import org.mod4j.runtime.validation.MaxValueValidator;
import org.mod4j.runtime.validation.MinLengthValidator;
import org.mod4j.runtime.validation.MaxLengthValidator;
import org.mod4j.runtime.validation.NotNullValidator;
import org.mod4j.runtime.validation.RegExpValidator;

/**
 * 
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
@SuppressWarnings("serial")
public abstract class SubclassEmpty2ImplBase extends Empty2
		implements
			java.io.Serializable {

	/**
	 * toString method for SubclassEmpty2ImplBase
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("org.company.recordshop.domain.SubclassEmpty2[");
		result.append("id=");
		result.append(getId());
		result.append(",");
		result.append("version=");
		result.append(getVersion());

		result.append(",");
		result.append("age=");
		result.append(age);

		result.append(",");
		result.append("yes=");
		result.append(yes);

		result.append("]");
		return result.toString();
	}

	/**
	 *  age: 
	 */
	protected String age;

	/**
	 *  yes: 
	 */
	protected Boolean yes;

	private void addValidators() {

		validation.addValidator(new NotNullValidator(SubclassEmpty2.class,
				"age"));

	}

	/**
	 * Default no-argument constructor for SubclassEmpty2ImplBase 
	 */
	protected SubclassEmpty2ImplBase() {
		super();
		addValidators();
	}

	/**
	 * Minimal constructor for SubclassEmpty2ImplBase
	 *
	 * @param age (String) 
	 */
	public SubclassEmpty2ImplBase(String age) {
		super();

		this.age = age;
		addValidators();
		validation.validate();
	}

	/**
	 * @return age (String) 
	 */
	public String getAge() {
		return this.age;
	}

	/**
	 * @return yes (Boolean) 
	 */
	public Boolean isYes() {
		return this.yes;
	}

	/**
	 * Extra getter for Boolean properties, because the "is<property>()" syntax does not
	 * always work.
	 *
	 * @return yes (Boolean) 
	 */
	public Boolean getYes() {
		return isYes();
	}

	/**
	 * @param age (String) 
	 */
	public void setAge(final String age) {
		this.age = age;
		validation.validate();
	}

	/**
	 * @param yes (Boolean) 
	 */
	public void setYes(final Boolean yes) {
		this.yes = yes;
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
