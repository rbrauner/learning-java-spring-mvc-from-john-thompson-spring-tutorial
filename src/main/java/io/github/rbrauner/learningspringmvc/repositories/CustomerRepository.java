package io.github.rbrauner.learningspringmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.rbrauner.learningspringmvc.domain.Customer;

/**
 * CustomerRepository
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
