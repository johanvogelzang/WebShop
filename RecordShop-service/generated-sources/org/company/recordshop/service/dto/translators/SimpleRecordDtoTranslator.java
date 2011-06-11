
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:12 CEST 2011
 *     Application model: SimpleRecordDto
 *     Generator        : Mod4j DatacontractDsl generator: Translators.xpt
 */

package org.company.recordshop.service.dto.translators;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import org.springframework.util.Assert;
import org.mod4j.runtime.exception.ConcurrentUpdateException;
import org.company.recordshop.domain.Record;
import org.company.recordshop.domain.RecordExample;
import org.company.recordshop.service.dto.SimpleRecordDto;

/**
 * Translator for translating Record domain objects from- and to SimpleRecordDto data transfer objects. 
 *
 * @author generated by Mod4j
 */
public class SimpleRecordDtoTranslator {

	private RecordTypeEnumDtoTranslator typeTranslator = new RecordTypeEnumDtoTranslator();

	/**
	
	 * Translates a SimpleRecordDto dto object into a Record domain object.
	 * A new domain object will be created passed to the {@link #fromDto(SimpleRecordDto, Record)}.
	.
	 *
	 * @param source The {@link SimpleRecordDto} object to translate, may not be {@code null}.
	 * @return {@link Record}, the resulting domain object.
	 */
	public Record fromDto(final SimpleRecordDto source) {
		return fromDto(source, new HashMap<Object, Object>());
	}

	Record fromDto(final SimpleRecordDto source,
			final Map<Object, Object> translated) {

		Assert.notNull(source, "argument [source] may not be null");
		Assert.isNull(source.getId(),
				"Can not translate a dto with existing id to a new domain object. Dto: "
						+ source);
		Record target = new Record(source.getAsin(), source.getPrice(),
				typeTranslator.fromDto(source.getType())

		);
		return fromDto(source, target, translated);

	}

	/**
	 * Translates a SimpleRecordDto dto object into a Record domain object. All properties in the dto will be mapped to the 
	 * corresponding property in the <code>target</code> domain object. 
	 *
	 * @param source The {@link SimpleRecordDto} object to translate, may not be {@code null}.
	 * @param target The {@link Record} object translated from source, may not be {@code null}.
	 * @return {@link Record}, the resulting domain object.
	 */
	public Record fromDto(final SimpleRecordDto source, final Record target) {
		return fromDto(source, target, new HashMap<Object, Object>());
	}

	Record fromDto(final SimpleRecordDto source, final Record target,
			final Map<Object, Object> translated) {

		if (translated.containsKey((source))) {
			return (Record) translated.get(source);
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

		target.setAsin(source.getAsin());

		target.setPrice(source.getPrice());

		target.setType(typeTranslator.fromDto(source.getType()));

		translated.put(source, target);

		target.activateValidation(true);

		return target;
	}

	/**
	 * Translates a Record domain object into a SimpleRecordDto dto object. Properties and associations of the domain object
	 * will be mapped to the corresponding properties and associations in the dto object.
	 * To prevent looping while translating biderectional or circulair associations translated objects will be added to the 'translated' register.    
	 *
	 * @param source The {@link Record} object to translate.
	 *
	 * @return SimpleRecordDto The {@link SimpleRecordDto} object translated from source.
	 */
	public SimpleRecordDto toDto(final Record source) {
		return toDto(source, new HashMap<Object, Object>());
	}

	SimpleRecordDto toDto(final Record source,
			final Map<Object, Object> translated) {
		if (translated.containsKey((source))) {
			return (SimpleRecordDto) translated.get(source);
		}
		Assert.notNull(source, "argument [source] may not be null");
		SimpleRecordDto result = new SimpleRecordDto(source.getId(), source
				.getVersion());
		result.setAsin(source.getAsin());
		result.setPrice(source.getPrice());
		result.setType(typeTranslator.toDto(source.getType()));

		translated.put(source, result);

		return result;
	}

	/**
	 * Translates a SimpleRecordDto dto object into a RecordExample Example domain object. 
	 * All properties in the dto will be mapped to the corresponding property in the <code>target</code> domain object. 
	 * Association references in the dto will not be translated into the <code>target</code> domain object.
	 *
	 * @param source The {@link SimpleRecordDto} object to translate.
	 *
	 * @return {@link RecordExample}, the resulting businessclass object.
	 */
	public RecordExample exampleFromDto(final SimpleRecordDto source) {
		Assert.notNull(source, "argument [source] may not be null");
		RecordExample result = new RecordExample();

		if (source.getAsin() != null) {
			result.setAsin(source.getAsin());
		}
		if (source.getPrice() != null) {
			result.setPrice(source.getPrice());
		}
		if (source.getType() != null) {
			result.setType(typeTranslator.fromDto(source.getType()));
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
	private void validateVersion(final SimpleRecordDto source,
			final Record target) {
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
