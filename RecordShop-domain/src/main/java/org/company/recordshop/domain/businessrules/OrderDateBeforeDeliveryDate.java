/**
 * Extension Point initial generated by Mod4j at: Thu Jul 03 22:37:42 CEST 2008
 */

package org.company.recordshop.domain.businessrules;

import org.company.recordshop.domain.Order;
import org.springframework.validation.Errors;

/**
 * The deliveryDate may not precede orderDate
 * 
 * This ExtensionPoint is intended to be manually changed by developers.
 * 
 */
public class OrderDateBeforeDeliveryDate extends OrderDateBeforeDeliveryDateImplBase {

    /**
     * {@inheritDoc}
     */
    public void validate(Object target, Errors errors) {

        Order order = (Order) target;

        if (order.getOrderDate() != null && order.getDeliveryDateTime() != null) {
            if (order.getOrderDate().isAfter(order.getDeliveryDateTime().getMillis())) {
                errors.rejectValue("deliveryDateTime", "businessrule.OrderDateBeforeDeliveryDate.not.valid", null, "deliveryDate: "
                        + order.getDeliveryDateTime() + " may not preceed orderDate: " + order.getOrderDate());
            }
        }
    }

}
