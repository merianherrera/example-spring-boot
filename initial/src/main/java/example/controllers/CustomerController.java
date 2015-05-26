package example.controllers;

import example.dao.CustomerRepository;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import example.models.Customer;

@RestController("Customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customers;


    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    public Customer greetings(@PathVariable("id") Long id) {
        /*Customer customer = new Customer();
        customer.setName("Martha");
        customer.setLastname("Fuentes");
        return customer;*/
        return customers.getCustomer(id);
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public List<Customer> list() {
        /*return Collections.emptyList();*/
        return customers.getCustomers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Customer customer) {

    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody Customer customer) {

    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
    public void delete() {

    }

   /* public class Customer implements Serializable {

        private String name;

        private String lastname;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getLastname() {
            return lastname;
        }
    }*/
}