package com.chandra.pos.web.database;

import com.chandra.pos.web.database.entity.Customer;
import com.chandra.pos.web.database.entity.CustomerSearch;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: T4671
 * Date: 8/12/13
 * Time: 11:48 AM
 * To change this template use File | Settings | File Templates.
 */
public interface CustomerDAO {

 public List<Customer> addAll(List<Customer> customerList);

 public List<Customer> search(CustomerSearch customerList);
 public Customer getById(Long id);

}
