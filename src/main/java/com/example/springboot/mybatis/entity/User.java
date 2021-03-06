package com.example.springboot.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * 用户ID
     */
    private Integer id;
    /**
     * 用户名称
     */
    private String name;
    /**
     * 用户账号
     */
    private String account;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 是否禁用
     */
    private Integer disabled;
    /**
     * 用户对应的所有角色（多对多关系）
     */
    //private Set<Role> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", disabled=" + disabled +
                '}';
    }
}
