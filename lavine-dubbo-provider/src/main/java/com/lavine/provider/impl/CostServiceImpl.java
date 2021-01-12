package com.lavine.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lavine.api.service.CostService;

/**
 * @Description :   //描述
 * @Author : qhm  //作者
 * @Date: 2021-01-12 20:38  //时间
 */
@Service
public class CostServiceImpl implements CostService {
    /**
     * 假设之前总花费了100
     */
    private final Integer totalCost = 1000;

    /**
     * 之前总和 加上 最近一笔
     * @param cost
     * @return
     */
    @Override
    public Integer add(int cost) {
        return totalCost + cost;
    }
}
