package app.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/")
    public String index(Map<String,Object> map) {
		map.put("title", "测试标题");
		map.put("content", "测试内容");
		map.put("etraInfo", "额外信息，只对管理员显示");
        return "home";
    }
	/**
	 * 判断是否已经登录
	 * @param request
	 */
	@RequestMapping("/test")
	@ResponseBody
	public void test(HttpServletRequest request){
		SecurityContextImpl securityContextImpl = (SecurityContextImpl) request  
				 .getSession().getAttribute("SPRING_SECURITY_CONTEXT");  
		// 登录名  
		System.out.println("Username:"  
		 + securityContextImpl.getAuthentication().getName());  
		// 登录密码，未加密的  
		System.out.println("Credentials:"  
		 + securityContextImpl.getAuthentication().getCredentials());
	}
}	
