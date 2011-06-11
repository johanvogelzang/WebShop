
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:12 CEST 2011
 *     Application model: CustomerWithOrdersAndOrderLines
 *     Generator        : Mod4j DatacontractDsl generator: Translators.xpt
 */

package org.company.recordshop.service.dto.translators;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import org.springframework.util.Assert;
import org.mod4j.runtime.exception.ConcurrentUpdateException;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.domain.CustomerExample;
import org.company.recordshop.service.dto.CustomerWithOrdersAndOrderLines;
import org.company.recordshop.domain.Order;
import org.company.recordshop.service.dto.OrderWithOrderLinesDto;

import org.company.recordshop.data.OrderDao;

/**
 * Translator for translating Customer domain objects from- and to CustomerWithOrdersAndOrderLines data transfer objects. 
 *
 * @author generated by Mod4j
 */
public class CustomerWithOrdersAndOrderLinesTranslator {

	protected OrderWithOrderLinesDtoTranslator orderWithOrderLinesDtoTranslator;

	/**
	 * @param object
	 *            The orderWithOrderLinesDtoTranslator to set.
	 */
	public void setOrderWithOrderLinesDtoTranslator(
			OrderWithOrderLinesDtoTranslator object) {
		this.orderWithOrderLinesDtoTranslator = object;
	}

	/** 
	 * @return The orderWithOrderLinesDtoTranslator to get.
	 *
	 */
	public OrderWithOrderLinesDtoTranslator getOrderWithOrderLinesDtoTranslator() {
		return this.orderWithOrderLinesDtoTranslator;
	}

	protected OrderDao orderDao;

	/**
	 * @param object
	 *            The orderDao to set.
	 */
	public void setOrderDao(OrderDao object) {
		this.orderDao = object;
	}

	/** 
	 * @return The orderDao to get.
	 *
	 */
	public OrderDao getOrderDao() {
		return this.orderDao;
	}

	/**
	
	 * Translates a CustomerWithOrdersAndOrderLines dto object into a Customer domain object.
	 * A new domain object will be created passed to the {@link #fromDto(CustomerWithOrdersAndOrderLines, Customer)}.
	.
	 *
	 * @param source The {@link CustomerWithOrdersAndOrderLines} object to translate, may not be {@code null}.
	 * @return {@link Customer}, the resulting domain object.
	 */
	public Customer fromDto(final CustomerWithOrdersAndOrderLines source) {
		return fromDto(source, new HashMap<Object, Object>());
	}

	Customer fromDto(final CustomerWithOrdersAndOrderLines source,
			final Map<Object, Object> translated) {

		Assert.notNull(source, "argument [source] may not be null");
		Assert.isNull(source.getId(),
				"Can not translate a dto with existing id to a new domain object. Dto: "
						+ source);
		Customer target = new Customer(source.getFirstName(), source
				.getLastName(), source.getBirthDate(), source.getCustomerNr()

		);
		return fromDto(source, target, translated);

	}

	/**
	 * Translates a CustomerWithOrdersAndOrderLines dto object into a Customer domain object. All properties in the dto will be mapped to the 
	 * corresponding property in the <code>target</code> domain object. 
	 *
	 * @param source The {@link CustomerWithOrdersAndOrderLines} object to translate, may not be {@code null}.
	 * @param target The {@link Customer} object translated from source, may not be {@code null}.
	 * @return {@link Customer}, the resulting domain object.
	 */
	public Customer fromDto(final CustomerWithOrdersAndOrderLines source,
			final Customer target) {
		return fromDto(source, target, new HashMap<Object, Object>());
	}

	Customer fromDto(final CustomerWithOrdersAndOrderLines source,
			final Customer target, final Map<Object, Object> translated) {

		if (translated.containsKey((source))) {
			return (Customer) translated.get(source);
		}

		Assert.notNull(source, "argument [source] may not be null");
		Assert.notNull(target, "argument [target] may not be null");

		final boolean equals = (source.getId() == null)
				? target.getId() == null
				: source.getId().equals(target.getId());

		if (!equals) {
			throw new IllegalArgumentException(
					"Can not translate a dto to a domain object when the id of the dto differs from the id of the domain object.");
		}

		validateVersion(source, target);

		target.activateValidation(false);

		target.setFirstName(source.getFirstName());

		target.setLastName(source.getLastName());

		target.setBirthDate(source.getBirthDate());

		target.setCustomerNr(source.getCustomerNr());

		translated.put(source, target);

		/*
		 * Synchronize Orders association.
		 */
		Set<Order> ordersToBeRemoved = new HashSet<Order>();
		/* Avoid changing the collection underneath an active iterator. */
		for (Order element : target.getOrders()) {
			if (source.getFromOrders(element.getId()) == null) {
				ordersToBeRemoved.add(element);
			}
		}
		/* Objects to be removed */
		for (Order element : ordersToBeRemoved) {
			target.removeFromOrders(element);
		}
		for (OrderWithOrderLinesDto element : source.getOrders()) {
			if (element.getId() == null) {
				/* A new object to be added */
				target.addToOrders(orderWithOrderLinesDtoTranslator.fromDto(
						element, translated));
			} else {

				/* An existing object to be updated */
				if (target.getFromOrders(element.getId()) == null) {
					// Element is not in target yet, read it from the store and add to target
					Order original = orderDao.retrieve(element.getId());
					Order updated = orderWithOrderLinesDtoTranslator.fromDto(
							element, original, translated);
					target.addToOrders(updated);
				} else {
					// Element is in target already, use this object. No need to add to the collection
					orderWithOrderLinesDtoTranslator.fromDto(element, target
							.getFromOrders(element.getId()), translated);
				}
			}
		}

		target.activateValidation(true);

		return target;
	}

	/**
	 * Translates a Customer domain object into a CustomerWithOrdersAndOrderLines dto object. Properties and associations of the domain object
	 * will be mapped to the corresponding properties and associations in the dto object.
	 * To prevent looping while translating biderectional or circulair associations translated objects will be added to the 'translated' register.    
	 *
	 * @param source The {@link Customer} object to translate.
	 *
	 * @return CustomerWithOrdersAndOrderLines The {@link CustomerWithOrdersAndOrderLines} object translated from source.
	 */
	public CustomerWithOrdersAndOrderLines toDto(final Customer source) {
		return toDto(source, new HashMap<Object, Object>());
	}

	CustomerWithOrdersAndOrderLines toDto(final Customer source,
			final Map<Object, Object> translated) {
		if (translated.containsKey((source))) {
			return (CustomerWithOrdersAndOrderLines) translated.get(source);
		}
		Assert.notNull(source, "argument [source] may not be null");
		CustomerWithOrdersAndOrderLines result = new CustomerWithOrdersAndOrderLines(
				source.getId(), source.getVersion());
		result.setFirstName(source.getFirstName());
		result.setLastName(source.getLastName());
		result.setBirthDate(source.getBirthDate());
		result.setCustomerNr(source.getCustomerNr());

		translated.put(source, result);

		for (Order element : source.getOrders()) {
			result.addToOrders(orderWithOrderLinesDtoTranslator.toDto(element,
					translated));
		}

		return result;
	}

	/**
	 * Translates a CustomerWithOrdersAndOrderLines dto object into a CustomerExample Example domain object. 
	 * All properties in the dto will be mapped to the corresponding property in the <code>target</code> domain object. 
	 * Association references in the dto will not be translated into the <code>target</code> domain object.
	 *
	 * @param source The {@link CustomerWithOrdersAndOrderLines} object to translate.
	 *
	 * @return {@link CustomerExample}, the resulting businessclass object.
	 */
	public CustomerExample exampleFromDto(
			final CustomerWithOrdersAndOrderLines source) {
		Assert.notNull(source, "argument [source] may not be null");
		CustomerExample result = new CustomerExample();

		if (source.getFirstName() != null) {
			result.setFirstName(source.getFirstName());
		}
		if (source.getLastName() != null) {
			result.setLastName(source.getLastName());
		}
		if (source.getBirthDate() != null) {
			result.setBirthDate(source.getBirthDate());
		}
		if (source.getCustomerNr() != null) {
			result.setCustomerNr(source.getCustomerNr());
		}

		return result;
	}

	/**
	 * Validate that the version of the DTO and the business object are valid.
	 * The DTO may only have a version if the domain object also has a version.
	 * When they both have a version and the DTO version is less, another user
	 * has updated the domain object in the meantime, if it is equal, all is
	 * well. If it is more, an unexpected situation occurs: the DTOs is more new
	 * then the domain object: this is not possible.
	 * 
	 * @param source
	 *            The DTO.
	 * @param target
	 *            The domain object target.
	 */
	private void validateVersion(final CustomerWithOrdersAndOrderLines source,
			final Customer target) {
		final Integer sourceVersion = source.getVersion();
		final Integer targetVersion = target.getVersion();

		// FIXME the DTO translator should not know that -1 is the default unpersisted value!
		final boolean equals = (sourceVersion == null)
				? targetVersion == -1
				: sourceVersion.equals(targetVersion);

		if (!equals) {
			throw new ConcurrentUpdateException(
					"Versions of source and target do not match for dto "
							+ source + ", source is " + sourceVersion
							+ ", target is " + targetVersion + ".");
		}
	}
}