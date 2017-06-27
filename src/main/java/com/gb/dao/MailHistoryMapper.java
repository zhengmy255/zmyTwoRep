package com.gb.dao;

import com.gb.pojo.MailHistory;
import java.math.BigDecimal;

public interface MailHistoryMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(MailHistory record);

    int insertSelective(MailHistory record);

    MailHistory selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(MailHistory record);

    int updateByPrimaryKey(MailHistory record);
}