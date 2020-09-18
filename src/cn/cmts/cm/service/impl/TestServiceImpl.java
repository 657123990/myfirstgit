package cn.cmts.cm.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cmts.cm.dao.ITestDao;
import cn.cmts.cm.service.ITestService;
@Service
public class TestServiceImpl implements ITestService {

	@Autowired
	ITestDao dao;

	@Override
	public int queryCount() {
		return dao.queryCount();
	}

}
