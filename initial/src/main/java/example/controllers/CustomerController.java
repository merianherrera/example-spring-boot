package example.controllers;

import example.dao.CustomerDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.ui.Model;
import example.models.Customer;
import org.springframework.validation.BindingResult;

//@RestController("Customer")
@Controller
public class CustomerController {

    @Autowired
    private CustomerDao customers;

    @RequestMapping("/customer/guardar")
    public String guardar(Model model) {
        return "customer/guardar";
    }

    @RequestMapping("/customer/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model) {
        Customer customerData = customers.getCustomer(id);
        model.addAttribute("customer", customerData);
        return "customer/editar";
    }

    @RequestMapping("/customer/{id}")
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

    @RequestMapping("/customer/add")
    public String add(@RequestParam(value="id", required=true) long id,
            @RequestParam(value="name", required=true) String name,
                      @RequestParam(value="lastname", required=true) String lastname, Model model) {

        customers.addCustomers(id, name, lastname);
        List<Customer> allCustumers = customers.getCustomers();
        model.addAttribute("customers", allCustumers);
        return "customer/listar";
    }


    @RequestMapping("/customer/update")
    public String update(@RequestParam(value="id", required=true) long id,
                      @RequestParam(value="name", required=true) String name,
                      @RequestParam(value="lastname", required=true) String lastname, Model model) {

        customers.updateCustomer(id, name, lastname);
        List<Customer> allCustumers = customers.getCustomers();
        model.addAttribute("customers", allCustumers);
        return "customer/listar";
    }

    @RequestMapping("/customer/delete/{id}")
    public String delete(@PathVariable("id") Long id, Model model) {
        customers.deleteCustomer(id);
        List<Customer> allCustumers = customers.getCustomers();
        model.addAttribute("customers", allCustumers);
        return "customer/listar";
    }
}