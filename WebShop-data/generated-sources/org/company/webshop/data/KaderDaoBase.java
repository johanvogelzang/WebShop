/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:11 CEST 2011
 *     Application model: Kader
 *     Generator        : Mod4j BusinessDomainDsl generator: DaoInterfaceBase.xpt
 */

package org.company.webshop.data;

import java.util.List;

import org.company.webshop.domain.Kader;
import org.company.webshop.domain.KaderExample;

/**
 * KaderDaoBaseData Access Object (DAO). Responsible for accessing database.
 * 
 * @author Mod4j generated
 * 
 */
public interface KaderDaoBase {

	/**
	 * Retrieves a Kader by its ID from the database.
	 * 
	 * @param id id of the Kader to retrieve.
	 * @return Kader retrieved or null when no Kader was found.
	 */
	Kader retrieve(Long id);

	/**
	 * Adds a new Kader to the database
	 * 
	 * @param object
	 *                the Kader to add to the database.
	 * @return the stored Kader.
	 */
	Long add(Kader object);

	/**
	 * Deletes a Kader from the database.
	 * 
	 * @param object
	 *                the Kader to delete
	 */
	void delete(Kader object);

	/**
	 * Selects all Kaders from the database.
	 * 
	 * @return a List of all Kader objects.
	 */
	List<Kader> listAll();

	/**
	 * Selects a range (page) of Kaders from the database.
	 * 
	 * @param firstResult the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults  the maximum number of result objects to retrieve (or <=0 for no limit) 
	 * 
	 * @return a List containing 0 or more Kader objects.
	 *
	 * @see #listPage(int, int)
	 */
	List<Kader> listPage(final int firstResult, final int maxResults);

	/**
	 * Selects a sorted range (page) of Kaders from the database.
	 * 
	 * @param firstResult the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults the maximum number of result objects to retrieve (or <=0 for no limit)
	 * @param sortProperty the property of the object to sort on
	 * @param isAscending should the retruned list be sorted ascending? 
	 * 
	 * @return a sorted List containing 0 or more Kader objects.
	 *
	 * @see #listPage(int, int, String, boolean)
	 */
	List<Kader> listPage(final int firstResult, final int maxResults,
			final String sortProperty, final boolean isAscending);

	/**
	 * Selects a sorted range (page) of Kaders from the database.
	 * 
	 * @param example the example object to which the result objects need to conform
	 * @param firstResult the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults the maximum number of result objects to retrieve (or <=0 for no limit)
	 * @param sortProperty the property of the object to sort on
	 * @param isAscending should the retruned list be sorted ascending? 
	 * 
	 * @return a sorted List containing 0 or more Kader objects.
	 *
	 * @see #listPage(int, int, String, boolean)
	 */
	List<Kader> listPageByExample(final KaderExample example,
			final int firstResult, final int maxResults,
			final String sortProperty, final boolean isAscending);

	/**
	 * Counts the number of persisted Kader objects in the database.
	 * 
	 * @return the number of persisted objects in the database.
	 */
	long count();

	/**
	 * Counts the number of persisted Kader objects in the database that
	 * matches the given example object.
	 *
	 * @param example
	 *                the example object to be counted
	 * 
	 * @return the number of persisted objects in the database.
	 */
	long count(final KaderExample example);

	/**
	 * Selects Kaders from the database that matches an
	 * example object using Query-by-Example(QBE).
	 * 
	 * @param example
	 *                the example object to which the result objects need to conform
	 * @return a List of Kader objects.
	 */
	List<Kader> findByExample(KaderExample example);
}
