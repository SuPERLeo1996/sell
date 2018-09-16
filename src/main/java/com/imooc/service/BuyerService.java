package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @Auther: Leo
 * @Date: 2018/9/16
 * @Description:买家
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);

}
