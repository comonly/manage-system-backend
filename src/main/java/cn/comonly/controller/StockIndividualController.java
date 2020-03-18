package cn.comonly.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.comonly.service.StockIndividualService;
import cn.comonly.utils.ResponseData;

@Controller
@RequestMapping(value = "/stock/individual")
public class StockIndividualController {
	
	@Autowired
	private StockIndividualService stockIndividualService;
	

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody ResponseData info(int page, int limit, HttpServletRequest request, HttpServletResponse response) {
		return  stockIndividualService.list(page, limit, request, response);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody ResponseData add(@RequestBody String jsonString, HttpServletRequest request, HttpServletResponse response) {
		return  stockIndividualService.add(jsonString, request, response);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public @ResponseBody ResponseData update(@RequestBody String jsonString, HttpServletRequest request, HttpServletResponse response) {
		return  stockIndividualService.update(jsonString, request, response);
	}
}
