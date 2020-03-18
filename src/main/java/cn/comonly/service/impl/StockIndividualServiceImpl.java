package cn.comonly.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.comonly.dao.StockIndividualMapper;
import cn.comonly.pojo.StockIndividual;
import cn.comonly.service.StockIndividualService;
import cn.comonly.utils.JsonUtils;
import cn.comonly.utils.ResponseData;
import cn.comonly.utils.ResponseDataList;
@Service
public class StockIndividualServiceImpl implements StockIndividualService {

	@Autowired
	private StockIndividualMapper dao;
	
	@Override
	public ResponseData list(int page, int limit, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<>();
		//map.put("status", status);
		map.put("pageindex", page);
		map.put("pagesize", limit);

		List<StockIndividual> list = dao.getList();;
		if(list == null) {
			return new ResponseData(40000,"no data satify request",null);
		}else {
			return new ResponseData(20000,"success",new ResponseDataList(list.size(), list));
		}
	}

	@Override
	public ResponseData add(String jsonString, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		JsonUtils jsonUtils = new JsonUtils(jsonString);
		
		StockIndividual stockIndividual = new StockIndividual();
		
		stockIndividual.setIcode(jsonUtils.getStringValue("icode"));
		stockIndividual.setIindustry(jsonUtils.getIntValue("iindustry"));
		stockIndividual.setIconcept(jsonUtils.getStringValue("iconcept"));
		stockIndividual.setIdescribe(jsonUtils.getStringValue("idescribe"));
		stockIndividual.setIfollow(jsonUtils.getIntValue("ifollow"));
		//stockIndustry.setIid(jsonUtils.getIntValue("iid"));
		stockIndividual.setIname(jsonUtils.getStringValue("iname"));
		stockIndividual.setItime(new java.util.Date());
		
		dao.insertSelective(stockIndividual);

		return new ResponseData(20000,"success",null);
	}

	@Override
	public ResponseData update(String jsonString, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		JsonUtils jsonUtils = new JsonUtils(jsonString);
		
		StockIndividual stockIndividual = new StockIndividual();
		
		stockIndividual.setIcode(jsonUtils.getStringValue("icode"));
		stockIndividual.setIindustry(jsonUtils.getIntValue("iindustry"));
		stockIndividual.setIconcept(jsonUtils.getStringValue("iconcept"));
		stockIndividual.setIdescribe(jsonUtils.getStringValue("idescribe"));
		stockIndividual.setIfollow(jsonUtils.getIntValue("ifollow"));
		stockIndividual.setIid(jsonUtils.getIntValue("iid"));
		stockIndividual.setIname(jsonUtils.getStringValue("iname"));
		//stockIndividual.setItime(new java.util.Date());

		dao.updateByPrimaryKeySelective(stockIndividual);

		return new ResponseData(20000,"success",null);
	}

}
