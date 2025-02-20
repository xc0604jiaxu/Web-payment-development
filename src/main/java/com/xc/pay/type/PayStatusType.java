package com.czw.pay.type;

public enum PayStatusType {

	UNPAY("未付款"),
	HASPAY("已付款"),
	UNPOST("未发货"),
	HASPOST("已发货"),
	FINISH("交易成功"),
	CLOSE("交易关闭");

	private String info;

	private PayStatusType(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}
}
