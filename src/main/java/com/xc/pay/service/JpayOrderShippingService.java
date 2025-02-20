package com.czw.pay.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.czw.common.dao.BaseDao;
import com.czw.common.service.BaseService;
import com.czw.pay.entity.JpayOrderShipping;

@Service
@Transactional
public class JpayOrderShippingService extends BaseService<JpayOrderShipping> {

	@Resource(name = "jpayOrderShippingDao")
	@Override
	public void setBaseDao(BaseDao<JpayOrderShipping> baseDao) {
		this.baseDao = baseDao;
	}

}
