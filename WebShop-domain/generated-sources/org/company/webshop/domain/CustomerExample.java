
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:09 CEST 2011
 *     Application model: Customer
 *     Generator        : Mod4j BusinessDomainDsl generator: NewJavaBean.xpt
 */

package org.company.webshop.domain;

import org.company.webshop.domain.Customer;

/**
 * A subclass of Customer to be used as example object
 * in Query-by-Example (QBE) queries. It turns off validation in the
 * no-argument constructor.
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
public final class CustomerExample extends Customer {

	/**
	 * Minimal public constructor
	 */
	public CustomerExample() {
		activateValidation(false);
		numberOfEars = null;
		sexe = null;
		blackListed = null;
		discountPercentage = null;
	}
}
