package com.zebone.register.validation.component;

import com.zebone.register.validation.vo.DataFormatValidationPara;
import com.zebone.register.validation.vo.ValidationResult;


/**
 * 数据格式校验接口
 * @author 陈阵 
 * @date 2013-8-9 下午1:46:54
 */
public interface DataFormatValidation {
	
	/**
	 * 数据格式校验方法
	 * @param dataFormatValidationPara  校验参数
	 * @return
	 * @author 陈阵 
	 * @date 2013-9-14 上午9:10:32
	 */
	ValidationResult validation(DataFormatValidationPara dataFormatValidationPara);

}
