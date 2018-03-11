package com.smalltao.model;

import lombok.Data;

import java.io.Serializable;

/***
 *Author：Peng Tao Nian
 *Date: 2018/3/1
 *Time:14:54
 *Description：
 */

@Data
public class BaseDirt implements Serializable {


    private String dict_id;
    private String dict_type_code;
    private String dict_type_name;
    private String dict_item_name;
    private String dict_item_code;
    private Integer dict_sort;
    private Boolean dict_enable;
    private String dict_memo;

}
