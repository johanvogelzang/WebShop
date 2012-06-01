
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:14 CEST 2011
 *     Application model: Records
 *     Generator        : Mod4j ServiceDsl generator: LocalServiceImplBase.xpt
 */

package org.company.webshop.service;

import java.util.ArrayList;
import java.util.List;

import org.company.webshop.business.RecordsDomainService;
import org.company.webshop.domain.Record;
import org.company.webshop.domain.RecordExample;
import org.company.webshop.service.dto.FullRecordDto;
import org.company.webshop.service.dto.translators.FullRecordDtoTranslator;
import org.springframework.util.Assert;

/**
 * @author Generated by Mod4j
 */
abstract public class RecordsLocalServiceImplBase
		implements
			RecordsLocalService {

	protected RecordsDomainService recordsDomainService;

	/**
	 * @param object
	 *            The recordsDomainService to set.
	 */
	public void setRecordsDomainService(RecordsDomainService object) {
		this.recordsDomainService = object;
	}

	/** 
	 * @return The recordsDomainService to get.
	 *
	 */
	public RecordsDomainService getRecordsDomainService() {
		return this.recordsDomainService;
	}

	protected FullRecordDtoTranslator fullRecordDtoTranslator;

	/**
	 * @param object
	 *            The fullRecordDtoTranslator to set.
	 */
	public void setFullRecordDtoTranslator(FullRecordDtoTranslator object) {
		this.fullRecordDtoTranslator = object;
	}

	/** 
	 * @return The fullRecordDtoTranslator to get.
	 *
	 */
	public FullRecordDtoTranslator getFullRecordDtoTranslator() {
		return this.fullRecordDtoTranslator;
	}

	/**
	 * {@inheritDoc}
	 */
	public List<FullRecordDto> listRecords() {
		List<Record> all = recordsDomainService.listAllRecords();
		List<FullRecordDto> result = new ArrayList<FullRecordDto>();

		for (Record object : all) {
			FullRecordDto item = fullRecordDtoTranslator.toDto(object);
			result.add(item);
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	public List<FullRecordDto> listRecords(final int firstResult,
			final int maxResults) {
		List<Record> range = recordsDomainService.listRecords(firstResult,
				maxResults);
		List<FullRecordDto> result = new ArrayList<FullRecordDto>();

		for (Record object : range) {
			FullRecordDto item = fullRecordDtoTranslator.toDto(object);
			result.add(item);
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	public List<FullRecordDto> listRecords(final int firstResult,
			final int maxResults, final String sortProperty,
			final boolean isAscending) {
		List<Record> range = recordsDomainService.listRecords(firstResult,
				maxResults, sortProperty, isAscending);
		List<FullRecordDto> result = new ArrayList<FullRecordDto>();

		for (Record object : range) {
			FullRecordDto item = fullRecordDtoTranslator.toDto(object);
			result.add(item);
		}
		return result;
	}

	/** [Generated by Mod4j 01]
	 * {@inheritDoc}
	 */
	public List<FullRecordDto> findRecords(FullRecordDto filter) {
		List<Record> found = null;
		List<FullRecordDto> result = new ArrayList<FullRecordDto>();

		RecordExample example = fullRecordDtoTranslator.exampleFromDto(filter);
		found = recordsDomainService.findRecordByExample(example);

		for (Record object : found) {
			FullRecordDto item = fullRecordDtoTranslator.toDto(object);
			result.add(item);
		}
		return result;
	}

	/** [Generated by Mod4j 02]
	 * {@inheritDoc}
	 */
	public List<FullRecordDto> findRecords(final FullRecordDto exampleDto,
			final int firstResult, final int maxResults,
			final String sortProperty, final boolean isAscending) {

		RecordExample example = fullRecordDtoTranslator
				.exampleFromDto(exampleDto);

		List<Record> range = recordsDomainService.findRecordByExampleCount(
				example, firstResult, maxResults, sortProperty, isAscending);
		List<FullRecordDto> result = new ArrayList<FullRecordDto>();

		for (Record object : range) {
			FullRecordDto item = fullRecordDtoTranslator.toDto(object);
			result.add(item);
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	public long countRecords(final FullRecordDto exampleDto) {
		return recordsDomainService.countRecords(fullRecordDtoTranslator
				.exampleFromDto(exampleDto));
	}

	/**
	 * {@inheritDoc}
	 */
	public Long createRecord(FullRecordDto object) {
		Long result = recordsDomainService.createRecord(fullRecordDtoTranslator
				.fromDto(object));
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	public FullRecordDto readRecordAsFullRecordDto(Long id) {
		Record result = recordsDomainService.readRecord(id);
		return (result == null) ? null : fullRecordDtoTranslator.toDto(result);
	}

	/**
	 * {@inheritDoc}
	 */
	public void updateRecord(FullRecordDto object) {
		Record domainObject = recordsDomainService.readRecord(object.getId());
		fullRecordDtoTranslator.fromDto(object, domainObject);
		recordsDomainService.updateRecord(domainObject);
	}

	/**
	 * {@inheritDoc}
	 */
	public void deleteRecord(FullRecordDto object) {
		Assert.notNull(object, "argument [object] may not be null");
		Record existing = recordsDomainService.readRecord(object.getId());
		recordsDomainService.deleteRecord(existing);
	}

	/**
	 * {@inheritDoc}
	 */
	public long countRecords() {
		return recordsDomainService.countRecords();
	}

	// Association related service methods

}