package com.czw.pay.tools;

import java.util.Date;

import com.czw.common.tools.Tools;
import com.czw.pay.type.PlatType;

public class OrderTools {

	public static String createOrderNo(PlatType plat, Long uid) {

		if (plat == null)
			plat = PlatType.GUOYR;
		StringBuffer no = new StringBuffer();
		no.append(Tools.toString(plat.ordinal() + 1));
		long nt = new Date().getTime();
		no.append(Tools.toString(nt / 1000));
		no.append(Tools.toString(10 + (int) (Math.random() * 90)));
		if (uid != null) {
			String uidStr = Tools.toString(uid);
			if (uidStr.length() >= 4) {
				String t = uidStr.substring(uidStr.length() - 4, uidStr.length());
				no.append(t);
			} else {
				int n = 4 - uidStr.length();
				for (int i = 0; i < n; i++) {
					uidStr = 0 + uidStr;
				}
				no.append(uidStr);
			}
		} else {
			no.append("0000");
		}
		return no.toString();
	}

}
