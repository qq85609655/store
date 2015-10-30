package com.isell.ei.logistics.zhongtong.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.isell.core.util.Coder;
import com.isell.core.util.HttpUtils;
import com.isell.core.util.JsonUtil;
import com.isell.ei.logistics.zhongtong.bean.ZTOrderResponse;
import com.isell.ei.logistics.zhongtong.service.ZhongtongService;

/**
 * 中通物流服务接口实现类
 * 
 * @author lilin
 * @version [版本号, 2015年10月23日]
 */
@Service("zhongtongService")
public class ZhongtongServiceImpl implements ZhongtongService {
    
    @Override
    public ZTOrderResponse getMarkService(Map<String, String> param) {
        String data = JsonUtil.writeValueAsString(param);
        param.clear();
        param.put("data", data);
        param.put("msg_type", "zto.intlmark.get");
        genarateMap(param);
        
        String result = HttpUtils.httpPost(REQUEST_URL, param);
        System.out.println(result);
        return JsonUtil.readValue(result, ZTOrderResponse.class);
    }
    
    private void genarateMap(Map<String, String> param) {
        param.put("company_id", ZhongtongService.COMPANY_ID);
        param.put("data_digest", Coder.encryptBASE64(Coder.encryptMD5(param.get("data") + KEY)));
    }
}
