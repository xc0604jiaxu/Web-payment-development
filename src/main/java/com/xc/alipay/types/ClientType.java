package com.xc.alipay.types;

public enum ClientType {
	WAP("移动端"),
	PC("PC"),
	APP("APP");

	private String info;

	private ClientType(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

}
