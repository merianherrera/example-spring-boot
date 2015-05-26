package example.controllers;

import example.dao.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.ui.Model;
import example.models.Customer;

//@RestController("Customer")
@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customers;


    @RequestMapping("/customer/{id}")
    //public String ver(@PathVariable("id") Long id) {
    public String ver(@PathVariable("id") Long id, Model model) {
        Customer customerData = customers.getCustomer(id);
        model.addAttribute("customer", customerData);
        return "customer/ver";
    }

    //@RequestMapping(value = "/customer", method = RequestMethod.GET)
    @RequestMapping("/customer")
    public String listar(Model model) {
        List<Customer> allCustumers = customers.getCustomers();
        model.addAttribute("customers", allCustumers);
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