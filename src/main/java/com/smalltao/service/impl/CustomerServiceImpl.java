package com.smalltao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.smalltao.mapper.CustomerMapper;
import com.smalltao.model.Customer;
import com.smalltao.service.CustomerService;
import com.smalltao.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/***
 *Author：Peng Tao Nian
 *Date: 2018/3/1
 *Time:15:43
 *Description：
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

/*
    @Override
    public Page<Customer> list(Map<String, Object> datamap) {

        //获取当前页数
        long currenpage = Integer.parseInt(datamap.get("currenpage").toString());
        long size = Integer.parseInt(datamap.get("size").toString());

        int start = (int) ((currenpage-1)*size);
        datamap.put("start",start);

        //获取总条数
        int total = customerMapper.getTotal(datamap);

        //获取集合数据
        List<Customer> customers = customerMapper.getlist(datamap);

        Page<Customer> page = new Page<>(total,currenpage,size);
        page.setList(customers);

        return page;
    }

    @Override
    public Customer findById(int id) {
        return customerMapper.findById(id);
    }

    @Override
    public int update(Customer customer) {
        return customerMapper.update(customer);
    }

    @Override
    public int delete(int id) {
        return customerMapper.delete(id);
    }
*/

    @Override
    public int modify(Customer customer) {


        return customerMapper.insertSelective(customer);
    }

    @Override
    public PageInfo<Customer> pageinfo() {

        PageHelper.startPage(1,3);

        List<Customer> customers = customerMapper.select(null);

        return new PageInfo<>(customers);
    }
}
