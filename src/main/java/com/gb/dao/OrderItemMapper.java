package com.gb.dao;

import com.gb.pojo.OrderItem;

import java.util.List;

public interface OrderItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);

    List<OrderItem> selectOrderItemByOrderId(OrderItem oi);
}