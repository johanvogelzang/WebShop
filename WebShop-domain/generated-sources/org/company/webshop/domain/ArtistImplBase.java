
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:08 CEST 2011
 *     Application model: Artist
 *     Generator        : Mod4j BusinessDomainDsl generator: NewJavaBean.xpt
 */

package org.company.webshop.domain;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.company.webshop.domain.Artist;
import org.company.webshop.domain.Person;
import org.company.webshop.domain.Record;
import org.joda.time.DateTime;
import org.mod4j.runtime.validation.MaxLengthValidator;
import org.mod4j.runtime.validation.NotNullValidator;

/**
 * An artist is a Person who has had a role in producing a Record
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
@SuppressWarnings("serial")
public abstract class ArtistImplBase extends Person
		implements
			java.io.Serializable {

	/**
	 * toString method for ArtistImplBase
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("org.company.webshop.domain.Artist[");
		result.append("id=");
		result.append(getId());
		result.append(",");
		result.append("version=");
		result.append(getVersion());

		result.append(",");
		result.append("firstName=");
		result.append(firstName);

		result.append(",");
		result.append("lastName=");
		result.append(lastName);

		result.append(",");
		result.append("birthDate=");
		result.append(birthDate);

		result.append(",");
		result.append("numberOfEars=");
		result.append(numberOfEars);

		result.append(",");
		result.append("sexe=");
		result.append(sexe);

		result.append(",");
		result.append("artistName=");
		result.append(artistName);

		result.append(",");
		result.append("biography=");
		result.append(biography);

		result.append("]");
		return result.toString();
	}

	/**
	 *  artistName: 
	 */
	protected String artistName;

	/**
	 *  biography: 
	 */
	protected String biography;

	public static final Integer BIOGRAPHY_MAXLENGTH = 32000;

	private Set<Record> records = new HashSet<Record>();

	/**
	 * @return records (Set<Record>).
	 */
	public Set<Record> getRecords() {
		return Collections.unmodifiableSet(this.records);
	}

	/**
	 * @param id
	 *        id of the collection element to return
	 *
	 * @return records (Set<Record>)
	 * @return records (Set<Record>)
	 *         with the given id.
	 */
	public Record getFromRecords(Long id) {
		if (id == null) {
			return null;
		}
		for (Record record : this.records) {
			if (id.equals(record.getId())) {
				return record;
			}
		}
		return null;
	}

	/**
	 * Implements adding single element to a collection.
	 */
	public void addToRecords(Record element) {
		if (element == null) {
			return;
		}
		if (!records.contains(element)) {
			records.add(element);
			element.addToContributors((Artist) this);
			validation.validate();
		}
	}

	/**
	 * Implements removing a single element from a collection.
	 */
	public boolean removeFromRecords(Record element) {
		if (element == null) {
			return false;
		}
		if (records.contains(element)) {
			this.records.remove(element);
			element.removeFromContributors((Artist) this);
			validation.validate();
			return true;
		}
		return false;
	}

	private void addValidators() {

		validation
				.addValidator(new NotNullValidator(Artist.class, "artistName"));

		validation.addValidator(new MaxLengthValidator(Artist.class,
				"biography", BIOGRAPHY_MAXLENGTH));

	}

	/**
	 * Default no-argument constructor for ArtistImplBase 
	 */
	protected ArtistImplBase() {
		super();
		addValidators();
	}

	/**
	 * Minimal constructor for ArtistImplBase
	 *
	 * @param firstName (String) First name of the person.
	 * @param lastName (String) Last name of the person.
	 * @param birthDate (DateTime) 
	 * @param artistName (String) 
	 */
	public ArtistImplBase(String firstName, String lastName,
			DateTime birthDate, String artistName) {
		super(firstName, lastName, birthDate);

		this.artistName = artistName;
		addValidators();
		validation.validate();
	}

	/**
	 * @return artistName (String) 
	 */
	public String getArtistName() {
		return this.artistName;
	}

	/**
	 * @return biography (String) 
	 */
	public String getBiography() {
		return this.biography;
	}

	/**
	 * @param artistName (String) 
	 */
	public void setArtistName(final String artistName) {
		this.artistName = artistName;
		validation.validate();
	}

	/**
	 * @param biography (String) 
	 */
	public void setBiography(final String biography) {
		this.biography = biography;
		validation.validate();
	}

	/**
	 * Activate/deactivate validation for this business class.
	 * When set to active the validation will immediately be executed.
	 * 
	 * @param value (boolean) 
	 */
	public void activateValidation(boolean value) {

		this.validation.setActive(value);
		if (value) {
			validation.validate();
		}
	}

}