package org.studyeasy.SpringStarter.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.studyeasy.SpringStarter.Model.Customer;
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}