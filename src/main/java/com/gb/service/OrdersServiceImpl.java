package com.gb.service;

import com.gb.dao.OrderInfoMapper;
import com.gb.dao.OrderItemMapper;
import com.gb.pojo.OrderInfo;
import com.gb.pojo.OrderItem;
import com.gb.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/6/5.
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrderInfoMapper ordersMapper;
    @Autowired
    private OrderItemMapper orderItemMapper;


    @Override
    public List<OrderItem> selectOrderItemByOrderId(String id) {
        OrderItem oi=new OrderItem();
        oi.setOrderId(id);
        List<OrderItem> list=orderItemMapper.selectOrderItemByOrderId(oi);
        return list;
    }

    @Override
    public List<OrderInfo> selectOrderList() {
        return ordersMapper.selectOrderListExcel();
    }



    @Override
    public PageUtil selectOrderList(OrderInfo or) {
        PageUtil rePage=new PageUtil();
        int i=ordersMapper.selectOrderCount(or);
        List<OrderInfo> list=ordersMapper.selectOrderList(or);
        rePage.setList(list);
        rePage.setTotalCount(i);
        return rePage;
    }
}
