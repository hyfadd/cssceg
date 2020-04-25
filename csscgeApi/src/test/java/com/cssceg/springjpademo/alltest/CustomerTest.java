package com.cssceg.springjpademo.alltest;

import com.cssceg.springjpademo.SpringjpademoApplication;
import com.cssceg.springjpademo.dao.CustomerDao;
import com.cssceg.springjpademo.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringjpademoApplication.class)
public class CustomerTest {
    @Autowired
    private CustomerDao customerDao;
    @Test
    public void findAll(){
        List<Customer> all = customerDao.findAll();
        for (Customer customer : all) {
            System.out.println(all.toString());
        }
    }
    @Test
    public void ok(){
        Customer customer=new Customer();
        customer.setCustAddress("aaa");
        customer.setCustIndustry("bbb");
        customer.setCustName("ccc");
        Customer save = customerDao.save(customer);
        System.out.println(save.toString());
    }
    /**
     * testExtent
     * testGetOne:要想在单元测试中使用需要添加@Tractionnsat（事物支持），延迟加载，返回的是动态加载对象，到了调用的时候才会加载
     * testFindOne：立即加载
     *
     *
     */
}
