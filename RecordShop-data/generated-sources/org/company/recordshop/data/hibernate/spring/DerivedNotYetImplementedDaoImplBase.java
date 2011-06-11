
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:11 CEST 2011
 *     Application model: DerivedNotYetImplemented
 *     Generator        : Mod4j BusinessDomainDsl generator: DaoImplBase.xpt
 */

package org.company.recordshop.data.hibernate.spring;

import java.sql.SQLException;
import java.util.List;

import org.company.recordshop.domain.DerivedNotYetImplemented;
import org.company.recordshop.domain.DerivedNotYetImplementedExample;
import org.company.recordshop.data.DerivedNotYetImplementedDaoBase;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.util.Assert;

/**
 * DerivedNotYetImplemented Data Access Object (DAO) Implementation. Responsible for Creating,
 * Reading, Updating, Deleting and retrieving lists of DerivedNotYetImplemented objects in the database.
 * All database access is done here.
 *  
 * @author Generated by Mod4j
 */
public class DerivedNotYetImplementedDaoImplBase extends HibernateDaoSupport
		implements
			DerivedNotYetImplementedDaoBase {

	/**
	 * {@inheritDoc}
	 */
	public DerivedNotYetImplemented retrieve(Long id) {
		Object o = getHibernateTemplate().get(DerivedNotYetImplemented.class,
				id);
		if (o == null) {
			return null;
		}
		return (DerivedNotYetImplemented) o;
	}

	/**
	 * {@inheritDoc}
	 */
	public Long add(DerivedNotYetImplemented object) {
		Long result = (Long) getHibernateTemplate().save(object);
		return result;
	}

	/**
	 * {@inheritDoc}
	 * With Hibernate persisted objects are automatically updated within the session, so nothing should happen here.
	 * 
	 * @param object The object to update.
	 * @return DerivedNotYetImplemented
	 **/
	public void update(DerivedNotYetImplemented object) {
		// Nothing to do: Hibernate will flush at the end of the transaction.
	}

	/**
	 * {@inheritDoc}
	 */
	public void delete(DerivedNotYetImplemented object) {
		getHibernateTemplate().delete(object);
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<DerivedNotYetImplemented> listAll() {
		return getHibernateTemplate().find("from DerivedNotYetImplemented");
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<DerivedNotYetImplemented> listPage(final int firstResult,
			final int maxResults) {

		DetachedCriteria criteria = DetachedCriteria
				.forClass(DerivedNotYetImplemented.class);
		return getHibernateTemplate().findByCriteria(criteria, firstResult,
				maxResults);
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<DerivedNotYetImplemented> listPage(final int firstResult,
			final int maxResults, final String sortProperty,
			final boolean isAscending) {
		Assert.notNull(sortProperty, "argument [sortProperty] may not be null");
		org.hibernate.criterion.Order order;
		if (isAscending) {
			order = org.hibernate.criterion.Order.asc(sortProperty);
		} else {
			order = org.hibernate.criterion.Order.desc(sortProperty);
		}
		DetachedCriteria criteria = DetachedCriteria.forClass(
				DerivedNotYetImplemented.class).addOrder(order);
		return getHibernateTemplate().findByCriteria(criteria, firstResult,
				maxResults);
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<DerivedNotYetImplemented> listPageByExample(
			final DerivedNotYetImplementedExample example,
			final int firstResult, final int maxResults,
			final String sortProperty, final boolean isAscending) {
		Assert.notNull(example, "argument [example] may not be null");
		Assert.notNull(sortProperty, "argument [sortProperty] may not be null");
		List<DerivedNotYetImplemented> result;
		result = getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(final Session session)
					throws HibernateException, SQLException {

				org.hibernate.criterion.Order order;
				if (isAscending) {
					order = org.hibernate.criterion.Order.asc(sortProperty);
				} else {
					order = org.hibernate.criterion.Order.desc(sortProperty);
				}
				return session.createCriteria(DerivedNotYetImplemented.class)
						.add(
								Example.create(example).enableLike(
										MatchMode.ANYWHERE).ignoreCase())
						.setFirstResult(firstResult).setMaxResults(maxResults)
						.addOrder(order).list();
			}
		});
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	public long count() {
		return ((Long) getHibernateTemplate().iterate(
				"select count(*) from DerivedNotYetImplemented").next())
				.longValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public long count(final DerivedNotYetImplementedExample example) {
		Assert.notNull(example, "argument [example] may not be null");
		List<Integer> result;
		result = getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(final Session session)
					throws HibernateException, SQLException {
				Criteria crit = session
						.createCriteria(DerivedNotYetImplemented.class);
				crit.setProjection(Projections.rowCount());
				crit.add(Example.create(example).enableLike(MatchMode.ANYWHERE)
						.ignoreCase());
				return crit.list();
			}
		});
		return result.get(0);
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<DerivedNotYetImplemented> findByExample(
			final DerivedNotYetImplementedExample example) {
		Assert.notNull(example, "argument [example] may not be null");
		List<DerivedNotYetImplemented> result;
		result = getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(final Session session)
					throws HibernateException, SQLException {
				return session.createCriteria(DerivedNotYetImplemented.class)
						.add(
								Example.create(example).enableLike(
										MatchMode.ANYWHERE).ignoreCase())
						.list();
			}
		});
		return result;
	}
}
