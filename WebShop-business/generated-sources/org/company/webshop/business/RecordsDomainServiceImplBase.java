
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:14 CEST 2011
 *     Application model: Records
 *     Generator        : Mod4j ServiceDsl generator: BusinessServiceImplBase.xpt
 */

package org.company.webshop.business;

import java.util.List;

import org.company.webshop.data.RecordDao;
import org.company.webshop.domain.Record;
import org.company.webshop.domain.RecordExample;
import org.springframework.util.Assert;

/**
 * @author Generated by Mod4j
 */
abstract public class RecordsDomainServiceImplBase
		implements
			RecordsDomainServiceBase {

	protected RecordDao recordDao;

	/**
	 * @param object
	 *            The recordDao to set.
	 */
	public void setRecordDao(RecordDao object) {
		this.recordDao = object;
	}

	/** 
	 * @return The recordDao to get.
	 *
	 */
	public RecordDao getRecordDao() {
		return this.recordDao;
	}

	/**
	 * {@inheritDoc} 
	 */
	public Long createRecord(Record object) {
		Assert.notNull(object, "argument [object] may not be null");
		return recordDao.add(object);
	}

	/**
	 * {@inheritDoc} 
	 */
	public Record readRecord(Long id) {
		Assert.notNull(id, "argument [id] may not be null");
		return recordDao.retrieve(id);
	}

	/**
	 * {@inheritDoc} 
	 */
	public void updateRecord(Record object) {
		Assert.notNull(object, "argument [object] may not be null");
	}

	/**
	 * {@inheritDoc} 
	 */
	public void deleteRecord(Record object) {
		Assert.notNull(object, "argument [object] may not be null");
		recordDao.delete(object);
	}

	/**
	 * {@inheritDoc} 
	 */
	public List<Record> listAllRecords() {
		return recordDao.listAll();
	}

	/**
	 * {@inheritDoc} 
	 */
	public List<Record> listRecords(final int firstResult, final int maxResults) {
		return recordDao.listPage(firstResult, maxResults);
	}

	/**
	 * {@inheritDoc} 
	 */
	public List<Record> listRecords(final int firstResult,
			final int maxResults, final String sortProperty,
			final boolean isAscending) {
		return recordDao.listPage(firstResult, maxResults, sortProperty,
				isAscending);
	}

	/**
	 * {@inheritDoc} 
	 */
	public long countRecords() {
		return recordDao.count();
	}

	/**
	 * {@inheritDoc} 
	 */
	public List<Record> findRecordByExample(RecordExample example) {
		Assert.notNull(example, "argument [example] may not be null");
		return this.recordDao.findByExample(example);
	}

	/**
	 * {@inheritDoc} 
	 */
	public List<Record> findRecordByExampleCount(final RecordExample example,
			final int firstResult, final int maxResults,
			final String sortProperty, final boolean isAscending) {
		return recordDao.listPageByExample(example, firstResult, maxResults,
				sortProperty, isAscending);
	}

	/**
	 * {@inheritDoc} 
	 */
	public long countRecords(RecordExample example) {
		return recordDao.count(example);
	}

}
