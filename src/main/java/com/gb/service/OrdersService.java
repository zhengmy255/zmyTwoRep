package com.gb.service;

import com.gb.pojo.OrderInfo;
import com.gb.pojo.OrderItem;
import com.gb.util.PageUtil;

import java.util.List;

/**
 * Created by Administrator on 2017/6/5.
 */
public interface OrdersService {
    PageUtil selectOrderList(OrderInfo or);
    List<OrderInfo> selectOrderList();


    List<OrderItem> selectOrderItemByOrderId(String id);
}
