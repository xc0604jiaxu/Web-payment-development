package com.czw.pay.type;

public enum PlatType {

	GUOYR("国艺网"),
	EDU("国艺研习所");

	private final String info;

	private PlatType(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

}
