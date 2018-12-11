package com.example.Springboot_Web_H2.mapper;

import com.example.Springboot_Web_H2.entity.OrderDetail;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderDetailMapper {
    @Options(useGeneratedKeys = true, keyProperty = "orderId")
    @Insert("insert into order_detail (order_user,order_at,order_status,order_extra,order_date) values(#{orderUser},#{orderAt},#{orderStatus},#{orderExtra},#{orderDate})")
    public Integer addOrderDetail(OrderDetail orderDetail);
    @Select("select * from order_detail")
    public List<OrderDetail> queryOrderDetailList();
}
