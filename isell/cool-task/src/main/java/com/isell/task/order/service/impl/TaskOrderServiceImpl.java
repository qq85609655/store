package com.isell.task.order.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.isell.task.order.dao.OrderDao;
import com.isell.task.order.service.TaskOrderService;

/**
 * 订单服务接口实现类
 * 
 * @author lilin
 * @version [版本号, 2015年8月31日]
 */
@Service("taskOrderService")
public class TaskOrderServiceImpl implements TaskOrderService {
    /**
     * 订单数据接口
     */
    @Resource
    private OrderDao orderDao;
    
    @Override
    public void cancelOrder() {
        orderDao.cancelOrder();
    }
}