package com.yyy.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class Blog {
    private String id;
    private String author;
    private String title;
    private Date createTime;
    private int views;
}
