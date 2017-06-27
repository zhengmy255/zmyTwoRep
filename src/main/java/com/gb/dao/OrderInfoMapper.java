package com.gb.dao;

import com.gb.pojo.OrderInfo;

import java.util.List;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

    int selectOrderCount(OrderInfo record);

    List<OrderInfo> selectOrderList(OrderInfo record);

    List<OrderInfo> selectOrderListExcel();
}