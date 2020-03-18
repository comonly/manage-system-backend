package cn.comonly.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.comonly.dao.StockIndustryMapper;
import cn.comonly.pojo.StockIndustry;
import cn.comonly.service.StockIndustryService;
import cn.comonly.utils.JsonUtils;
import cn.comonly.utils.ResponseData;
import cn.comonly.utils.ResponseDataList;
@Service
public class StockIndustryServiceImpl implements StockIndustryService {

	@Autowired
	private StockIndustryMapper dao;
	
	@Override
	public ResponseData list(int page, int limit, HttpServletRequest request, HttpServletResponse response) {
		Map<String,Integer> map = new HashMap<>();
		//map.put("status", status);
		map.put("pageindex", page);
		map.put("pagesize", limit);

		List<StockIndustry> list = dao.getList();;
		if(list == null) {
			return new ResponseData(40000,"no data satify request",null);
		}else {
			return new ResponseData(20000,"success",new ResponseDataList(list.size(), list));
		}
	}

	@Override
	public ResponseData add(String jsonString, HttpServletRequest request, HttpServletResponse response) {
		JsonUtils jsonUtils = new JsonUtils(jsonString);
		
		StockIndustry stockIndustry = new StockIndustry();
		
		stockIndustry.setIdescribe(jsonUtils.getStringValue("idescribe"));
		stockIndustry.setIfollow(jsonUtils.getIntValue("ifollow"));
		//stockIndustry.setIid(jsonUtils.getIntValue("iid"));
		stockIndustry.setIname(jsonUtils.getStringValue("iname"));
		stockIndustry.setItime(new java.util.Date());
		

		dao.insertSelective(stockIndustry);

		return new ResponseData(20000,"success",null);
	}

	@Override
	public ResponseData update(String jsonString, HttpServletRequest request, HttpServletResponse response) {
		JsonUtils jsonUtils = new JsonUtils(jsonString);
		
		StockIndustry stockIndustry = new StockIndustry();
		
		stockIndustry.setIdescribe(jsonUtils.getStringValue("idescribe"));
		stockIndustry.setIfollow(jsonUtils.getIntValue("ifollow"));
		stockIndustry.setIid(jsonUtils.getIntValue("iid"));
		stockIndustry.setIname(jsonUtils.getStringValue("iname"));

		dao.updateByPrimaryKeySelective(stockIndustry);

		return new ResponseData(20000,"success",null);
	}

}
