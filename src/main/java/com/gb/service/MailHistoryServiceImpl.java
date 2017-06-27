package com.gb.service;

import com.gb.dao.MailHistoryMapper;
import com.gb.pojo.MailHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/7.
 */
@Service
public class MailHistoryServiceImpl implements  MailHistoryService {

    @Autowired
    private MailHistoryMapper mailHistoryMapper;

    @Override
    public void addMailHistroy(MailHistory mailHistory) {
        mailHistoryMapper.insertSelective(mailHistory);
    }
}
