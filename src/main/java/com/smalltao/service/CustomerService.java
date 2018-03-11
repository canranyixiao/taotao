package com.smalltao.service;

import com.github.pagehelper.PageInfo;
import com.smalltao.model.Customer;
import com.smalltao.utils.Page;

import java.util.Map; /***
 *Author：Peng Tao Nian
 *Date: 2018/3/1
 *Time:15:43
 *Description：
 */
public interface CustomerService {
   /* Page<Customer> list(Map<String, Object> datamap);

    Customer findById(int id);

    int update(Customer customer);

    int delete(int id);*/

    int modify(Customer customer);

    PageInfo<Customer> pageinfo();

}
