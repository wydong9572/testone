package com.shineyue.testone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shineyue.testone.mapper.MarketFrStatVDao;
import com.shineyue.testone.result.MarketFrStatV;
import com.shineyue.testone.service.MarketFrStatVService;
/**
 * 业务层实现类
 * @author HUAWEI
 */
@Service
public class MarketFrStatVServiceImpl implements MarketFrStatVService{
	@Autowired
	MarketFrStatVDao mar;
	
	@Override
	public MarketFrStatV getOne(Integer userid ) {
		 MarketFrStatV v = mar.getOne(userid);
	        return v;
	}

}
