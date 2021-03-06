/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:11 CEST 2011
 *     Application model: CasusOverleg
 *     Generator        : Mod4j BusinessDomainDsl generator: DaoInterfaceBase.xpt
 */

package org.company.webshop.data;

import java.util.List;

import org.company.webshop.domain.CasusOverleg;
import org.company.webshop.domain.CasusOverlegExample;

/**
 * CasusOverlegDaoBaseData Access Object (DAO). Responsible for accessing database.
 * 
 * @author Mod4j generated
 * 
 */
public interface CasusOverlegDaoBase {

	/**
	 * Retrieves a CasusOverleg by its ID from the database.
	 * 
	 * @param id id of the CasusOverleg to retrieve.
	 * @return CasusOverleg retrieved or null when no CasusOverleg was found.
	 */
	CasusOverleg retrieve(Long id);

	/**
	 * Adds a new CasusOverleg to the database
	 * 
	 * @param object
	 *                the CasusOverleg to add to the database.
	 * @return the stored CasusOverleg.
	 */
	Long add(CasusOverleg object);

	/**
	 * Deletes a CasusOverleg from the database.
	 * 
	 * @param object
	 *                the CasusOverleg to delete
	 */
	void delete(CasusOverleg object);

	/**
	 * Selects all CasusOverlegs from the database.
	 * 
	 * @return a List of all CasusOverleg objects.
	 */
	List<CasusOverleg> listAll();

	/**
	 * Selects a range (page) of CasusOverlegs from the database.
	 * 
	 * @param firstResult the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults  the maximum number of result objects to retrieve (or <=0 for no limit) 
	 * 
	 * @return a List containing 0 or more CasusOverleg objects.
	 *
	 * @see #listPage(int, int)
	 */
	List<CasusOverleg> listPage(final int firstResult, final int maxResults);

	/**
	 * Selects a sorted range (page) of CasusOverlegs from the database.
	 * 
	 * @param firstResult the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults the maximum number of result objects to retrieve (or <=0 for no limit)
	 * @param sortProperty the property of the object to sort on
	 * @param isAscending should the retruned list be sorted ascending? 
	 * 
	 * @return a sorted List containing 0 or more CasusOverleg objects.
	 *
	 * @see #listPage(int, int, String, boolean)
	 */
	List<CasusOverleg> listPage(final int firstResult, final int maxResults,
			final String sortProperty, final boolean isAscending);

	/**
	 * Selects a sorted range (page) of CasusOverlegs from the database.
	 * 
	 * @param example the example object to which the result objects need to conform
	 * @param firstResult the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults the maximum number of result objects to retrieve (or <=0 for no limit)
	 * @param sortProperty the property of the object to sort on
	 * @param isAscending should the retruned list be sorted ascending? 
	 * 
	 * @return a sorted List containing 0 or more CasusOverleg objects.
	 *
	 * @see #listPage(int, int, String, boolean)
	 */
	List<CasusOverleg> listPageByExample(final CasusOverlegExample example,
			final int firstResult, final int maxResults,
			final String sortProperty, final boolean isAscending);

	/**
	 * Counts the number of persisted CasusOverleg objects in the database.
	 * 
	 * @return the number of persisted objects in the database.
	 */
	long count();

	/**
	 * Counts the number of persisted CasusOverleg objects in the database that
	 * matches the given example object.
	 *
	 * @param example
	 *                the example object to be counted
	 * 
	 * @return the number of persisted objects in the database.
	 */
	long count(final CasusOverlegExample example);

	/**
	 * Selects CasusOverlegs from the database that matches an
	 * example object using Query-by-Example(QBE).
	 * 
	 * @param example
	 *                the example object to which the result objects need to conform
	 * @return a List of CasusOverleg objects.
	 */
	List<CasusOverleg> findByExample(CasusOverlegExample example);
}
