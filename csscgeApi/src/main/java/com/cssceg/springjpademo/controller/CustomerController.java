package com.cssceg.springjpademo.controller;

import com.cssceg.springjpademo.dao.CustomerDao;
import com.cssceg.springjpademo.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/aa")
    public List<Customer> getCustomer() {
        List<Customer> all = customerDao.findAll();
        for (Customer customer : all) {
            System.out.println(customer);

        }
        return all;
//        List<Customer> customerList = customerDao.findAll();
//        for (Customer customer : customerList) {
//            System.out.println(customer.toString());
//
//        }
//        return customerDao.findAll();
    }
    @RequestMapping("/bb")
    public String getStr(){
        return "锋锋是个大蠢猪";
    }

}
