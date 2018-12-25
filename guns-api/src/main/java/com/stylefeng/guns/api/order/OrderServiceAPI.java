package com.stylefeng.guns.api.order;

import com.baomidou.mybatisplus.plugins.Page;
import com.stylefeng.guns.api.order.vo.OrderVo;

public interface OrderServiceAPI {


    // 验证售出的票是否为真
    boolean isTrueSeats(String fieldId,String seats);

    // 已经销售的座位里，有没有这些座位。true未售，false已售
    boolean isNotSoldSeats(String fieldId,String seats);

    // 创建订单信息
    OrderVo saveOrder(Integer fieldId, String soldSeats, String seatsName, Integer userId);

    // 使用当前登陆人获取已经购买的订单
    Page<OrderVo> getOrderByUserId(Integer userId, Page<OrderVo> page);

    // 根据FieldId 获取所有已经销售的座位编号
    String getSoldSeatsByFieldId(Integer fieldId);



}
