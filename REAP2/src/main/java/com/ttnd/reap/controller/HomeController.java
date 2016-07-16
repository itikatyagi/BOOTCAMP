package com.ttnd.reap.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ttnd.reap.model.User;
import com.ttnd.reap.service.IService;

@Controller
// @RequestMapping("/")
public class HomeController {
	@RequestMapping("/")
	public ModelAndView homePage(){
		return new ModelAndView("index");
	}


	@Autowired
	private IService service;
	
		


	// @Autowired
	// private HttpSession httpSession;

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String home(HttpSession httpSession) {
		User user = (User) httpSession.getAttribute("user");
		if (user == null) {
			return "login";
		}
		return "reap";
	}

	

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("email_id") String email_id, @RequestParam("password") String password,
			HttpSession httpSession, ModelMap model) {
		User  user;
		
			String id = email_id;
			user = service.checklogin(id, password);
	
		if (user == null) {
			ModelAndView modelAndView = new ModelAndView("reap");
			modelAndView.addObject("msg", "flop");

			return modelAndView;
		}
		httpSession.setAttribute("user", user);
		return new ModelAndView("reap");
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(HttpSession httpSession) {
		User user = (User) httpSession.getAttribute("user");
		if (user == null) {
			return new ModelAndView("register", "user", new User());
		}
		return new ModelAndView("reap");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute User user, Model model, HttpSession httpSession) {
		service.save(user);
		httpSession.setAttribute("user",user);
		return "reap";
	}

	@RequestMapping(value = "/badges")
	public String badges() {

		return "myBadges";
	}
}
