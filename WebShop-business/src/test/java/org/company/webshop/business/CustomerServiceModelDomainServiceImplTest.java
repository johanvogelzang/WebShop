/**
 * 
 */
package org.company.webshop.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.company.webshop.domain.Customer;
import org.company.webshop.domain.CustomerExample;
import org.hibernate.SessionFactory;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * @author emalotau
 * 
 */
@ContextConfiguration(locations = { "/Mod4jCommonContext.xml",
        "/org/company/webshop/data/applicationContext.xml",
        "/org/company/webshop/data/sessionFactoryContext.xml",
        "/org/company/webshop/business/testDataSourceContext.xml",
        "/org/company/webshop/business/applicationContext.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class CustomerServiceModelDomainServiceImplTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private CustomerServiceModelDomainService service;

    @Autowired
    protected SessionFactory sessionFactory;

	protected DateTime date() {
		return new DateTime(2008, 11, 6, 0, 0, 0, 0);
	}
    /**
     * Test method for
     * {@link org.company.webshop.business.CustomerServiceModelDomainServiceImpl#findCustomersByExample(org.company.webshop.domain.CustomerExample)}
     * .
     */
    @Test
    public void testFindCustomersByExample() {
        service.createCustomer(new Customer("Johan", "Vogelzang", date(), 1));
        service.createCustomer(new Customer("Jos", "Warmer", date(), 2));
        service.createCustomer(new Customer("Eric Jan", "Malotaux", date(), 3));
        sessionFactory.getCurrentSession().flush();
        sessionFactory.getCurrentSession().clear();
        assertEquals(3, countRowsInTable("Customer_TABLE"));

        CustomerExample example = new CustomerExample();
        List<Customer> result = service.findCustomerByExample(example);
        assertEquals(3, result.size());
        
        example.setBlackListed(false);
        result = service.findCustomerByExample(example);
        assertEquals(3, result.size());
        
        example.setBlackListed(true);
        result = service.findCustomerByExample(example);
        assertEquals(0, result.size());
        
        example.setBlackListed(null);
        example.setFirstName("Jo");
        result = service.findCustomerByExample(example);
        assertEquals(2, result.size());
    }

    class MyBeanFactoryLocator extends ContextSingletonBeanFactoryLocator {
        protected MyBeanFactoryLocator(String resourceLocation) {
            super(resourceLocation);
        }
    }
}
