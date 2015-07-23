package com.sell.ei.pay.weixin.service;

import java.util.TreeMap;

import com.sell.ei.pay.weixin.bean.PayResultInfo;

/**
 * 微信支付接口服务层
 * 
 * @author lilin
 * @version [版本号, 2015年7月23日]
 */
public interface WeixinPayService {
    
    /**
     * 微信公众账号ID
     */
    String APPID = "wx8888888888888888";
    
    /**
     * 商户号
     */
    String MCH_ID = "1900000109";
    
    /**
     * 微信给的密钥
     */
    String KEY = "isellPrivateKey";
    
    /** 微信给的URL */
    String URL = "https://api.mch.weixin.qq.com/pay/unifiedorder";
    
    /**
     * 统一下单服务
     *
     * @param paramMap map参数
     * @return 返回Map
     */
    TreeMap<String, Object> unifiedorder(TreeMap<String, Object> paramMap);
    
    /**
     * 查询订单服务
     *
     * @param paramMap map参数
     * @return 返回Map
     */
    TreeMap<String, Object> orderquery(TreeMap<String, Object> paramMap);
    
    /**
     * 关闭订单服务
     *
     * @param paramMap map参数
     * @return 返回Map
     */
    TreeMap<String, Object> closeorder(TreeMap<String, Object> paramMap);
    
    /**
     * 支付结果通知接口<br>
     * 该接口是通过【统一下单API】中提交的参数notify_url设置，如果链接无法访问，商户将无法接收到微信通知。
     *
     * @param payResultInfo 请求参数
     * @return 返回响应
     */
    PayResultInfo sendPayResult(PayResultInfo payResultInfo);
}