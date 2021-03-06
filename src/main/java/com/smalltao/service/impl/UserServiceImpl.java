package com.smalltao.service.impl;

import com.smalltao.mapper.UserMapper;
import com.smalltao.model.User;
import com.smalltao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 *author：pengtaonian
 *date:2018/2/28
 *description：
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {

        return userMapper.addUser(user);
    }
}
