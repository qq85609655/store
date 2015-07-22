package com.sell.bis.sys;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.springframework.util.StreamUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 
 * 权限拦截器，实现权限控制等功能
 * 
 * @author lilin
 * @version [版本号, 2015年6月30日]
 */
public class LogInterceptor extends HandlerInterceptorAdapter {
    
    /** 默认字符集 */
    private static final Charset CHARSET = Charset.forName("UTF-8");
    
    /** log */
    private static final Logger log = Logger.getLogger(LogInterceptor.class);
    
    @SuppressWarnings("unchecked")
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // 记录日志：调用者、ip、接口名、调用时间、响应时间
        if (MapUtils.isNotEmpty(request.getParameterMap())) {
            Map<String, String> paramsMap = new HashMap<String, String>();
            
            Map<String, Object> paramMap = request.getParameterMap();
            for (Entry<String, Object> entry : paramMap.entrySet()) {
                paramsMap.put(entry.getKey(), ArrayUtils.toString(entry.getValue()));
            }
            log.info(paramsMap);
        } else {
            try {
                String body = StreamUtils.copyToString(request.getInputStream(), CHARSET);
                log.info(body);
            } catch (IOException e) {
                log.error(e);
                throw new RuntimeException(e);
            }
        }
        return true;
    }
}
