package io.github.rbrauner.learningspringmvc.services;

import java.util.List;

import io.github.rbrauner.learningspringmvc.domain.Customer;

/**
 * CustomerService
 */
public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
