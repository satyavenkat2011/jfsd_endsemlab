package org.studyeasy.SpringStarter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.SpringStarter.Model.Customer;
import org.studyeasy.SpringStarter.Repository.CustomerRepository;

import java.util.Optional;
@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;
    
    // Update Customer Name and Address
    public Customer updateCustomer(Long id, String name, String address) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            customer.setName(name);
            customer.setAddress(address);
            return customerRepository.save(customer);
        }
        throw new RuntimeException("Customer with ID " + id + " not found!");
    }
    
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
