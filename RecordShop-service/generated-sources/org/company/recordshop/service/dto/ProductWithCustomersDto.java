
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:12 CEST 2011
 *     Application model: ProductWithCustomersDto
 *     Generator        : Mod4j DataContractDsl generator: dtoBean.xpt
 */

package org.company.recordshop.service.dto;

import java.util.HashSet;
import java.util.Set;

import org.mod4j.runtime.dto.AbstractDto;

/**
 * 
 *
 * @author generated by Mod4j
 */
public class ProductWithCustomersDto extends AbstractDto {

	/**
	 *  productNumber: 
	 */

	private String productNumber;

	/**
	 *  orderable: 
	 */

	private Boolean orderable;

	/**
	 *  price: 
	 */

	private Float price;

	/**
	 *  buyers: 
	 */

	private Set<SimpleCustomerDto> buyers = new HashSet<SimpleCustomerDto>();

	/**
	 * Default no-argument constructor.
	 */
	public ProductWithCustomersDto() {
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
	public ProductWithCustomersDto(final Long id, final Integer version) {
		super(id, version);
	}

	/**
	 * @param productNumber (String) 
	 */
	public void setProductNumber(final String productNumber) {
		this.productNumber = productNumber;
	}

	/**
	 *
	 * @return productNumber (String) 
	 */
	public String getProductNumber() {
		return this.productNumber;
	}

	/**
	 * @param orderable (Boolean) 
	 */
	public void setOrderable(final Boolean orderable) {
		this.orderable = orderable;
	}

	/**
	 *
	 * @return orderable (Boolean) 
	 */
	public Boolean isOrderable() {
		return this.orderable;
	}

	/**
	 * @param price (Float) 
	 */
	public void setPrice(final Float price) {
		this.price = price;
	}

	/**
	 *
	 * @return price (Float) 
	 */
	public Float getPrice() {
		return this.price;
	}

	/**
	 * @param id
	 *        id of the collection element to return
	 *
	 * @return simpleCustomerDto (SimpleCustomerDto)
	 *         with the given id.
	 */
	public SimpleCustomerDto getFromBuyers(Long id) {
		if (id == null) {
			return null;
		}
		for (SimpleCustomerDto simpleCustomerDto : this.buyers) {
			if (id.equals(simpleCustomerDto.getId())) {
				return simpleCustomerDto;
			}
		}
		return null;
	}
	/**
	 * @return buyers (Set<SimpleCustomerDto>) 
	 */
	public Set<SimpleCustomerDto> getBuyers() {
		return this.buyers;
	}

	/**
	 * Adds a single element to the buyers collection
	 *
	 * @param element The element to add.
	 */
	public void addToBuyers(SimpleCustomerDto element) {

		if (element == null || this.buyers.contains(element)) {
			return;
		}
		this.buyers.add(element);
	}

	/**
	 * Removes a single element from the buyers collection.
	 * 
	 * @param element The element to be removed.
	 */
	public void removeFromBuyers(SimpleCustomerDto element) {

		if (element == null) {
			return;
		}
		this.buyers.remove(element);
	}

	/**
	 * Sets all attributes that have a default value, to their default values.
	 *
	 * @author Generated by Mod4j
	 */
	public void clear() {
		productNumber = null;
		orderable = null;
		price = null;

	}

	/**
	 * toString method for ProductWithCustomersDto
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result
				.append("org.company.recordshop.service.dto.ProductWithCustomersDto[");
		result.append("id=");
		result.append(getId());
		result.append(",");
		result.append("version=");
		result.append(getVersion());

		result.append(",");
		result.append("productNumber=");
		result.append(productNumber);

		result.append(",");
		result.append("orderable=");
		result.append(orderable);

		result.append(",");
		result.append("price=");
		result.append(price);

		result.append("]");
		return result.toString();
	}

}
