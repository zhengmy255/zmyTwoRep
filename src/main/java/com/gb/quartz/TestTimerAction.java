package com.gb.quartz;

import com.gb.service.MailHistoryService;
import com.gb.pojo.MailHistory;
import com.gb.util.JavaMailUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/8.
 */
public class TestTimerAction {

    /*利用RequestContextListener监听器获取request对象的方式一 */
    @Autowired
    private HttpServletRequest request;

   // @Autowired
   // private ItemService itemService;

    @Autowired
    private MailHistoryService mailHistoryService;


    private static int counter = 0; //统计触发几次


    public void execute()  {

        System.err.println("*****************");


        //Request
        /*利用RequestContextListener监听器获取request对象的方式二 */
        //    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        //List<Item> itemList = itemService.selectItemWhere(null);

//        String path = request.getServletContext().getRealPath("/");

        String pp = "E:\\ideaProjects\\hzx-parent\\hzx-modules\\md-backstage\\target\\md-backstage";
     //   String excelPath =   NewPoiUtil.downExcel(itemList,pp);

        MailHistory mailHistory = new MailHistory();

        mailHistory.setSendname("zhaoxiang0578@163.com");
        mailHistory.setSendPwd("zhaoxiang057");

        mailHistory.setGetname("2274488711@qq.com,nan86247631@qq.com,2391515491@qq.com");

        mailHistory.setSecretname("634997327@qq.com,1521170425@qq.com");

        mailHistory.setCopyname("634997327@qq.com,1521170425@qq.com");

        mailHistory.setMailsubject("商品信息表");

        mailHistory.setMailContent("商品信息excel<a href='http://weibo.com/login.php'>微博</a>");

        mailHistory.setAdminname("张三");
       // mailHistory.setAttachname(excelPath);

        mailHistory.setIpaddress("127.0.0.1");

        int isSuccess = JavaMailUtil.sendJavaMail(request,mailHistory);

        mailHistory.setIssuccess((short) isSuccess);



        mailHistory.setSendtiem(new Date());


        //mailHistory存储到 邮件历史记录表
        mailHistoryService.addMailHistroy(mailHistory);

        System.err.println("(" + counter++ + ")");
    }
}
