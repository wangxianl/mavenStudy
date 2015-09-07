package com.esi.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esi.user.entity.User;
import com.esi.user.service.UserService;

@RequestMapping("user")
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String login(User user,HttpServletRequest request){
		User ruser=userService.login(user);
		if(ruser!=null){//登陆成功
			HttpSession session=request.getSession();
			session.setAttribute("currentUser", user);
			return "redirect:/success.jsp";
		}else{
			request.setAttribute("errorMsg", "登录失败");
			request.setAttribute("user", user);
			return "index";
		}
	}
}
