package com.isell.task.tasks;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.isell.task.order.service.OrderService;

/**
 * 订单任务Task
 * 
 * @author lilin
 * @version [版本号, 2015年8月31日]
 */
@Component("orderTask")
public class OrderTask {
    /**
     * log
     */
    private static final Logger log = Logger.getLogger(OrderTask.class);
    
    /**
     * 订单服务接口
     */
    @Resource
    private OrderService orderService;
    
    /**
     * 定时任务到达执行的方法
     */
    public void execute() {
        log.debug("in OrderTask");
        orderService.cancelOrder();
        log.debug("out OrderTask");
    }
}