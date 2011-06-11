
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:14 CEST 2011
 *     Application model: OrderServiceModel
 *     Generator        : Mod4j ServiceDsl generator: BusinessServiceBase.xpt
 */

package org.company.recordshop.business;

import java.util.List;

import org.company.recordshop.domain.Order;
import org.company.recordshop.domain.OrderExample;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.domain.CustomerExample;
import org.company.recordshop.domain.OrderLine;
import org.company.recordshop.domain.OrderLineExample;

/**
 * @author Generated by Mod4j
 */
public interface OrderServiceModelDomainServiceBase {

	/**
	 * Create a new Order.
	 * 
	 * @param object
	 *            the Order to create.
	 * @return the id of the object created.
	 */
	public Long createOrder(Order object);

	/**
	 * Read an existing Customer.
	 * 
	 * @param id
	 *            the id of the Customer to read.
	 * @return Customer
	 */
	public Customer readCustomer(Long id);

	/**
	 * Read an existing Order.
	 * 
	 * @param id
	 *            the id of the Order to read.
	 * @return Order
	 */
	public Order readOrder(Long id);

	/**
	 * Update an existing Order.
	 * 
	 * @param object
	 *            the representation of the modified Order.
	 */
	public void updateOrder(Order object);

	/**
	 * Delete an Order
	 * 
	 * @param object
	 *            the Order object to delete.
	 */
	public void deleteOrder(Order object);

}