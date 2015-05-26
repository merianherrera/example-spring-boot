package example.controllers;

import example.dao.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.ui.Model;
import example.models.Customer;

//@RestController("Customer")
@Controller
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

    //@RequestMapping(value = "/customer", method = RequestMethod.GET)
    @RequestMapping("/customer")
    public String listar(Model model) {
        List<Customer> allCostumers = customers.getCustomers();
        model.addAttribute("customers", allCostumers);
        return "customer/listar";
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
}