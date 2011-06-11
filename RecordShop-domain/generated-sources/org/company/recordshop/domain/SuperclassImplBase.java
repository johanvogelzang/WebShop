
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:10 CEST 2011
 *     Application model: Superclass
 *     Generator        : Mod4j BusinessDomainDsl generator: NewJavaBean.xpt
 */

package org.company.recordshop.domain;

import org.mod4j.runtime.validation.BusinessRuleValidationSupport;

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
public abstract class SuperclassImplBase implements java.io.Serializable {

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
	 * toString method for SuperclassImplBase
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("org.company.recordshop.domain.Superclass[");
		result.append("id=");
		result.append(getId());
		result.append(",");
		result.append("version=");
		result.append(getVersion());

		result.append(",");
		result.append("name=");
		result.append(name);

		result.append("]");
		return result.toString();
	}

	/**
	 *  name: 
	 */
	protected String name;

	public static final Integer NAME_MAXLENGTH = 50;

	private void addValidators() {

		validation.addValidator(new NotNullValidator(Superclass.class, "name"));
		validation.addValidator(new MaxLengthValidator(Superclass.class,
				"name", NAME_MAXLENGTH));

	}

	/**
	 * Default no-argument constructor for SuperclassImplBase 
	 */
	protected SuperclassImplBase() {

		addValidators();
	}

	/**
	 * Minimal constructor for SuperclassImplBase
	 *
	 * @param name (String) 
	 */
	public SuperclassImplBase(String name) {

		this.name = name;
		addValidators();
		validation.validate();
	}

	/**
	 * @return name (String) 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name (String) 
	 */
	public void setName(final String name) {
		this.name = name;
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
