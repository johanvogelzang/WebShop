
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:13 CEST 2011
 *     Application model: OrganisatieDto
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
public class OrganisatieDto extends AbstractDto {

	/**
	 *  naam: 
	 */

	private String naam;

	/**
	 *  overleggen: 
	 */

	private Set<CasusOverlegDto> overleggen = new HashSet<CasusOverlegDto>();

	/**
	 * Default no-argument constructor.
	 */
	public OrganisatieDto() {
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
	public OrganisatieDto(final Long id, final Integer version) {
		super(id, version);
	}

	/**
	 * @param naam (String) 
	 */
	public void setNaam(final String naam) {
		this.naam = naam;
	}

	/**
	 *
	 * @return naam (String) 
	 */
	public String getNaam() {
		return this.naam;
	}

	/**
	 * @param id
	 *        id of the collection element to return
	 *
	 * @return casusOverlegDto (CasusOverlegDto)
	 *         with the given id.
	 */
	public CasusOverlegDto getFromOverleggen(Long id) {
		if (id == null) {
			return null;
		}
		for (CasusOverlegDto casusOverlegDto : this.overleggen) {
			if (id.equals(casusOverlegDto.getId())) {
				return casusOverlegDto;
			}
		}
		return null;
	}
	/**
	 * @return overleggen (Set<CasusOverlegDto>) 
	 */
	public Set<CasusOverlegDto> getOverleggen() {
		return this.overleggen;
	}

	/**
	 * Adds a single element to the overleggen collection
	 *
	 * @param element The element to add.
	 */
	public void addToOverleggen(CasusOverlegDto element) {

		if (element == null || this.overleggen.contains(element)) {
			return;
		}
		this.overleggen.add(element);
	}

	/**
	 * Removes a single element from the overleggen collection.
	 * 
	 * @param element The element to be removed.
	 */
	public void removeFromOverleggen(CasusOverlegDto element) {

		if (element == null) {
			return;
		}
		this.overleggen.remove(element);
	}

	/**
	 * Sets all attributes that have a default value, to their default values.
	 *
	 * @author Generated by Mod4j
	 */
	public void clear() {
		naam = null;

	}

	/**
	 * toString method for OrganisatieDto
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("org.company.recordshop.service.dto.OrganisatieDto[");
		result.append("id=");
		result.append(getId());
		result.append(",");
		result.append("version=");
		result.append(getVersion());

		result.append(",");
		result.append("naam=");
		result.append(naam);

		result.append("]");
		return result.toString();
	}

}
