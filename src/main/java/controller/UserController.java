package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.UserService;
import entity.User;


@Controller

@RequestMapping("us")
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value = "query{id}")
	public String queryfind(String uname,String pwd,HttpSession session){
		User user = service.queryfind(uname, pwd);
		session.setAttribute("user", user);
		session.setAttribute("uname", uname);
		return "redirect:/list.jsp";
	}
}
