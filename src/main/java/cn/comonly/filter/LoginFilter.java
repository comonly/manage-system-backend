package cn.comonly.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.comonly.utils.EncryptUtil;

public class LoginFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String url = ((HttpServletRequest)request).getRequestURI();
		//用户登录不过滤
		if( url.indexOf("/user/login")>-1 ) {
			//继续执行
			chain.doFilter(request,response);
			return;
		}else
		{
			//判断登录状态
			response.setContentType("application/json;charset=UTF-8");
        	response.getWriter().print( "{\"code\":403,\"msg\":\"用户未登录\",\"data\": null}");
        	return;
        }

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}
}
