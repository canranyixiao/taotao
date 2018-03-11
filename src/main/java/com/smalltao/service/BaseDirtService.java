package com.smalltao.service;

import com.smalltao.model.BaseDirt;

import java.util.List;

/***
 *Author：Peng Tao Nian
 *Date: 2018/3/1
 *Time:16:46
 *Description：
 */
public interface BaseDirtService {
    List<BaseDirt> getBaseDictByTypeCode(String s);
}
