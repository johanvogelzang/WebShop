/**
 * Initially generated by Mod4j Service DSL: LocalServiceImpl::LocalServiceImpl at: Tue Dec 09 15:31:58 CET 2008
 * from model OrderServiceModel
 * Extension point: intended to be changed by hand.
 */
package org.company.webshop.service;

import java.util.List;

import org.company.webshop.service.OrderServiceModelLocalServiceImplBase;
import org.company.webshop.service.dto.DateDto;
import org.company.webshop.service.dto.OrderNumberAndDateDto;
import org.company.webshop.service.dto.SimpleCustomerDto;

/**
 * @author Initially generated by Mod4j
 */
public class OrderServiceModelLocalServiceImpl
		extends
			OrderServiceModelLocalServiceImplBase {

	/**
	 * @params [customer]
	 * @return OrderNumberAndDateList
	 */
	public List<OrderNumberAndDateDto> findOrdersByCustomer(
			SimpleCustomerDto customer) {

		// TODO Mod4j: implement this service method manually
		return null;

	}

	/**
	 * @params [date]
	 * @return OrderNumberAndDateList
	 */
	public List<OrderNumberAndDateDto> findOrdersByDate(DateDto date) {

		// TODO Mod4j: implement this service method manually
		return null;

	}

}
