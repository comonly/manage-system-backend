package cn.comonly.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.comonly.utils.ResponseData;

public interface StockIndustryService {

	ResponseData list(int page, int limit, HttpServletRequest request, HttpServletResponse response);

	ResponseData add(String jsonString, HttpServletRequest request, HttpServletResponse response);

	ResponseData update(String jsonString, HttpServletRequest request, HttpServletResponse response);

}
