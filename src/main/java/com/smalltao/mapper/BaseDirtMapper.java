package com.smalltao.mapper;

import com.smalltao.model.BaseDirt;

import java.util.List;

/***
 *Author：Peng Tao Nian
 *Date: 2018/3/1
 *Time:16:49
 *Description：
 */
public interface BaseDirtMapper {
    List<BaseDirt> getBaseDictByTypeCode(String s);
}
