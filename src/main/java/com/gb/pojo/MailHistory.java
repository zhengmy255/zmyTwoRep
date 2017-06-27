package com.gb.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MailHistory implements Serializable {
    private static final long serialVersionUID = -3827342779686734843L;
    private BigDecimal id;

    private String sendname;

    private String getname;

    private String copyname; //可选

    private String secretname;//可选

    private String mailsubject;

    private String attachname;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date sendtiem;

    @Override
    public String toString() {
        return "MailHistory{" +
                "id=" + id +
                ", sendname='" + sendname + '\'' +
                ", getname='" + getname + '\'' +
                ", copyname='" + copyname + '\'' +
                ", secretname='" + secretname + '\'' +
                ", mailsubject='" + mailsubject + '\'' +
                ", attachname='" + attachname + '\'' +
                ", sendtiem=" + sendtiem +
                ", issuccess=" + issuccess +
                ", adminname='" + adminname + '\'' +
                ", ipaddress='" + ipaddress + '\'' +
                ", mailContent='" + mailContent + '\'' +
                ", sendPwd='" + sendPwd + '\'' +
                '}';
    }

    //0代表成功 1 代表失败
    private Short issuccess;

    private String adminname;

    private String ipaddress;



    //业务字段
    //邮件正文--文本
    private String mailContent;

    //业务字段
    //发件人密码
    private String sendPwd;

    public String getSendPwd() {
        return sendPwd;
    }

    public void setSendPwd(String sendPwd) {
        this.sendPwd = sendPwd;
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getSendname() {
        return sendname;
    }

    public void setSendname(String sendname) {
        this.sendname = sendname == null ? null : sendname.trim();
    }

    public String getGetname() {
        return getname;
    }

    public void setGetname(String getname) {
        this.getname = getname == null ? null : getname.trim();
    }

    public String getCopyname() {
        return copyname;
    }

    public void setCopyname(String copyname) {
        this.copyname = copyname == null ? null : copyname.trim();
    }

    public String getSecretname() {
        return secretname;
    }

    public void setSecretname(String secretname) {
        this.secretname = secretname == null ? null : secretname.trim();
    }

    public String getMailsubject() {
        return mailsubject;
    }

    public void setMailsubject(String mailsubject) {
        this.mailsubject = mailsubject == null ? null : mailsubject.trim();
    }

    public String getAttachname() {
        return attachname;
    }

    public void setAttachname(String attachname) {
        this.attachname = attachname == null ? null : attachname.trim();
    }

    public Date getSendtiem() {
        return sendtiem;
    }

    public void setSendtiem(Date sendtiem) {
        this.sendtiem = sendtiem;
    }

    public Short getIssuccess() {
        return issuccess;
    }

    public void setIssuccess(Short issuccess) {
        this.issuccess = issuccess;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }
}