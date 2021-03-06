package com.isell.ei.logistics.ecm.vo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.isell.core.base.BaseInfo;

/**
 * 响应消息体
 * 
 * @author lilin
 * @version [版本号, 2015年7月20日]
 */
public class EcmResponseBody extends BaseInfo {
    /**
     * 注释内容
     */
    private static final long serialVersionUID = -1947290316170822923L;
    
    /** 处理结果(1000：成功 1005：全部失败 1015：部分失败 1025：其他异常) */
    private String resultCode;
    
    /** 处理消息 */
    private String resultMsg;
    
    /** 异常信息 */
    @JsonProperty("ERROR")
    private List<EcmError> errorList;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public List<EcmError> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<EcmError> errorList) {
        this.errorList = errorList;
    }
}
