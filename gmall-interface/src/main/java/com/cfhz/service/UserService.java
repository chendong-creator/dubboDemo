package com.cfhz.service;

import com.cfhz.bean.UserAddress;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author Administrator
 * @Date2020/1/20 17:11
 */
public interface UserService {

    public List<UserAddress> getUserAddressList(String userId);
}
