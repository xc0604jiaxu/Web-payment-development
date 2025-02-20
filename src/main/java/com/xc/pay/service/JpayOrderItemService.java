package com.czw.pay.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.czw.common.dao.BaseDao;
import com.czw.common.service.BaseService;
import com.czw.pay.entity.JpayOrderItem;

@Service
@Transactional
public class JpayOrderItemService extends BaseService<JpayOrderItem> {

	@Resource(name = "jpayOrderItemDao")
	@Override
	public void setBaseDao(BaseDao<JpayOrderItem> baseDao) {
		this.baseDao = baseDao;
	}

}
