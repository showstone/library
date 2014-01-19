package com.xsd2;

/**
 * @author wpan Xml验证结果
 */
public class XmlValidateResult {
	// 是否通过验证
	private boolean validated;

	// 错误信息
	private String errorMsg;

	// 构造函数，默认为不通过，错误原因为空字符串
	XmlValidateResult() {
		validated = false;
		errorMsg = "";
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public boolean isValidated() {
		return validated;
	}

	public void setValidated(boolean validated) {
		this.validated = validated;
	}

}

