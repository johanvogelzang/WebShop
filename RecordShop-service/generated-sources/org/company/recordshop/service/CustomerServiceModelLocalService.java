/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:13 CEST 2011
 *     Application model: CustomerServiceModel
 *     Generator        : Mod4j ServiceDsl generator: LocalService.xpt
 */

package org.company.recordshop.service;

import java.util.List;

import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.company.recordshop.service.dto.UniqueCustomerDto;
import org.company.recordshop.service.dto.StringDto;
import org.company.recordshop.service.dto.FullCustomerDto;
import org.company.recordshop.service.dto.OrderDto;
import org.company.recordshop.service.dto.OrderNumberAndDateDto;
import org.company.recordshop.service.dto.OrderWithOrderLinesDto;
import org.company.recordshop.service.dto.OrderLineDto;
import org.company.recordshop.service.dto.CustomerWithOrdersAndOrderLines;
import org.company.recordshop.service.dto.ProductWithCustomersDto;
import org.company.recordshop.service.dto.FullProductDto;
import org.company.recordshop.service.dto.ArtistDto;
import org.company.recordshop.service.dto.PersonDto;
import org.company.recordshop.service.dto.RelationDto;

/**
 * @author Generated by Mod4j
 */
public interface CustomerServiceModelLocalService {

	/** 
	 * Description: test.
	 * @param ord A custom parameter
	 */
	public void voidreturn(OrderDto ord);

	/** 
	 * Description: add order to customer.
	 * @param order A custom parameter
	 * @param customer A custom parameter
	 * @return OrderDto 
	 */
	public OrderDto addToOrdersa(OrderDto order, SimpleCustomerDto customer);

	/** 
	 * Description: Find Customer by unique key attributes..
	 * @param cust A custom parameter
	 * @return SimpleCustomerDto 
	 */
	public SimpleCustomerDto findCustomerByUniqueKey(UniqueCustomerDto cust);

	/** 
	 * Description: Find all Customers matching the given name..
	 * @param name A custom parameter
	 * @return List<SimpleCustomerDto> 
	 */
	public List<SimpleCustomerDto> findCustomerByName(StringDto name);

	/** 
	 * Description: .
	 * @param name A custom parameter
	 * @return List<SimpleCustomerDto> 
	 */
	public List<SimpleCustomerDto> findCustomersByNames(List<StringDto> name);

	/**
	 * Find all objects of type PersonDto that conform to the example object.
	 * 
	 * @param example
	 *            The objects to which the result objects need to conform.
	 * @return the list of all PersonDto objects conforming to the example object.
	 */
	public List<PersonDto> findPersons(PersonDto example);

	/**
	 * Reads an sorted range (page) of objects of type PersonDto.
	 * 
	 * @param exampleDto the dto-object to which the result objects need to conform
	 * @param firstResult - the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults - the maximum number of result objects to retrieve (or <=0 for no limit) 
	 * @param sortProperty - the property of the object to sort on
	 * @param isAscending - should the retruned list be sorted ascending or descending? 
	 *
	 * @return ordered List containing 0 or more PersonDto objects.
	 *
	 * @see {@link #findPersons(int, int, String, boolean)} 
	 */
	public List<PersonDto> findPersons(final PersonDto exampleDto,
			final int firstResult, final int maxResults,
			final String sortProperty, final boolean isAscending);

	/**
	 * Counts the number of existing objects of type Person.
	 *
	 * @param exampleDto
	 *            The dto-object to which the result objects must conform.
	 * 
	 * @return number of existing Person objects that matches the exampleDto.
	 */
	public long countPersons(final PersonDto exampleDto);

	/**
	 * Reads an existing OrderDto.
	 * 
	 * @param id
	 *            The id of the OrderDto to read.
	 * @return The OrderDto with id, or null if no object with id exists.
	 */
	public OrderDto readOrder(Long id);

	/**
	 * Reads an existing OrderLineDto.
	 * 
	 * @param id
	 *            The id of the OrderLineDto to read.
	 * @return The OrderLineDto with id, or null if no object with id exists.
	 */
	public OrderLineDto readOrderLine(Long id);

	/**
	 * Creates a new SimpleCustomerDto.
	 * 
	 * @param object 
	 *            The SimpleCustomerDto to create.
	 * @return the id of the SimpleCustomerDto created.
	 */
	public Long createCustomer(SimpleCustomerDto object);

	/**
	 * Reads an existing SimpleCustomerDto.
	 * 
	 * @param id
	 *            The id of the SimpleCustomerDto to read.
	 * @return The SimpleCustomerDto with id, or null if no object with id exists.
	 */
	public SimpleCustomerDto readCustomer(Long id);

	/**
	 * Updates an existing SimpleCustomerDto.
	 * 
	 * @param object
	 *            The SimpleCustomerDto containing the modifications for the corresponding SimpleCustomerDto
	 */
	public void updateCustomer(SimpleCustomerDto object);

	/**
	 * Deletes an existing SimpleCustomerDto.
	 * 
	 * @param object
	 *            The SimpleCustomerDto object to delete.
	 */
	public void deleteCustomer(SimpleCustomerDto object);

	/**
	 * Returns a list of all objects of type SimpleCustomerDto.
	 * 
	 *
	 * @return the list of all SimpleCustomerDto objects.
	 */
	public List<SimpleCustomerDto> listCustomers();

	/**
	 * Reads a range (page) of objects of type SimpleCustomerDto.
	 * 
	 * @param firstResult - the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults - the maximum number of result objects to retrieve (or <=0 for no limit) 
	 * 
	 * @return List containing 0 or more SimpleCustomerDto objects.
	 *
	 * @see {@link #listCustomers(int, int, String, boolean)}
	 */
	public List<SimpleCustomerDto> listCustomers(final int firstResult,
			final int maxResults);

	/**
	 * Reads an sorted range (page) of objects of type SimpleCustomerDto.
	 * 
	 * @param firstResult - the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults - the maximum number of result objects to retrieve (or <=0 for no limit) 
	 * @param sortProperty - the property of the object to sort on
	 * @param isAscending - should the retruned list be sorted ascending or descending? 
	 *
	 * @return ordered List containing 0 or more SimpleCustomerDto objects.
	 *
	 * @see {@link #listCustomers(int, int)} 
	 */
	public List<SimpleCustomerDto> listCustomers(final int firstResult,
			final int maxResults, final String sortProperty,
			final boolean isAscending);

	/**
	 * Returns a list of all objects of type FullCustomerDto.
	 * 
	 *
	 * @return the list of all FullCustomerDto objects.
	 */
	public List<FullCustomerDto> listFullCustomers();

	/**
	 * Reads a range (page) of objects of type FullCustomerDto.
	 * 
	 * @param firstResult - the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults - the maximum number of result objects to retrieve (or <=0 for no limit) 
	 * 
	 * @return List containing 0 or more FullCustomerDto objects.
	 *
	 * @see {@link #listFullCustomers(int, int, String, boolean)}
	 */
	public List<FullCustomerDto> listFullCustomers(final int firstResult,
			final int maxResults);

	/**
	 * Reads an sorted range (page) of objects of type FullCustomerDto.
	 * 
	 * @param firstResult - the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults - the maximum number of result objects to retrieve (or <=0 for no limit) 
	 * @param sortProperty - the property of the object to sort on
	 * @param isAscending - should the retruned list be sorted ascending or descending? 
	 *
	 * @return ordered List containing 0 or more FullCustomerDto objects.
	 *
	 * @see {@link #listFullCustomers(int, int)} 
	 */
	public List<FullCustomerDto> listFullCustomers(final int firstResult,
			final int maxResults, final String sortProperty,
			final boolean isAscending);

	/**
	 * Returns a list of all objects of type ArtistDto.
	 * 
	 *
	 * @return the list of all ArtistDto objects.
	 */
	public List<ArtistDto> listAllArtists();

	/**
	 * Reads a range (page) of objects of type ArtistDto.
	 * 
	 * @param firstResult - the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults - the maximum number of result objects to retrieve (or <=0 for no limit) 
	 * 
	 * @return List containing 0 or more ArtistDto objects.
	 *
	 * @see {@link #listAllArtists(int, int, String, boolean)}
	 */
	public List<ArtistDto> listAllArtists(final int firstResult,
			final int maxResults);

	/**
	 * Reads an sorted range (page) of objects of type ArtistDto.
	 * 
	 * @param firstResult - the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults - the maximum number of result objects to retrieve (or <=0 for no limit) 
	 * @param sortProperty - the property of the object to sort on
	 * @param isAscending - should the retruned list be sorted ascending or descending? 
	 *
	 * @return ordered List containing 0 or more ArtistDto objects.
	 *
	 * @see {@link #listAllArtists(int, int)} 
	 */
	public List<ArtistDto> listAllArtists(final int firstResult,
			final int maxResults, final String sortProperty,
			final boolean isAscending);

	/**
	 * Find all objects of type SimpleCustomerDto that conform to the example object.
	 * 
	 * @param example
	 *            The objects to which the result objects need to conform.
	 * @return the list of all SimpleCustomerDto objects conforming to the example object.
	 */
	public List<SimpleCustomerDto> findCustomers(SimpleCustomerDto example);

	/**
	 * Reads an sorted range (page) of objects of type SimpleCustomerDto.
	 * 
	 * @param exampleDto the dto-object to which the result objects need to conform
	 * @param firstResult - the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults - the maximum number of result objects to retrieve (or <=0 for no limit) 
	 * @param sortProperty - the property of the object to sort on
	 * @param isAscending - should the retruned list be sorted ascending or descending? 
	 *
	 * @return ordered List containing 0 or more SimpleCustomerDto objects.
	 *
	 * @see {@link #findCustomers(int, int, String, boolean)} 
	 */
	public List<SimpleCustomerDto> findCustomers(
			final SimpleCustomerDto exampleDto, final int firstResult,
			final int maxResults, final String sortProperty,
			final boolean isAscending);

	/**
	 * Counts the number of existing objects of type Customer.
	 *
	 * @param exampleDto
	 *            The dto-object to which the result objects must conform.
	 * 
	 * @return number of existing Customer objects that matches the exampleDto.
	 */
	public long countCustomers(final SimpleCustomerDto exampleDto);

	/**
	 * Find all objects of type FullCustomerDto that conform to the example object.
	 * 
	 * @param example
	 *            The objects to which the result objects need to conform.
	 * @return the list of all FullCustomerDto objects conforming to the example object.
	 */
	public List<FullCustomerDto> findCustomersFull(FullCustomerDto example);

	/**
	 * Reads an sorted range (page) of objects of type FullCustomerDto.
	 * 
	 * @param exampleDto the dto-object to which the result objects need to conform
	 * @param firstResult - the index of the first result object to be retrieved (numbered from 0)
	 * @param maxResults - the maximum number of result objects to retrieve (or <=0 for no limit) 
	 * @param sortProperty - the property of the object to sort on
	 * @param isAscending - should the retruned list be sorted ascending or descending? 
	 *
	 * @return ordered List containing 0 or more FullCustomerDto objects.
	 *
	 * @see {@link #findCustomersFull(int, int, String, boolean)} 
	 */
	public List<FullCustomerDto> findCustomersFull(
			final FullCustomerDto exampleDto, final int firstResult,
			final int maxResults, final String sortProperty,
			final boolean isAscending);

	/**
	 * Counts the number of existing objects of type Customer.
	 *
	 * @param exampleDto
	 *            The dto-object to which the result objects must conform.
	 * 
	 * @return number of existing Customer objects that matches the exampleDto.
	 */
	public long countCustomers(final FullCustomerDto exampleDto);

	/**
	 * Creates a new RelationDto.
	 * 
	 * @param object 
	 *            The RelationDto to create.
	 * @return the id of the RelationDto created.
	 */
	public Long createRelation(RelationDto object);

	/**
	 * Creates a new PersonDto.
	 * 
	 * @param object 
	 *            The PersonDto to create.
	 * @return the id of the PersonDto created.
	 */
	public Long createPerson(PersonDto object);

	/**
	 * Creates a new FullCustomerDto.
	 * All crud servuices needed for FullCustomer [From crud service]
	 * @param object 
	 *            The FullCustomerDto to create.
	 * @return the id of the FullCustomerDto created.
	 */
	public Long createCustomer(FullCustomerDto object);

	/**
	 * Creates a new ProductWithCustomersDto.
	 * 
	 * @param object 
	 *            The ProductWithCustomersDto to create.
	 * @return the id of the ProductWithCustomersDto created.
	 */
	public Long createProduct(ProductWithCustomersDto object);

	/**
	 * Creates a new FullProductDto.
	 * 
	 * @param object 
	 *            The FullProductDto to create.
	 * @return the id of the FullProductDto created.
	 */
	public Long createProduct(FullProductDto object);

	/**
	 * Creates a new CustomerWithOrdersAndOrderLines.
	 * 
	 * @param object 
	 *            The CustomerWithOrdersAndOrderLines to create.
	 * @return the id of the CustomerWithOrdersAndOrderLines created.
	 */
	public Long createCustomer(CustomerWithOrdersAndOrderLines object);

	/**
	 * Creates a new ArtistDto.
	 * 
	 * @param object 
	 *            The ArtistDto to create.
	 * @return the id of the ArtistDto created.
	 */
	public Long createArtist(ArtistDto object);

	/**
	 * Reads an existing RelationDto.
	 * 
	 * @param id
	 *            The id of the RelationDto to read.
	 * @return The RelationDto with id, or null if no object with id exists.
	 */
	public RelationDto readRelationAsRelationDto(Long id);

	/**
	 * Reads an existing PersonDto.
	 * 
	 * @param id
	 *            The id of the PersonDto to read.
	 * @return The PersonDto with id, or null if no object with id exists.
	 */
	public PersonDto readPersonAsPersonDto(Long id);

	/**
	 * Reads an existing FullCustomerDto.
	 * All crud servuices needed for FullCustomer [From crud service]
	 * @param id
	 *            The id of the FullCustomerDto to read.
	 * @return The FullCustomerDto with id, or null if no object with id exists.
	 */
	public FullCustomerDto readCustomerAsFullCustomerDto(Long id);

	/**
	 * Reads an existing ProductWithCustomersDto.
	 * 
	 * @param id
	 *            The id of the ProductWithCustomersDto to read.
	 * @return The ProductWithCustomersDto with id, or null if no object with id exists.
	 */
	public ProductWithCustomersDto readProductAsProductWithCustomersDto(Long id);

	/**
	 * Reads an existing FullProductDto.
	 * 
	 * @param id
	 *            The id of the FullProductDto to read.
	 * @return The FullProductDto with id, or null if no object with id exists.
	 */
	public FullProductDto readProductAsFullProductDto(Long id);

	/**
	 * Reads an existing CustomerWithOrdersAndOrderLines.
	 * 
	 * @param id
	 *            The id of the CustomerWithOrdersAndOrderLines to read.
	 * @return The CustomerWithOrdersAndOrderLines with id, or null if no object with id exists.
	 */
	public CustomerWithOrdersAndOrderLines readCustomerAsCustomerWithOrdersAndOrderLines(
			Long id);

	/**
	 * Reads an existing ArtistDto.
	 * 
	 * @param id
	 *            The id of the ArtistDto to read.
	 * @return The ArtistDto with id, or null if no object with id exists.
	 */
	public ArtistDto readArtistAsArtistDto(Long id);

	/**
	 * Updates an existing RelationDto.
	 * 
	 * @param object
	 *            The RelationDto containing the modifications for the corresponding RelationDto
	 */
	public void updateRelation(RelationDto object);

	/**
	 * Updates an existing PersonDto.
	 * 
	 * @param object
	 *            The PersonDto containing the modifications for the corresponding PersonDto
	 */
	public void updatePerson(PersonDto object);

	/**
	 * Updates an existing FullCustomerDto.
	 * All crud servuices needed for FullCustomer [From crud service]
	 * @param object
	 *            The FullCustomerDto containing the modifications for the corresponding FullCustomerDto
	 */
	public void updateCustomer(FullCustomerDto object);

	/**
	 * Updates an existing ProductWithCustomersDto.
	 * 
	 * @param object
	 *            The ProductWithCustomersDto containing the modifications for the corresponding ProductWithCustomersDto
	 */
	public void updateProduct(ProductWithCustomersDto object);

	/**
	 * Updates an existing FullProductDto.
	 * 
	 * @param object
	 *            The FullProductDto containing the modifications for the corresponding FullProductDto
	 */
	public void updateProduct(FullProductDto object);

	/**
	 * Updates an existing CustomerWithOrdersAndOrderLines.
	 * 
	 * @param object
	 *            The CustomerWithOrdersAndOrderLines containing the modifications for the corresponding CustomerWithOrdersAndOrderLines
	 */
	public void updateCustomer(CustomerWithOrdersAndOrderLines object);

	/**
	 * Updates an existing ArtistDto.
	 * 
	 * @param object
	 *            The ArtistDto containing the modifications for the corresponding ArtistDto
	 */
	public void updateArtist(ArtistDto object);

	/**
	 * Deletes an existing RelationDto.
	 * 
	 * @param object
	 *            The RelationDto object to delete.
	 */
	public void deleteRelation(RelationDto object);

	/**
	 * Deletes an existing PersonDto.
	 * 
	 * @param object
	 *            The PersonDto object to delete.
	 */
	public void deletePerson(PersonDto object);

	/**
	 * Deletes an existing FullCustomerDto.
	 * All crud servuices needed for FullCustomer [From crud service]
	 * @param object
	 *            The FullCustomerDto object to delete.
	 */
	public void deleteCustomer(FullCustomerDto object);

	/**
	 * Deletes an existing ProductWithCustomersDto.
	 * 
	 * @param object
	 *            The ProductWithCustomersDto object to delete.
	 */
	public void deleteProduct(ProductWithCustomersDto object);

	/**
	 * Deletes an existing FullProductDto.
	 * 
	 * @param object
	 *            The FullProductDto object to delete.
	 */
	public void deleteProduct(FullProductDto object);

	/**
	 * Deletes an existing CustomerWithOrdersAndOrderLines.
	 * 
	 * @param object
	 *            The CustomerWithOrdersAndOrderLines object to delete.
	 */
	public void deleteCustomer(CustomerWithOrdersAndOrderLines object);

	/**
	 * Deletes an existing ArtistDto.
	 * 
	 * @param object
	 *            The ArtistDto object to delete.
	 */
	public void deleteArtist(ArtistDto object);

	/**
	 * Counts the number of existing objects of type Customer.
	 * 
	 * @return number of existing Customer objects. 
	 */
	public long countCustomers();
	/**
	 * Counts the number of existing objects of type Artist.
	 * 
	 * @return number of existing Artist objects. 
	 */
	public long countArtists();

	/**
	 * Adds an OrderLineDto to an OrderDto.
	 * 
	 * @param whole
	 *            The object to which to add.
	 * @param part
	 *            The object that is added to the whole.
	 */
	public void addToOrderLines(OrderDto whole, OrderLineDto part);

	/**
	 * Removes an OrderLineDto from an OrderDto.
	 * 
	 * @param whole
	 *            The object from which to remove.
	 * @param part
	 *            The object that is removed from the whole.
	 */
	public void removeFromOrderLines(OrderDto whole, OrderLineDto part);

	/**
	 * Adds an OrderDto to an SimpleCustomerDto.
	 * 
	 * @param whole
	 *            The object to which to add.
	 * @param part
	 *            The object that is added to the whole.
	 */
	public void addToOrders(SimpleCustomerDto whole, OrderDto part);

	/**
	 * Removes an OrderDto from an SimpleCustomerDto.
	 * 
	 * @param whole
	 *            The object from which to remove.
	 * @param part
	 *            The object that is removed from the whole.
	 */
	public void removeFromOrders(SimpleCustomerDto whole, OrderDto part);

	/**
	 * Gets the OrderNumberAndDateDto from SimpleCustomerDto.
	 * 
	 * @param source
	 *            The object from which to get the OrderNumberAndDateDto
	 * @return OrderNumberAndDateDto 
	 */
	public List<OrderNumberAndDateDto> getOrders(SimpleCustomerDto source);

	/**
	 * Gets the SimpleCustomerDto from an OrderDto.
	 * 
	 * @param source
	 *            The object from which to get the SimpleCustomerDto
	 * @return SimpleCustomerDto 
	 */
	public SimpleCustomerDto getCustomer(OrderDto source);

	/**
	 * Adds an SimpleCustomerDto to an OrderDto.
	 * 
	 * @param whole
	 *            The object to which to add.
	 * @param part
	 *            The object that is added to the whole.
	 */
	public void setCustomer(OrderDto whole, SimpleCustomerDto part);

}
