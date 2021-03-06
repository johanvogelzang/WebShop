
/**
 * Extension point, initially generated by Mod4j. 
 *     Time             : Thu Mar 04 18:17:53 CET 2010
 *     Application model: Customer
 *     Generator        :  Mod4j BusinessDomainDsl generator: NewJavaBean.xpt
 *
 * It is intended to customize and maintain this file by hand. 
 * If you remove this file, it will be regenerated by Mod4j to its original state.
 */

package org.company.webshop.domain;

import org.company.webshop.domain.CustomerImplBase;
import org.joda.time.DateTime;

/**
 * A Customer represents a Person who orders from the WebShop.
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
public class Customer extends CustomerImplBase {

	/**
	 * Default no-argument constructor for Customer 
	 */
	protected Customer() {
		super();
	}

	/**
	 * Minimal constructor for Customer
	 * @param firstName (String) First name of the person.
	 * @param lastName (String) Last name of the person.
	 * @param birthDate (DateTime) 
	 * @param customerNr (Integer) 
	 */
	public Customer(String firstName, String lastName, DateTime birthDate,
			Integer customerNr) {
		super(firstName, lastName, birthDate, customerNr);
	}

}
