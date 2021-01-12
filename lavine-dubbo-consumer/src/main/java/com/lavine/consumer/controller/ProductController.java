package com.lavine.consumer.controller;

import com.lavine.consumer.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description :   //描述
 * @Author : qhm  //作者
 * @Date: 2021-01-12 20:35  //时间
 */
@RestController
public class ProductController {

    @Resource
    private ProductService productService;

    /**
     * 添加完 返回总共消费
     *
     * @param a
     * @return
     */
    @RequestMapping("/add")
    public String getCost(int a) {
        return "该产品总共消费 ：" + productService.getCost(a);
    }

}
