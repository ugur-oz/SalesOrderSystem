package com.ugur.SalesOrderSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {
    public static List<Customer> customerList = new ArrayList<>();

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public static void setCustomerList(List<Customer> customerList) {
        CustomerController.customerList = customerList;
    }

    @GetMapping("customer")
    public String getCustomerInputForm(Model model) {
        model.addAttribute("customerToSave", new Customer());
        return "CustomerInputForm";
    }

    @PostMapping("customerToSave")
    public String saveNewCustomer(Model model, Customer customer) {
        model.addAttribute("customerToSave", new Customer());
        model.addAttribute("customerList",customerList);
        customerList.add(customer);
        return "AllCustomers";
    }

    @GetMapping("allcustomers")
    private String getAllCustomers(Model model) {
        model.addAttribute("customerList",customerList);
        return "AllCustomers";
    }
}