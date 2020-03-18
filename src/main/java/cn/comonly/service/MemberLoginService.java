package cn.comonly.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.comonly.utils.ResponseData;

public interface MemberLoginService {

	ResponseData loginin(String jsonString, HttpServletRequest request, HttpServletResponse response);

	ResponseData loginout(String username, HttpServletRequest request, HttpServletResponse response);

	ResponseData getPhoneCode(String phoneCode);

	ResponseData getMailCode(String mailCode);

	ResponseData info(String token, HttpServletRequest request, HttpServletResponse response);

}
