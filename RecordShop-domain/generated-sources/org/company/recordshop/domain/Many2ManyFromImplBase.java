
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:11 CEST 2011
 *     Application model: Many2ManyFrom
 *     Generator        : Mod4j BusinessDomainDsl generator: NewJavaBean.xpt
 */

package org.company.recordshop.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.mod4j.runtime.validation.BusinessRuleValidationSupport;
import org.mod4j.runtime.validation.NotNullValidator;

/**
 * This class has no meaning in the recordshop application. Its purpose is to test
uni-directional many-to-many associations
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
@SuppressWarnings("serial")
public abstract class Many2ManyFromImplBase implements java.io.Serializable {

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
	 * toString method for Many2ManyFromImplBase
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("org.company.recordshop.domain.Many2ManyFrom[");
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

	/**
	 *  targetBiDirectional: 
	 */
	private Set<Many2ManyOrderedTo> targetBiDirectional = new HashSet<Many2ManyOrderedTo>();

	/**
	 * @return targetBiDirectional (Set<Many2ManyOrderedTo>).
	 */
	public Set<Many2ManyOrderedTo> getTargetBiDirectional() {
		return Collections.unmodifiableSet(this.targetBiDirectional);
	}

	/**
	 * @param id
	 *        id of the collection element to return
	 *
	 * @return targetBiDirectional (Set<Many2ManyOrderedTo>)
	 * @return targetBiDirectional (Set<Many2ManyOrderedTo>)
	 *         with the given id.
	 */
	public Many2ManyOrderedTo getFromTargetBiDirectional(Long id) {
		if (id == null) {
			return null;
		}
		for (Many2ManyOrderedTo many2ManyOrderedTo : this.targetBiDirectional) {
			if (id.equals(many2ManyOrderedTo.getId())) {
				return many2ManyOrderedTo;
			}
		}
		return null;
	}

	/**
	 * Implements adding single element to a collection.
	 */
	public boolean addToTargetBiDirectional(Many2ManyOrderedTo element) {
		if (element == null) {
			return false;
		}
		if (!targetBiDirectional.contains(element)) {
			targetBiDirectional.add(element);
			element.addToMany2manySource((Many2ManyFrom) this);
			validation.validate();
			return true;
		}
		return false;
	}

	/**
	 * Implements removing a single element from a collection.
	 */
	public boolean removeFromTargetBiDirectional(Many2ManyOrderedTo element) {
		if (element == null) {
			return false;
		}
		if (targetBiDirectional.contains(element)) {
			this.targetBiDirectional.remove(element);
			element.removeFromMany2manySource((Many2ManyFrom) this);
			validation.validate();
			return true;
		}
		return false;
	}

	/**
	 *  target: 
	 */
	private List<Many2ManyOrderedTo> target = new ArrayList<Many2ManyOrderedTo>();

	/**
	 * @return target (List<Many2ManyOrderedTo>).
	 */
	public List<Many2ManyOrderedTo> getTarget() {
		return Collections.unmodifiableList(this.target);
	}

	/**
	 * @param id
	 *        id of the collection element to return
	 *
	 * @return target (Set<Many2ManyOrderedTo>)
	 * @return target (List<Many2ManyOrderedTo>)
	 *         with the given id.
	 */
	public Many2ManyOrderedTo getFromTarget(Long id) {
		if (id == null) {
			return null;
		}
		for (Many2ManyOrderedTo many2ManyOrderedTo : this.target) {
			if (id.equals(many2ManyOrderedTo.getId())) {
				return many2ManyOrderedTo;
			}
		}
		return null;
	}

	/**
	 * Implements adding single element to a collection.
	 */
	public boolean addToTarget(Many2ManyOrderedTo element) {
		if (element == null) {
			return false;
		}
		if (!target.contains(element)) {
			target.add(element);
			validation.validate();
			return true;
		}
		return false;
	}

	/**
	 * Implements removing a single element from a collection.
	 */
	public boolean removeFromTarget(Many2ManyOrderedTo element) {
		if (element == null) {
			return false;
		}
		if (target.contains(element)) {
			this.target.remove(element);
			validation.validate();
			return true;
		}
		return false;
	}

	/**
	 * Implements adding single element to an ordered collection at a specified
	 * location.
	 */
	public void addToTarget(int index, Many2ManyOrderedTo element) {
		if (element == null) {
			return;
		}
		target.add(index, element);
		validation.validate();
	}

	/**
	 * Implements removing a single element from a collection.
	 */
	public Many2ManyOrderedTo removeFromTarget(int index) {
		Many2ManyOrderedTo element;
		element = this.target.remove(index);
		validation.validate();
		return element;
	}

	/**
	 * Replaces the element at the specified position in
	 * {@link target} with the specified element.
	 * 
	 * @param index
	 *        index of element to replace.
	 * @param element
	 *        element to be stored at the specified position. 
	 * @return the element previously at the specified position.
	 * @throws IndexOutOfBoundsException
	 *         if the index is out of range (index < 0 || index >= size()).
	 */
	public Many2ManyOrderedTo setTarget(int index, Many2ManyOrderedTo element) {
		Many2ManyOrderedTo result;
		validation.setActive(false);
		result = removeFromTarget(index);
		addToTarget(index, element);
		validation.setActive(true);
		validation.validate();
		return result;
	}

	/**
	 *  many2ManyTo: Verify that the name of the role of the many end of a many-to-many association may be
	the same as the class name.
	 */
	private Set<Many2ManyTo> many2ManyTo = new HashSet<Many2ManyTo>();

	/**
	 * @param id
	 *        id of the collection element to return
	 *
	 * @return many2ManyTo (Many2ManyTo)
	 *         with the given id.
	 */
	public Many2ManyTo getFromMany2ManyTo(Long id) {
		if (id == null) {
			return null;
		}
		for (Many2ManyTo many2ManyTo : this.many2ManyTo) {
			if (id.equals(many2ManyTo.getId())) {
				return many2ManyTo;
			}
		}
		return null;
	}
	/**
	 * @return many2ManyTo (Set<Many2ManyTo>) 
	 */
	public Set<Many2ManyTo> getMany2ManyTo() {
		return Collections.unmodifiableSet(this.many2ManyTo);
	}

	/**
	 * Implements adding single element to a collection
	 */
	public boolean addToMany2ManyTo(Many2ManyTo element) {
		if (element == null) {
			return false;
		}
		if (this.many2ManyTo.contains(element)) {
			return false;
		}
		this.many2ManyTo.add(element);

		validation.validate();
		return true;
	}

	/**
	 * Implements removal of a single element from feature 
	 * 
	 * @param element 
	 */
	public boolean removeFromMany2ManyTo(Many2ManyTo element) {
		if (element == null) {
			return false;
		}
		if (this.many2ManyTo.remove(element)) {

			validation.validate();
			return true;
		}
		return false;
	}

	/**
	 * This operation should NOT be used by clients.  It implements the correct
	 * addition of an element in an association.
	 * 
	 * @param element 
	 */
	public void z_internalAddTomany2ManyTo(Many2ManyTo element) {
		this.many2ManyTo.add(element);
	}

	/**
	 * This operation should NOT be used by clients. It implements the correct
	 * removal of an element in an association.
	 * 
	 * @param element 
	 */
	public void z_internalRemoveFrommany2ManyTo(Many2ManyTo element) {
		this.many2ManyTo.remove(element);
	}

	/**
	 *  toEnd: This Association has no meaning in the recordshop application. Its purpose is to test
	uni-directional many-to-many associations
	 */
	private Set<Many2ManyTo> toEnd = new HashSet<Many2ManyTo>();

	/**
	 * @return toEnd (Set<Many2ManyTo>).
	 */
	public Set<Many2ManyTo> getToEnd() {
		return Collections.unmodifiableSet(this.toEnd);
	}

	/**
	 * @param id
	 *        id of the collection element to return
	 *
	 * @return toEnd (Set<Many2ManyTo>)
	 * @return toEnd (Set<Many2ManyTo>)
	 *         with the given id.
	 */
	public Many2ManyTo getFromToEnd(Long id) {
		if (id == null) {
			return null;
		}
		for (Many2ManyTo many2ManyTo : this.toEnd) {
			if (id.equals(many2ManyTo.getId())) {
				return many2ManyTo;
			}
		}
		return null;
	}

	/**
	 * Implements adding single element to a collection.
	 */
	public boolean addToToEnd(Many2ManyTo element) {
		if (element == null) {
			return false;
		}
		if (!toEnd.contains(element)) {
			toEnd.add(element);
			validation.validate();
			return true;
		}
		return false;
	}

	/**
	 * Implements removing a single element from a collection.
	 */
	public boolean removeFromToEnd(Many2ManyTo element) {
		if (element == null) {
			return false;
		}
		if (toEnd.contains(element)) {
			this.toEnd.remove(element);
			validation.validate();
			return true;
		}
		return false;
	}

	private void addValidators() {

		validation.addValidator(new NotNullValidator(Many2ManyFrom.class,
				"property"));

	}

	/**
	 * Default no-argument constructor for Many2ManyFromImplBase 
	 */
	protected Many2ManyFromImplBase() {

		addValidators();
	}

	/**
	 * Minimal constructor for Many2ManyFromImplBase
	 *
	 * @param property (String) 
	 */
	public Many2ManyFromImplBase(String property) {

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
