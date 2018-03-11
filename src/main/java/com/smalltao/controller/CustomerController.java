package com.smalltao.controller;

import com.github.pagehelper.PageInfo;
import com.smalltao.model.BaseDirt;
import com.smalltao.model.Customer;
import com.smalltao.service.BaseDirtService;
import com.smalltao.service.CustomerService;
import com.smalltao.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 *Author：Peng Tao Nian
 *Date: 2018/3/1
 *Time:14:57
 *Description：
 */

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    /*
     * /customer/list.shtml?currenpage=${page.upper}
     * &custName=${dataMap.custName}
     * &custSource=${dataMap.custSource}
     * &custIndustry=${dataMap.custIndustry}
     * &custLevel=${dataMap.custLevel}
     *
     * */

    @Autowired
    private CustomerService customerService;


    @Autowired
    private BaseDirtService baseDirtService;



    @ResponseBody
    @RequestMapping(value = "/mapper")
    public PageInfo testMapper(){

        Customer customer = new Customer();
        customer.setCust_name("佳哥");
        customer.setCust_address("深圳");

       // int count = customerService.modify(customer);

       // System.out.println(count+"===================华丽的分割线=====================");

        PageInfo<Customer> pageInfo = customerService.pageinfo();

        return pageInfo;
    }












/*

    @RequestMapping(value = "/list")
    public String list(@RequestParam(value = "currenpage", required = false, defaultValue = "1") int currenpage,
                       @RequestParam(value = "size", required = false, defaultValue = "20") int size,
                       @RequestParam(value = "custName", required = false) String custName,
                       @RequestParam(value = "custSource", required = false) String custSource,
                       @RequestParam(value = "custIndustry", required = false) String custIndustry,
                       @RequestParam(value = "custLevel", required = false) String custLevel, Model model
    ) {

        Map<String, Object> datamap = new HashMap<String, Object>();
        datamap.put("currenpage", currenpage);
        datamap.put("size", size);
        datamap.put("custName", custName);
        datamap.put("custSource", custSource);
        datamap.put("custIndustry", custIndustry);
        datamap.put("custLevel", custLevel);

        Page<Customer> page = customerService.list(datamap);

        model.addAttribute("datamap", datamap);
        model.addAttribute("page", page);

        baseDirtInfo(model);
        return "list";
    }


    public void baseDirtInfo(Model model) {

        //来源
        List<BaseDirt> fromType = baseDirtService.getBaseDictByTypeCode("002");
        //行业
        List<BaseDirt> industryType = baseDirtService.getBaseDictByTypeCode("001");
        //级别
        List<BaseDirt> levelType = baseDirtService.getBaseDictByTypeCode("006");


        model.addAttribute("fromType", fromType);
        model.addAttribute("industryType", industryType);
        model.addAttribute("levelType", levelType);

    }


    */
/*
    * type:"get",
				url:"/customer/edit.shtml",
				dataType:'json',
				data:{"id":id},
    * *//*



    @ResponseBody
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public Customer findById(int id) {

        Customer customer = customerService.findById(id);

        return customer;
    }

    */
/*
     * $.post("/customer/update.shtml",
     * *//*


    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST,produces="text/html;charset=UTF-8")
    public String update2(Customer customer){

        int count = customerService.update(customer);

        if(count>0){

            return "修改成功";
        }
        return "修改失败";
    }


    @RequestMapping(value = "/delete" ,produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delete2(int id){

       int count =  customerService.delete(id);

       if(count>0){
           return "删除成功";
       }
        return "删除失败";
    }

*/



}
