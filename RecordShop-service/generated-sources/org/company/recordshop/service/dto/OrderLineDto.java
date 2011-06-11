
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:12 CEST 2011
 *     Application model: OrderLineDto
 *     Generator        : Mod4j DataContractDsl generator: dtoBean.xpt
 */

package org.company.recordshop.service.dto;

import org.mod4j.runtime.dto.AbstractDto;

/**
 * Full OrderLine transfer object, containing all the OrderLine attributes (no associations)
 *
 * @author generated by Mod4j
 */
public class OrderLineDto extends AbstractDto {

	/**
	 *  lineNumber: 
	 */

	private Integer lineNumber;

	/**
	 *  quantity: 
	 */

	private Integer quantity = 1;

	/**
	 *  description: 
	 */

	private String description;

	/**
	 *  product: 
	 */

	private FullProductDto product = null; //pppp1

	/**
	 * Default no-argument constructor.
	 */
	public OrderLineDto() {
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
	public OrderLineDto(final Long id, final Integer version) {
		super(id, version);
	}

	/**
	 * @param lineNumber (Integer) 
	 */
	public void setLineNumber(final Integer lineNumber) {
		this.lineNumber = lineNumber;
	}

	/**
	 *
	 * @return lineNumber (Integer) 
	 */
	public Integer getLineNumber() {
		return this.lineNumber;
	}

	/**
	 * @param quantity (Integer) 
	 */
	public void setQuantity(final Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 *
	 * @return quantity (Integer) 
	 */
	public Integer getQuantity() {
		return this.quantity;
	}

	/**
	 * @param description (String) 
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 *
	 * @return description (String) 
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @return FullProductDto (FullProductDto) 
	 */
	public FullProductDto getProduct() {
		return this.product;
	}

	/**  
	 * @param product (FullProductDto) 
	 */
	public void setProduct(final FullProductDto product) {
		this.product = product;
	}

	/**
	 * Sets all attributes that have a default value, to their default values.
	 *
	 * @author Generated by Mod4j
	 */
	public void clear() {
		lineNumber = null;
		quantity = null;
		description = null;

	}

	/**
	 * toString method for OrderLineDto
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("org.company.recordshop.service.dto.OrderLineDto[");
		result.append("id=");
		result.append(getId());
		result.append(",");
		result.append("version=");
		result.append(getVersion());

		result.append(",");
		result.append("lineNumber=");
		result.append(lineNumber);

		result.append(",");
		result.append("quantity=");
		result.append(quantity);

		result.append(",");
		result.append("description=");
		result.append(description);

		result.append("]");
		return result.toString();
	}

}
