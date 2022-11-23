package demo.sbjpa.service;

import java.util.List;
import demo.sbjpa.model.*;

public interface CustomerService {
    
    Customer saveCustomer(Customer customer);
    
    void delCustomerById(Long id);
    
    void delAll();
    
    Customer findOneById(Long id);
    
    Customer findByName(String name);

    List<Customer> findByNameAndAge(String name, Integer age);

    Customer queryByName(String name);
    
    List<Customer> findAll();
}
