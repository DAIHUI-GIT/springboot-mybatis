package com.example.springboot.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 标题
     */
    private String title;
    /**
     * 描述
     */
    private String description;
    /**
     * 操作时间
     */
    private Date operationTime;
    /**
     * 操作人
     */
    private User operator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public User getOperator() {
        return operator;
    }

    public void setOperator(User operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", operationTime=" + operationTime +
                ", operator=" + operator +
                '}';
    }
}
