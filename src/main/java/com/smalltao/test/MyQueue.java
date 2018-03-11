package com.smalltao.test;

import org.omg.CORBA.Object;

/***
 *Author：Peng Tao Nian
 *Date: 2018/3/7
 *Time:15:39
 *Description：
 */
public class MyQueue {

    //存放数据
    Object[] datas;
    //存放元素的下标
    int fang;
    //取元素的小标
    int qu;
    //队列的元素的个数
    int numbers;


    public MyQueue(int size){
        datas = new Object[size];
    }


    /**
     * 判断是否队列满
     */

    public boolean isFull(){
        return numbers ==datas.length;

    }

    /**
     * 存放元素
     */
    public void push(Object data){
        //判断是否队列已经满了
        if(isFull()){
            throw new RuntimeException("队列已经满了");

        }

        datas[fang % datas.length] = data;
        fang++;
        numbers++;

    }

    public boolean isEmpty(){

        return numbers==0;
    }


    public Object pop(){

        if(isEmpty()){
            throw new  RuntimeException("队列空了");
        }

        Object o = null;
        o=datas[qu % datas.length];
        qu++;
        numbers--;
        return o;

    }







}
