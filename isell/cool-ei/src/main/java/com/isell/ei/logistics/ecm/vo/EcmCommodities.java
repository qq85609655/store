package com.isell.ei.logistics.ecm.vo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.isell.core.base.BaseInfo;

/**
 * 商品信息接口外层参数<br/>
 * SCM接口:获取商品信息接口（sendCommodity）
 * 
 * @author lilin
 * @version [版本号, 2015年7月20日]
 */
public class EcmCommodities extends BaseInfo {
    /**
     * 注释内容
     */
    private static final long serialVersionUID = -5371093334685699999L;
    
    /** 商品集合 */
    @JsonProperty("Commoditys")
    private List<EcmCommodity> commoditys;

    public List<EcmCommodity> getCommoditys() {
        return commoditys;
    }

    public void setCommoditys(List<EcmCommodity> commoditys) {
        this.commoditys = commoditys;
    }
}
