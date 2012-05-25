
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:13 CEST 2011
 *     Application model: CasusOverlegDto
 *     Generator        : Mod4j DatacontractDsl generator: Translators.xpt
 */

package org.company.recordshop.service.dto.translators;

import java.util.HashMap;
import java.util.Map;

import org.company.recordshop.domain.CasusOverleg;
import org.company.recordshop.domain.CasusOverlegExample;
import org.company.recordshop.service.dto.CasusOverlegDto;
import org.mod4j.runtime.exception.ConcurrentUpdateException;
import org.springframework.util.Assert;

/**
 * Translator for translating CasusOverleg domain objects from- and to CasusOverlegDto data transfer objects. 
 *
 * @author generated by Mod4j
 */
public class CasusOverlegDtoTranslator {

	/**
	
	 * Translates a CasusOverlegDto dto object into a CasusOverleg domain object.
	 * A new domain object will be created passed to the {@link #fromDto(CasusOverlegDto, CasusOverleg)}.
	.
	 *
	 * @param source The {@link CasusOverlegDto} object to translate, may not be {@code null}.
	 * @return {@link CasusOverleg}, the resulting domain object.
	 */
	public CasusOverleg fromDto(final CasusOverlegDto source) {
		return fromDto(source, new HashMap<Object, Object>());
	}

	CasusOverleg fromDto(final CasusOverlegDto source,
			final Map<Object, Object> translated) {

		Assert.notNull(source, "argument [source] may not be null");
		Assert.isNull(source.getId(),
				"Can not translate a dto with existing id to a new domain object. Dto: "
						+ source);
		CasusOverleg target = new CasusOverleg(source.getNaam(), source
				.getDatum()

		);
		return fromDto(source, target, translated);

	}

	/**
	 * Translates a CasusOverlegDto dto object into a CasusOverleg domain object. All properties in the dto will be mapped to the 
	 * corresponding property in the <code>target</code> domain object. 
	 *
	 * @param source The {@link CasusOverlegDto} object to translate, may not be {@code null}.
	 * @param target The {@link CasusOverleg} object translated from source, may not be {@code null}.
	 * @return {@link CasusOverleg}, the resulting domain object.
	 */
	public CasusOverleg fromDto(final CasusOverlegDto source,
			final CasusOverleg target) {
		return fromDto(source, target, new HashMap<Object, Object>());
	}

	CasusOverleg fromDto(final CasusOverlegDto source,
			final CasusOverleg target, final Map<Object, Object> translated) {

		if (translated.containsKey((source))) {
			return (CasusOverleg) translated.get(source);
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

		target.setNaam(source.getNaam());

		target.setDatum(source.getDatum());

		translated.put(source, target);

		target.activateValidation(true);

		return target;
	}

	/**
	 * Translates a CasusOverleg domain object into a CasusOverlegDto dto object. Properties and associations of the domain object
	 * will be mapped to the corresponding properties and associations in the dto object.
	 * To prevent looping while translating biderectional or circulair associations translated objects will be added to the 'translated' register.    
	 *
	 * @param source The {@link CasusOverleg} object to translate.
	 *
	 * @return CasusOverlegDto The {@link CasusOverlegDto} object translated from source.
	 */
	public CasusOverlegDto toDto(final CasusOverleg source) {
		return toDto(source, new HashMap<Object, Object>());
	}

	CasusOverlegDto toDto(final CasusOverleg source,
			final Map<Object, Object> translated) {
		if (translated.containsKey((source))) {
			return (CasusOverlegDto) translated.get(source);
		}
		Assert.notNull(source, "argument [source] may not be null");
		CasusOverlegDto result = new CasusOverlegDto(source.getId(), source
				.getVersion());
		result.setNaam(source.getNaam());
		result.setDatum(source.getDatum());

		translated.put(source, result);

		return result;
	}

	/**
	 * Translates a CasusOverlegDto dto object into a CasusOverlegExample Example domain object. 
	 * All properties in the dto will be mapped to the corresponding property in the <code>target</code> domain object. 
	 * Association references in the dto will not be translated into the <code>target</code> domain object.
	 *
	 * @param source The {@link CasusOverlegDto} object to translate.
	 *
	 * @return {@link CasusOverlegExample}, the resulting businessclass object.
	 */
	public CasusOverlegExample exampleFromDto(final CasusOverlegDto source) {
		Assert.notNull(source, "argument [source] may not be null");
		CasusOverlegExample result = new CasusOverlegExample();

		if (source.getNaam() != null) {
			result.setNaam(source.getNaam());
		}
		if (source.getDatum() != null) {
			result.setDatum(source.getDatum());
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
	private void validateVersion(final CasusOverlegDto source,
			final CasusOverleg target) {
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
