package org.studyeasy.SpringStarter.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.studyeasy.SpringStarter.Model.Customer;
import org.studyeasy.SpringStarter.service.CustomerService;
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id,
                                   @RequestParam String name,
                                   @RequestParam String address) {
        return customerService.updateCustomer(id, name, address);
    }
}




