package com.cfhz.service;

import com.cfhz.bean.UserAddress;

import java.util.List;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author Administrator
 * @Date2020/1/20 17:15
 */
public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);

}
