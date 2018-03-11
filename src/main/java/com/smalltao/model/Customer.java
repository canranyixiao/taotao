package com.smalltao.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/***
 *Author：Peng Tao Nian
 *Date: 2018/3/1
 *Time:14:53
 *Description：
 */
@Data
public class Customer implements Serializable {

    private Long cid;
    private String cust_name;
    private String cust_address;

/*
    private Long cust_user_id;
    private Long cust_create_id;
    private String cust_source;
    private String cust_industry;
    private String cust_level;
    private String cust_linkman;
    private String cust_phone;
    private String cust_mobile;
    private String cust_zipcode;
    private String cust_address;
    private Date cust_createtime;
*/


}
