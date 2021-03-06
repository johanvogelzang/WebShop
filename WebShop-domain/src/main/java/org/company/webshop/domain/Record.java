
/**
 * Extension point, initially generated by Mod4j. 
 *     Time             : Sat May 15 10:32:42 CEST 2010
 *     Application model: Record
 *     Generator        :  Mod4j BusinessDomainDsl generator: NewJavaBean.xpt
 *
 * It is intended to customize and maintain this file by hand. 
 * If you remove this file, it will be regenerated by Mod4j to its original state.
 */

package org.company.webshop.domain;

import org.company.webshop.domain.RecordImplBase;
import org.company.webshop.domain.RecordTypeEnum;

/**
 * A Record is a representation of a physical medium containing one or more musical compositions.
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
public class Record extends RecordImplBase {

	/**
	 * Default no-argument constructor for Record 
	 */
	protected Record() {

	}

	/**
	 * Minimal constructor for Record
	 * @param asin (String) 
	 * @param price (Float) 
	 * @param type (RecordTypeEnum) 
	 */
	public Record(String asin, Float price, RecordTypeEnum type) {
		super(asin, price, type);
	}

}
