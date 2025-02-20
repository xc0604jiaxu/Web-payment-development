package com.czw.pay.type;

public enum PaymentType {

	PAYONLINE("在线支付"),
	PAYRECEIVE("货到付款");

	private String info;

	private PaymentType(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}
}
