package com.smalltao.controller;

import com.smalltao.model.User;
import com.smalltao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.io.StringWriter;

/***
 *author：pengtaonian
 *date:2018/2/28
 *description：
 */
@Controller
@RequestMapping(value = "/admin/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){

        System.out.println("这是add方法");


        return "user_add";
    }


    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(User user){

        System.out.println("这是add方法"+user);


        int j = 1/0;

        int i = userService.addUser(user);

        System.out.println("影响的行数是：i="+i);
        return "OK";
    }


    @ExceptionHandler(Exception.class)
    public String handleException(Exception ex){

        StringWriter sw = new StringWriter();
        ex.printStackTrace(new PrintWriter(sw));

        System.out.println("以下是错误信息=================="+sw.toString()+"=================================");

        return "error";

    }


}
