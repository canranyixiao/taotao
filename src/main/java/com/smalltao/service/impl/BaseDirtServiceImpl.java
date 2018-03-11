package com.smalltao.service.impl;

import com.smalltao.mapper.BaseDirtMapper;
import com.smalltao.model.BaseDirt;
import com.smalltao.service.BaseDirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 *Author：Peng Tao Nian
 *Date: 2018/3/1
 *Time:16:46
 *Description：
 */
@Service
public class BaseDirtServiceImpl implements BaseDirtService {

    @Autowired
    private BaseDirtMapper baseDirtMapper;

    @Override
    public List<BaseDirt> getBaseDictByTypeCode(String s) {
        return baseDirtMapper.getBaseDictByTypeCode(s);
    }
}
