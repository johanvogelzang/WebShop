/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:10 CEST 2011
 *     Application model: Superclass
 *     Generator        : Mod4j BusinessDomainDsl generator: DaoInterfaceBase.xpt
 */

package org.company.webshop.data;

import java.util.List;

import org.company.webshop.domain.Superclass;
import org.company.webshop.domain.SuperclassExample;

/**
 * SuperclassDaoBaseData Access Object (DAO). Responsible for accessing database.
 * 
 * @author Mod4j generated
 * 
 */
public interface SuperclassDaoBase {

	/**
	 * Retrieves a Superclass by its ID from the database.
	 * 
	 * @param id id of the Superclass to retrieve.
	 * @return Superclass retrieved or null when no Superclass was found.
	 */
	Superclass retrieve(Long id);

	/**
	 * Adds a new Superclass to the database
	 * 
	 * @param object
	 *                the Superclass to add to the database.
	 * @return the stored Superclass.
	 */
	Long add(Superclass object);

	/**
	 * Deletes a Superclass from the database.
	 * 
	 * @param object
	 *                the Superclass to delete
	 */
	void delete(Superclass object);

	/**
	 * Selects all Superclasss from the database.
	 * 
	 * @return a List of all Superclass objects.
	 */
	List<Superclass> listAll();

	/**
	 * Selects a range (page) of Superclasss from the database.
	 * 
	 * @param firstResult the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults  the maximum number of result objects to retrieve (or <=0 for no limit) 
	 * 
	 * @return a List containing 0 or more Superclass objects.
	 *
	 * @see #listPage(int, int)
	 */
	List<Superclass> listPage(final int firstResult, final int maxResults);

	/**
	 * Selects a sorted range (page) of Superclasss from the database.
	 * 
	 * @param firstResult the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults the maximum number of result objects to retrieve (or <=0 for no limit)
	 * @param sortProperty the property of the object to sort on
	 * @param isAscending should the retruned list be sorted ascending? 
	 * 
	 * @return a sorted List containing 0 or more Superclass objects.
	 *
	 * @see #listPage(int, int, String, boolean)
	 */
	List<Superclass> listPage(final int firstResult, final int maxResults,
			final String sortProperty, final boolean isAscending);

	/**
	 * Selects a sorted range (page) of Superclasss from the database.
	 * 
	 * @param example the example object to which the result objects need to conform
	 * @param firstResult the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults the maximum number of result objects to retrieve (or <=0 for no limit)
	 * @param sortProperty the property of the object to sort on
	 * @param isAscending should the retruned list be sorted ascending? 
	 * 
	 * @return a sorted List containing 0 or more Superclass objects.
	 *
	 * @see #listPage(int, int, String, boolean)
	 */
	List<Superclass> listPageByExample(final SuperclassExample example,
			final int firstResult, final int maxResults,
			final String sortProperty, final boolean isAscending);

	/**
	 * Counts the number of persisted Superclass objects in the database.
	 * 
	 * @return the number of persisted objects in the database.
	 */
	long count();

	/**
	 * Counts the number of persisted Superclass objects in the database that
	 * matches the given example object.
	 *
	 * @param example
	 *                the example object to be counted
	 * 
	 * @return the number of persisted objects in the database.
	 */
	long count(final SuperclassExample example);

	/**
	 * Selects Superclasss from the database that matches an
	 * example object using Query-by-Example(QBE).
	 * 
	 * @param example
	 *                the example object to which the result objects need to conform
	 * @return a List of Superclass objects.
	 */
	List<Superclass> findByExample(SuperclassExample example);
}
