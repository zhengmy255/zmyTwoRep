package com.gb.action;

import com.gb.service.OrdersService;
import com.gb.pojo.OrderInfo;
import com.gb.pojo.OrderItem;
import com.gb.util.DataGridJson;
import com.gb.util.PageUtil;
import com.gb.util.PoiZipUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2017/6/5.
 */
@Controller
@RequestMapping("order")
public class OrdersAction {
    @Autowired
    private OrdersService ordersService;


    /**
     * 跳转到查询订单商品的页面
     * @return
     */
    @RequestMapping("toOrderItem")
    @ResponseBody
    public ModelAndView toOrderItem(String id){
        ModelAndView mv=new ModelAndView("order/showOrderItem");
        List<OrderItem> list=ordersService.selectOrderItemByOrderId(id);
        mv.addObject("list",list);
        return mv;
    }



    @RequestMapping("exportExcelZip")
    public void exportExcelZip(HttpServletRequest request, HttpServletResponse response){
        List<OrderInfo> orderInfos = ordersService.selectOrderList();
       // List<OrderInfo> orderInfos = (List<OrderInfo>) request.getSession().getAttribute("aa");
        String realPath = request.getServletContext().getRealPath("/");
        PoiZipUtil.downZip(orderInfos,request,response,realPath);
        //NewPoiUtil.downExcelZip(itemList,request,response,realPath);
    }



    @RequestMapping("selectOrderList")
    @ResponseBody
    public DataGridJson selectOrderList(HttpServletRequest request, Integer page, Integer rows, String sort, String order, OrderInfo or){
        DataGridJson dj=new DataGridJson();
        or.setStart((page-1)*rows);
        or.setEnd((page*rows)+1);
        or.setSort(sort);
        or.setOrder(order);
        PageUtil rePage=new PageUtil();
        rePage=ordersService.selectOrderList(or);
        request.getSession().setAttribute("aa",rePage.getList());

        dj.setRows(rePage.getList());
        dj.setTotal(rePage.getTotalCount());
        return dj;
    }


    //跳转到订单展示页面
    @RequestMapping("toOrder")
    public String toOrder(){
        return "order/showOrder";
    }
}
