package com.czw.pay.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.czw.common.dao.BaseDao;
import com.czw.common.service.BaseService;
import com.czw.pay.entity.JpayUser;

@Service
@Transactional
public class JpayUserService extends BaseService<JpayUser> {

	@Resource(name = "jpayUserDao")
	@Override
	public void setBaseDao(BaseDao<JpayUser> baseDao) {
		this.baseDao = baseDao;
	}

}
