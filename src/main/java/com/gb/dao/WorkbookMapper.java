package com.gb.dao;

import com.gb.pojo.Workbook;

public interface WorkbookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Workbook record);

    int insertSelective(Workbook record);

    Workbook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Workbook record);

    int updateByPrimaryKey(Workbook record);
}