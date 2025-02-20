package com.xc.common.type;

public enum StatusType {
	DEMAND("申请"),
	VALID("正常"),
	INVALID("无效"),
	LOCK("锁定"),
	DELETE("被删除");

	private final String info;

	private StatusType(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

}
