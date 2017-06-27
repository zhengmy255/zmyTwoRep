package com.gb.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ItemCat {
    private Integer id;

    private Integer parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Integer isParent;

    private Date created;

    private Date updated;



    private List children;

    private String state="closed";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String showcdate;

    private String showudate;

    public String getShowcdate() {
        if(created!=null){
            SimpleDateFormat sp=new SimpleDateFormat("yyyy-MM-dd");
            return sp.format(created);
        }
        return "";
    }

    public void setShowcdate(String showcdate) {
        this.showcdate = showcdate;
    }

    public String getShowudate() {
        if(updated!=null){
            SimpleDateFormat sp=new SimpleDateFormat("yyyy-MM-dd");
            return sp.format(updated);
        }
        return "";
    }

    public void setShowudate(String showudate) {
        this.showudate = showudate;
    }

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;

        //isParent == 0 表示叶子节点
        if (this.isParent == 0) {
            this.state="open";
        }
    }


    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }



}