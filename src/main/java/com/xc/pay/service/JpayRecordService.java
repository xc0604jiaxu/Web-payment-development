package com.czw.pay.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.czw.common.dao.BaseDao;
import com.czw.common.service.BaseService;
import com.czw.pay.entity.JpayRecord;

@Service
@Transactional
public class JpayRecordService extends BaseService<JpayRecord> {

	@Resource(name = "jpayRecordDao")
	@Override
	public void setBaseDao(BaseDao<JpayRecord> baseDao) {
		this.baseDao = baseDao;
	}

}
