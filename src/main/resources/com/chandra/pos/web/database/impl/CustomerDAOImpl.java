package com.chandra.pos.web.database.impl;

import com.chandra.pos.web.database.CustomerDAO;
import com.chandra.pos.web.database.entity.Customer;
import com.chandra.pos.web.database.entity.CustomerSearch;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: T4671
 * Date: 8/12/13
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
@Repository(value="customerDao")
public class CustomerDAOImpl implements CustomerDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Customer> addAll(List<Customer> customerList) {
       for(Customer customer:customerList){
           entityManager.persist(customer);
       }
                return customerList;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Customer> search(CustomerSearch customerList) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Customer getById(Long id)
    {
        return entityManager.find(Customer.class, id);
    }
}
