package com.lavine.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lavine.api.service.CostService;
import com.lavine.consumer.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @Description :   //描述
 * @Author : qhm  //作者
 * @Date: 2021-01-12 20:34  //时间
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Reference
    private CostService costService;
    @Override
    public Integer getCost(int a) {
        return costService.add(a);
    }
}
