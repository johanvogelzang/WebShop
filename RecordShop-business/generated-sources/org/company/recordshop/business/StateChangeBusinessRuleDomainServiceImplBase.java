
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:14 CEST 2011
 *     Application model: StateChangeBusinessRule
 *     Generator        : Mod4j ServiceDsl generator: BusinessServiceImplBase.xpt
 */

package org.company.recordshop.business;

import java.util.List;
import java.util.ArrayList;
import org.springframework.util.Assert;

import org.company.recordshop.domain.Organisatie;
import org.company.recordshop.domain.OrganisatieExample;
import org.company.recordshop.data.OrganisatieDao;
import org.company.recordshop.domain.Kader;
import org.company.recordshop.domain.KaderExample;
import org.company.recordshop.data.KaderDao;
import org.company.recordshop.domain.CasusOverleg;
import org.company.recordshop.domain.CasusOverlegExample;
import org.company.recordshop.data.CasusOverlegDao;

/**
 * @author Generated by Mod4j
 */
abstract public class StateChangeBusinessRuleDomainServiceImplBase
		implements
			StateChangeBusinessRuleDomainServiceBase {

	protected OrganisatieDao organisatieDao;

	/**
	 * @param object
	 *            The organisatieDao to set.
	 */
	public void setOrganisatieDao(OrganisatieDao object) {
		this.organisatieDao = object;
	}

	/** 
	 * @return The organisatieDao to get.
	 *
	 */
	public OrganisatieDao getOrganisatieDao() {
		return this.organisatieDao;
	}

	protected KaderDao kaderDao;

	/**
	 * @param object
	 *            The kaderDao to set.
	 */
	public void setKaderDao(KaderDao object) {
		this.kaderDao = object;
	}

	/** 
	 * @return The kaderDao to get.
	 *
	 */
	public KaderDao getKaderDao() {
		return this.kaderDao;
	}

	protected CasusOverlegDao casusOverlegDao;

	/**
	 * @param object
	 *            The casusOverlegDao to set.
	 */
	public void setCasusOverlegDao(CasusOverlegDao object) {
		this.casusOverlegDao = object;
	}

	/** 
	 * @return The casusOverlegDao to get.
	 *
	 */
	public CasusOverlegDao getCasusOverlegDao() {
		return this.casusOverlegDao;
	}

	/**
	 * {@inheritDoc} 
	 */
	public Long createOrganisatie(Organisatie object) {
		Assert.notNull(object, "argument [object] may not be null");
		return organisatieDao.add(object);
	}

	/**
	 * {@inheritDoc} 
	 */
	public Long createCasusOverleg(CasusOverleg object) {
		Assert.notNull(object, "argument [object] may not be null");
		return casusOverlegDao.add(object);
	}

	/**
	 * {@inheritDoc} 
	 */
	public Long createKader(Kader object) {
		Assert.notNull(object, "argument [object] may not be null");
		return kaderDao.add(object);
	}

	/**
	 * {@inheritDoc} 
	 */
	public Organisatie readOrganisatie(Long id) {
		Assert.notNull(id, "argument [id] may not be null");
		return organisatieDao.retrieve(id);
	}

	/**
	 * {@inheritDoc} 
	 */
	public CasusOverleg readCasusOverleg(Long id) {
		Assert.notNull(id, "argument [id] may not be null");
		return casusOverlegDao.retrieve(id);
	}

	/**
	 * {@inheritDoc} 
	 */
	public Kader readKader(Long id) {
		Assert.notNull(id, "argument [id] may not be null");
		return kaderDao.retrieve(id);
	}

	/**
	 * {@inheritDoc} 
	 */
	public void updateOrganisatie(Organisatie object) {
		Assert.notNull(object, "argument [object] may not be null");
	}

	/**
	 * {@inheritDoc} 
	 */
	public void updateCasusOverleg(CasusOverleg object) {
		Assert.notNull(object, "argument [object] may not be null");
	}

	/**
	 * {@inheritDoc} 
	 */
	public void updateKader(Kader object) {
		Assert.notNull(object, "argument [object] may not be null");
	}

	/**
	 * {@inheritDoc} 
	 */
	public void deleteOrganisatie(Organisatie object) {
		Assert.notNull(object, "argument [object] may not be null");
		organisatieDao.delete(object);
	}

	/**
	 * {@inheritDoc} 
	 */
	public void deleteCasusOverleg(CasusOverleg object) {
		Assert.notNull(object, "argument [object] may not be null");
		casusOverlegDao.delete(object);
	}

	/**
	 * {@inheritDoc} 
	 */
	public void deleteKader(Kader object) {
		Assert.notNull(object, "argument [object] may not be null");
		kaderDao.delete(object);
	}

}