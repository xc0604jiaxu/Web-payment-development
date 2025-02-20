package com.czw.pay.type;

public enum PaymentChannelType {

	ALIPAY("支付宝支付"),
	WECHATPAY("微信支付"),
	BANKPAY("网银支付"),
	OTHER("其他支付");

	private String info;

	private PaymentChannelType(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}
}
