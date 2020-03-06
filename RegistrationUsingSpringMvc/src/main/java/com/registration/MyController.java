package com.registration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController 
{
	@RequestMapping("/Register")
	public ModelAndView myRegistration(HttpServletRequest request,HttpServletResponse response)
	{
		String user = request.getParameter("username");
		String password = request.getParameter("password");
		
		Validation validation = new Validation();
		boolean valid  = validation.checkValidation(user, password);
		
		if(!valid)
		{
			ModelAndView view  = new ModelAndView();
			view.setViewName("index");
			return view;
		}
		else
		{
			ModelAndView view  = new ModelAndView();
			view.setViewName("Registration");
			return view;
		}
	}
}
