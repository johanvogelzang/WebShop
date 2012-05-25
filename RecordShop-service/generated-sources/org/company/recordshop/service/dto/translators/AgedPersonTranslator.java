
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:12 CEST 2011
 *     Application model: AgedPerson
 *     Generator        : Mod4j DatacontractDsl generator: Translators.xpt
 */

package org.company.recordshop.service.dto.translators;

import java.util.HashMap;
import java.util.Map;

import org.company.recordshop.domain.Person;
import org.company.recordshop.domain.PersonExample;
import org.company.recordshop.service.dto.AgedPerson;
import org.mod4j.runtime.exception.ConcurrentUpdateException;
import org.springframework.util.Assert;

/**
 * Translator for translating Person domain objects from- and to AgedPerson data transfer objects. 
 *
 * @author generated by Mod4j
 */
public class AgedPersonTranslator {

	/**
	.
	 *
	 * @param source The {@link AgedPerson} object to translate, may not be {@code null}.
	 * @return {@link Person}, the resulting domain object.
	 */
	public Person fromDto(final AgedPerson source) {
		return fromDto(source, new HashMap<Object, Object>());
	}

	Person fromDto(final AgedPerson source, final Map<Object, Object> translated) {

		throw new IllegalArgumentException(
				"This source dto does not contain all non-nullable properties of the domain object to be created: "
						+ source.toString());

	}

	/**
	 * Translates a AgedPerson dto object into a Person domain object. All properties in the dto will be mapped to the 
	 * corresponding property in the <code>target</code> domain object. 
	 *
	 * @param source The {@link AgedPerson} object to translate, may not be {@code null}.
	 * @param target The {@link Person} object translated from source, may not be {@code null}.
	 * @return {@link Person}, the resulting domain object.
	 */
	public Person fromDto(final AgedPerson source, final Person target) {
		return fromDto(source, target, new HashMap<Object, Object>());
	}

	Person fromDto(final AgedPerson source, final Person target,
			final Map<Object, Object> translated) {

		if (translated.containsKey((source))) {
			return (Person) translated.get(source);
		}

		Assert.notNull(source, "argument [source] may not be null");
		Assert.notNull(target, "argument [target] may not be null");

		final boolean equals = (source.getId() == null)
				? target.getId() == null
				: source.getId().equals(target.getId());

		if (!equals) {
			throw new IllegalArgumentException(
					"Can not translate a dto to a domain object when the id of the dto differs from the id of the domain object.");
		}

		validateVersion(source, target);

		target.activateValidation(false);

		target.setFirstName(source.getFirstName());

		target.setLastName(source.getLastName());

		translated.put(source, target);

		target.activateValidation(true);

		return target;
	}

	/**
	 * Translates a Person domain object into a AgedPerson dto object. Properties and associations of the domain object
	 * will be mapped to the corresponding properties and associations in the dto object.
	 * To prevent looping while translating biderectional or circulair associations translated objects will be added to the 'translated' register.    
	 *
	 * @param source The {@link Person} object to translate.
	 *
	 * @return AgedPerson The {@link AgedPerson} object translated from source.
	 */
	public AgedPerson toDto(final Person source) {
		return toDto(source, new HashMap<Object, Object>());
	}

	AgedPerson toDto(final Person source, final Map<Object, Object> translated) {
		if (translated.containsKey((source))) {
			return (AgedPerson) translated.get(source);
		}
		Assert.notNull(source, "argument [source] may not be null");
		AgedPerson result = new AgedPerson(source.getId(), source.getVersion());
		result.setFirstName(source.getFirstName());
		result.setLastName(source.getLastName());
		result.setAge(source.getAge());

		translated.put(source, result);

		return result;
	}

	/**
	 * Translates a AgedPerson dto object into a PersonExample Example domain object. 
	 * All properties in the dto will be mapped to the corresponding property in the <code>target</code> domain object. 
	 * Association references in the dto will not be translated into the <code>target</code> domain object.
	 *
	 * @param source The {@link AgedPerson} object to translate.
	 *
	 * @return {@link PersonExample}, the resulting businessclass object.
	 */
	public PersonExample exampleFromDto(final AgedPerson source) {
		Assert.notNull(source, "argument [source] may not be null");
		PersonExample result = new PersonExample();

		if (source.getFirstName() != null) {
			result.setFirstName(source.getFirstName());
		}
		if (source.getLastName() != null) {
			result.setLastName(source.getLastName());
		}

		return result;
	}

	/**
	 * Validate that the version of the DTO and the business object are valid.
	 * The DTO may only have a version if the domain object also has a version.
	 * When they both have a version and the DTO version is less, another user
	 * has updated the domain object in the meantime, if it is equal, all is
	 * well. If it is more, an unexpected situation occurs: the DTOs is more new
	 * then the domain object: this is not possible.
	 * 
	 * @param source
	 *            The DTO.
	 * @param target
	 *            The domain object target.
	 */
	private void validateVersion(final AgedPerson source, final Person target) {
		final Integer sourceVersion = source.getVersion();
		final Integer targetVersion = target.getVersion();

		// FIXME the DTO translator should not know that -1 is the default unpersisted value!
		final boolean equals = (sourceVersion == null)
				? targetVersion == -1
				: sourceVersion.equals(targetVersion);

		if (!equals) {
			throw new ConcurrentUpdateException(
					"Versions of source and target do not match for dto "
							+ source + ", source is " + sourceVersion
							+ ", target is " + targetVersion + ".");
		}
	}
}
