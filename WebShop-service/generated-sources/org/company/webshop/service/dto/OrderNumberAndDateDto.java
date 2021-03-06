
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:12 CEST 2011
 *     Application model: OrderNumberAndDateDto
 *     Generator        : Mod4j DataContractDsl generator: dtoBean.xpt
 */

package org.company.webshop.service.dto;

import org.joda.time.DateTime;
import org.mod4j.runtime.dto.AbstractDto;

/**
 * Simple Order transfer object.
 *
 * @author generated by Mod4j
 */
public class OrderNumberAndDateDto extends AbstractDto {

	/**
	 *  orderNumber: 
	 */

	private String orderNumber;

	/**
	 *  orderDate: 
	 */

	private DateTime orderDate = new DateTime("2009-01-01");

	/**
	 *  customer: 
	 */

	private SimpleCustomerDto customer = null; //pppp1

	/**
	 * Default no-argument constructor.
	 */
	public OrderNumberAndDateDto() {
		super();
	}

	/**
	 * Constructor for use by the DTO Translator.
	 * 
	 * @param id
	 *            The ID of the referenced business object.
	 * @param version
	 *            The version of the referenced business object.
	 */
	public OrderNumberAndDateDto(final Long id, final Integer version) {
		super(id, version);
	}

	/**
	 * @param orderNumber (String) 
	 */
	public void setOrderNumber(final String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 *
	 * @return orderNumber (String) 
	 */
	public String getOrderNumber() {
		return this.orderNumber;
	}

	/**
	 * @param orderDate (DateTime) 
	 */
	public void setOrderDate(final DateTime orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 *
	 * @return orderDate (DateTime) 
	 */
	public DateTime getOrderDate() {
		return this.orderDate;
	}

	/**
	 * @return SimpleCustomerDto (SimpleCustomerDto) A simple Customer transfer object with a subset of Customer attributes.
	 */
	public SimpleCustomerDto getCustomer() {
		return this.customer;
	}

	/**  
	 * @param customer (SimpleCustomerDto) A simple Customer transfer object with a subset of Customer attributes.
	 */
	public void setCustomer(final SimpleCustomerDto customer) {
		this.customer = customer;
	}

	/**
	 * Sets all attributes that have a default value, to their default values.
	 *
	 * @author Generated by Mod4j
	 */
	public void clear() {
		orderNumber = null;
		orderDate = null;

	}

	/**
	 * toString method for OrderNumberAndDateDto
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result
				.append("org.company.webshop.service.dto.OrderNumberAndDateDto[");
		result.append("id=");
		result.append(getId());
		result.append(",");
		result.append("version=");
		result.append(getVersion());

		result.append(",");
		result.append("orderNumber=");
		result.append(orderNumber);

		result.append(",");
		result.append("orderDate=");
		result.append(orderDate);

		result.append("]");
		return result.toString();
	}

}
