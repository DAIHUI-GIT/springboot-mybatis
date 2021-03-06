package com.example.springboot.mybatis.entity;

import java.io.Serializable;

public class Role implements Serializable {
    /**
     * 角色ID
     */
    private Integer id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色说明
     */
    private String description;
    /**
     * 是否禁用
     */
    private Integer disabled;
    /**
     * 角色对应所有用户
     */
    //private Set<User> users;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", disabled=" + disabled +
                '}';
    }
}
