
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:10 CEST 2011
 *     Application model: SubclassEmpty2
 *     Generator        : Mod4j BusinessDomainDsl generator: DaoImplBase.xpt
 */

package org.company.recordshop.data.hibernate.spring;

import java.sql.SQLException;
import java.util.List;

import org.company.recordshop.domain.SubclassEmpty2;
import org.company.recordshop.domain.SubclassEmpty2Example;
import org.company.recordshop.data.SubclassEmpty2DaoBase;

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
 * SubclassEmpty2 Data Access Object (DAO) Implementation. Responsible for Creating,
 * Reading, Updating, Deleting and retrieving lists of SubclassEmpty2 objects in the database.
 * All database access is done here.
 *  
 * @author Generated by Mod4j
 */
public class SubclassEmpty2DaoImplBase extends HibernateDaoSupport
		implements
			SubclassEmpty2DaoBase {

	/**
	 * {@inheritDoc}
	 */
	public SubclassEmpty2 retrieve(Long id) {
		Object o = getHibernateTemplate().get(SubclassEmpty2.class, id);
		if (o == null) {
			return null;
		}
		return (SubclassEmpty2) o;
	}

	/**
	 * {@inheritDoc}
	 */
	public Long add(SubclassEmpty2 object) {
		Long result = (Long) getHibernateTemplate().save(object);
		return result;
	}

	/**
	 * {@inheritDoc}
	 * With Hibernate persisted objects are automatically updated within the session, so nothing should happen here.
	 * 
	 * @param object The object to update.
	 * @return SubclassEmpty2
	 **/
	public void update(SubclassEmpty2 object) {
		// Nothing to do: Hibernate will flush at the end of the transaction.
	}

	/**
	 * {@inheritDoc}
	 */
	public void delete(SubclassEmpty2 object) {
		getHibernateTemplate().delete(object);
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<SubclassEmpty2> listAll() {
		return getHibernateTemplate().find("from SubclassEmpty2");
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<SubclassEmpty2> listPage(final int firstResult,
			final int maxResults) {

		DetachedCriteria criteria = DetachedCriteria
				.forClass(SubclassEmpty2.class);
		return getHibernateTemplate().findByCriteria(criteria, firstResult,
				maxResults);
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<SubclassEmpty2> listPage(final int firstResult,
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
				SubclassEmpty2.class).addOrder(order);
		return getHibernateTemplate().findByCriteria(criteria, firstResult,
				maxResults);
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<SubclassEmpty2> listPageByExample(
			final SubclassEmpty2Example example, final int firstResult,
			final int maxResults, final String sortProperty,
			final boolean isAscending) {
		Assert.notNull(example, "argument [example] may not be null");
		Assert.notNull(sortProperty, "argument [sortProperty] may not be null");
		List<SubclassEmpty2> result;
		result = getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(final Session session)
					throws HibernateException, SQLException {

				org.hibernate.criterion.Order order;
				if (isAscending) {
					order = org.hibernate.criterion.Order.asc(sortProperty);
				} else {
					order = org.hibernate.criterion.Order.desc(sortProperty);
				}
				return session.createCriteria(SubclassEmpty2.class).add(
						Example.create(example).enableLike(MatchMode.ANYWHERE)
								.ignoreCase()).setFirstResult(firstResult)
						.setMaxResults(maxResults).addOrder(order).list();
			}
		});
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	public long count() {
		return ((Long) getHibernateTemplate().iterate(
				"select count(*) from SubclassEmpty2").next()).longValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public long count(final SubclassEmpty2Example example) {
		Assert.notNull(example, "argument [example] may not be null");
		List<Integer> result;
		result = getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(final Session session)
					throws HibernateException, SQLException {
				Criteria crit = session.createCriteria(SubclassEmpty2.class);
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
	public List<SubclassEmpty2> findByExample(
			final SubclassEmpty2Example example) {
		Assert.notNull(example, "argument [example] may not be null");
		List<SubclassEmpty2> result;
		result = getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(final Session session)
					throws HibernateException, SQLException {
				return session.createCriteria(SubclassEmpty2.class).add(
						Example.create(example).enableLike(MatchMode.ANYWHERE)
								.ignoreCase()).list();
			}
		});
		return result;
	}
}
