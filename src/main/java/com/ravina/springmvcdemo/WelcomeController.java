package com.ravina.springmvcdemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class WelcomeController {

	@RequestMapping(value = "/welcome",method = RequestMethod.POST)
	public ModelAndView welcome(@RequestParam("firstname") int i,@RequestParam("secondname") int j,HttpServletRequest req,HttpServletResponse res) {
//		int a = Integer.parseInt(req.getParameter("firstname"));
//		int b = Integer.parseInt(req.getParameter("secondname"));
		int c = i + j;
		System.out.println(c);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("result", c);
		System.out.println(mv);
		return mv;
	}

}
