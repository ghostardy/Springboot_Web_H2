package com.example.Springboot_Web_H2.Controllers;

import com.example.Springboot_Web_H2.entity.OrderDetail;
import com.example.Springboot_Web_H2.mapper.OrderDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@RestController
public class Hello1 {
    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @RequestMapping("/Hello1")
    public String Hello1() {
        return "{msg:Hello1}";
    }
    @RequestMapping("/db")
    public String testQueryUserList(){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        OrderDetail od = new OrderDetail("user1",
                100L,
                1,
                "",
                ts);
        orderDetailMapper.addOrderDetail(od);

        List<OrderDetail> orders = orderDetailMapper.queryOrderDetailList();

        String output = "";
        for(int i=0;i<orders.size();i++) {
            output += orders.get(i).toString();
            output += "<br />";
        }
        return output;
    }

}
