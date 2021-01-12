package com.lavine.consumer.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Description :   //描述
 * @Author : qhm  //作者
 * @Date: 2021-01-12 20:34  //时间
 */
public interface ProductService {

    /**
     * 获得总消费
     *
     * @param a
     * @return
     */
    Integer getCost(int a);
}
