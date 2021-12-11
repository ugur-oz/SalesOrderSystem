package com.ugur.SalesOrderSystem;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OrderDetailController {
public static List<OrderDetail> orderDetailList = new ArrayList<>();
    @GetMapping("orderDetail")
    public String getorderDetail (Model model){
        model.addAttribute("orderDetailToSave",new OrderDetailForm());
        model.addAttribute("orderList", OrderController.orderlist);

        return "OrderDetailForm";
    }
    @PostMapping("orderDetail")
    public String saveorderDetail (Model model, OrderDetailForm orderDetailForm){
        model.addAttribute("orderDetailToSave",new OrderDetailForm());
        orderDetailList.add(convert(orderDetailForm));
        return "OrderDetailForm";
    }
    private OrderDetail convert(OrderDetailForm ahmet){
        OrderDetail hasan = new OrderDetail();
        hasan.setQty(ahmet.getQty());
        hasan.setTaxStatus(ahmet.getTaxStatus());
        hasan.setOrder(OrderController.orderlist.get(ahmet.getIndexOfOrder()));
        return hasan;
    }
}
