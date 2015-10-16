package com.isell.task.order.service;

/**
 * 订单服务接口
 * 
 * @author lilin
 * @version [版本号, 2015年8月31日]
 */
public interface TaskOrderService {
    /**
     * 批量取消订单
     */
    void cancelOrder();
    
    /**
     * 批量确认收货
     */
    void signOrder();
}
