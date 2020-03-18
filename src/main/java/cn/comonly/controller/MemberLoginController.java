package cn.comonly.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.comonly.service.MemberLoginService;
import cn.comonly.utils.ResponseData;

@Controller
@RequestMapping(value = "/user")
public class MemberLoginController {
	@Autowired
	private MemberLoginService memberLoginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody String loginin(@RequestBody String jsonString, HttpServletRequest request, HttpServletResponse response) {
		//return  memberLoginService.loginin(jsonString, request, response);
		return "{\"code\":20000,\"msg\":\"login success\",\"data\":{\"token\":\"admin-token\"}}";
	}
	
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public @ResponseBody String info(String token, HttpServletRequest request, HttpServletResponse response) {
		//return  memberLoginService.info(token, request, response);
		return "{\"code\":20000,\"data\":{\"roles\":[\"admin\"],\"introduction\":\"I am a super administrator\",\"avatar\":\"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif\",\"name\":\"Super Admin\"}}";
	}
	
	@RequestMapping(value = "/loginout", method = RequestMethod.GET)
	public @ResponseBody String loginout(HttpServletRequest request, HttpServletResponse response) {
		//return  memberLoginService.loginin(jsonString, request, response);
		System.out.println("in  haha");
		return "{\"code\":20000,\"data\":\"success\"}";
	}
	
	@RequestMapping(value = "/getPhoneCode", method = RequestMethod.GET)
	public @ResponseBody ResponseData getPhoneCode(String phoneCode) {
		return  memberLoginService.getPhoneCode(phoneCode);
	}
	
	@RequestMapping(value = "/getMailCode", method = RequestMethod.GET)
	public @ResponseBody ResponseData getMailCode(String mailCode) {
		return  memberLoginService.getMailCode(mailCode);
	}
}
