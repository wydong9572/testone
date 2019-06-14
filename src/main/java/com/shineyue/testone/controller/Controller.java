package com.shineyue.testone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shineyue.testone.result.MarketFrStatV;
import com.shineyue.testone.service.MarketFrStatVService;

/**
 * url映射
 * @author HUAWEI
 */
@RestController
public class Controller {
	@Autowired
	MarketFrStatVService markets;
	
	 @RequestMapping("/getUser")
    public MarketFrStatV getUser(Integer userid) {
        MarketFrStatV user=markets.getOne(userid);
        System.out.println(user);
        return user;
    }
}
