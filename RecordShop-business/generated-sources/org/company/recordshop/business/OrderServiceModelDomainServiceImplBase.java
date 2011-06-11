
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:14 CEST 2011
 *     Application model: OrderServiceModel
 *     Generator        : Mod4j ServiceDsl generator: BusinessServiceImplBase.xpt
 */

package org.company.recordshop.business;

import java.util.List;
import java.util.ArrayList;
import org.springframework.util.Assert;

import org.company.recordshop.domain.Order;
import org.company.recordshop.domain.OrderExample;
import org.company.recordshop.data.OrderDao;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.domain.CustomerExample;
import org.company.recordshop.data.CustomerDao;
import org.company.recordshop.domain.OrderLine;
import org.company.recordshop.domain.OrderLineExample;
import org.company.recordshop.data.OrderLineDao;

/**
 * @author Generated by Mod4j
 */
abstract public class OrderServiceModelDomainServiceImplBase
		implements
			OrderServiceModelDomainServiceBase {

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

	protected CustomerDao customerDao;

	/**
	 * @param object
	 *            The customerDao to set.
	 */
	public void setCustomerDao(CustomerDao object) {
		this.customerDao = object;
	}

	/** 
	 * @return The customerDao to get.
	 *
	 */
	public CustomerDao getCustomerDao() {
		return this.customerDao;
	}

	protected OrderLineDao orderLineDao;

	/**
	 * @param object
	 *            The orderLineDao to set.
	 */
	public void setOrderLineDao(OrderLineDao object) {
		this.orderLineDao = object;
	}

	/** 
	 * @return The orderLineDao to get.
	 *
	 */
	public OrderLineDao getOrderLineDao() {
		return this.orderLineDao;
	}

	/**
	 * {@inheritDoc} 
	 */
	public Long createOrder(Order object) {
		Assert.notNull(object, "argument [object] may not be null");
		return orderDao.add(object);
	}

	/**
	 * {@inheritDoc} 
	 */
	public Customer readCustomer(Long id) {
		Assert.notNull(id, "argument [id] may not be null");
		return customerDao.retrieve(id);
	}

	/**
	 * {@inheritDoc} 
	 */
	public Order readOrder(Long id) {
		Assert.notNull(id, "argument [id] may not be null");
		return orderDao.retrieve(id);
	}

	/**
	 * {@inheritDoc} 
	 */
	public void updateOrder(Order object) {
		Assert.notNull(object, "argument [object] may not be null");
	}

	/**
	 * {@inheritDoc} 
	 */
	public void deleteOrder(Order object) {
		Assert.notNull(object, "argument [object] may not be null");
		orderDao.delete(object);
	}

}