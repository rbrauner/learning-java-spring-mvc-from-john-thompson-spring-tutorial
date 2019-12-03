package io.github.rbrauner.learningspringmvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import io.github.rbrauner.learningspringmvc.domain.Customer;
import io.github.rbrauner.learningspringmvc.repositories.CustomerRepository;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

}
