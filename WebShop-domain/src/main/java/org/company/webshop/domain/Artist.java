
/**
 * Extension point, initially generated by Mod4j. 
 *     Time             : Sat May 15 10:32:42 CEST 2010
 *     Application model: Artist
 *     Generator        :  Mod4j BusinessDomainDsl generator: NewJavaBean.xpt
 *
 * It is intended to customize and maintain this file by hand. 
 * If you remove this file, it will be regenerated by Mod4j to its original state.
 */

package org.company.webshop.domain;

import org.company.webshop.domain.ArtistImplBase;
import org.joda.time.DateTime;

/**
 * An artist is a Person who has had a role in producing a Record
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
public class Artist extends ArtistImplBase {

	/**
	 * Default no-argument constructor for Artist 
	 */
	protected Artist() {
		super();
	}

	/**
	 * Minimal constructor for Artist
	 * @param firstName (String) First name of the person.
	 * @param lastName (String) Last name of the person.
	 * @param birthDate (DateTime) 
	 * @param artistName (String) 
	 */
	public Artist(String firstName, String lastName, DateTime birthDate,
			String artistName) {
		super(firstName, lastName, birthDate, artistName);
	}

}