
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:11 CEST 2011
 *     Application model: Many2ManyOrderedTo
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
 * This class has no meaning in the recordshop application. Its purpose is to test
ordered one-to-many associations
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
@SuppressWarnings("serial")
public abstract class Many2ManyOrderedToImplBase
		implements
			java.io.Serializable {

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
	 * toString method for Many2ManyOrderedToImplBase
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("org.company.recordshop.domain.Many2ManyOrderedTo[");
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

	private Set<Many2ManyFrom> many2manySource = new HashSet<Many2ManyFrom>();

	/**
	 * @return many2manySource (Set<Many2ManyFrom>).
	 */
	public Set<Many2ManyFrom> getMany2manySource() {
		return Collections.unmodifiableSet(this.many2manySource);
	}

	/**
	 * @param id
	 *        id of the collection element to return
	 *
	 * @return many2manySource (Set<Many2ManyFrom>)
	 * @return many2manySource (Set<Many2ManyFrom>)
	 *         with the given id.
	 */
	public Many2ManyFrom getFromMany2manySource(Long id) {
		if (id == null) {
			return null;
		}
		for (Many2ManyFrom many2ManyFrom : this.many2manySource) {
			if (id.equals(many2ManyFrom.getId())) {
				return many2ManyFrom;
			}
		}
		return null;
	}

	/**
	 * Implements adding single element to a collection.
	 */
	public void addToMany2manySource(Many2ManyFrom element) {
		if (element == null) {
			return;
		}
		if (!many2manySource.contains(element)) {
			many2manySource.add(element);
			element.addToTargetBiDirectional((Many2ManyOrderedTo) this);
			validation.validate();
		}
	}

	/**
	 * Implements removing a single element from a collection.
	 */
	public boolean removeFromMany2manySource(Many2ManyFrom element) {
		if (element == null) {
			return false;
		}
		if (many2manySource.contains(element)) {
			this.many2manySource.remove(element);
			element.removeFromTargetBiDirectional((Many2ManyOrderedTo) this);
			validation.validate();
			return true;
		}
		return false;
	}

	private void addValidators() {

		validation.addValidator(new NotNullValidator(Many2ManyOrderedTo.class,
				"property"));

	}

	/**
	 * Default no-argument constructor for Many2ManyOrderedToImplBase 
	 */
	protected Many2ManyOrderedToImplBase() {

		addValidators();
	}

	/**
	 * Minimal constructor for Many2ManyOrderedToImplBase
	 *
	 * @param property (String) 
	 */
	public Many2ManyOrderedToImplBase(String property) {

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
