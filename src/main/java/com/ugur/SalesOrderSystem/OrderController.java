package com.ugur.SalesOrderSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OrderController {
    public static List<Order> orderlist = new ArrayList<>();

    @GetMapping("order")
    public String getOrderInputForm(Model model) {
        model.addAttribute("orderToSave", new OrderForm());
        model.addAttribute("customerList", CustomerController.customerList);
        return "OrderInputForm";
    }

    @PostMapping("saveOrder")
    public String saveNewOrdner(Model model, OrderForm orderform) {

        model.addAttribute("orderToSave", new OrderForm());
        model.addAttribute("customerList", CustomerController.customerList);

        return "OrderInputForm";
    }

    @GetMapping("saveOrder")
    public String getAllOrders(Model model) {
        model.addAttribute("orderList", orderlist);
        return "OrderInputForm";
    }
    //orderform da sadece index tutuyoruz ama order da customer da var
    private Order convertOrderFormToOrder(OrderForm orderForm) {

        Customer customer = CustomerController.customerList.get(orderForm.getListIndexCustomer());

        Order newOrder = new Order();
        newOrder.setCustomer(customer);
        return newOrder;
    }
}
