package org.customerapi.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
