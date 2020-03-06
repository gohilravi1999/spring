package com.spring;
import javax.servlet.http.*;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController 
{

	@RequestMapping("/addition")
	public ModelAndView addition(HttpServletRequest request,HttpServletResponse response)
	{
		double number1 = Double.parseDouble(request.getParameter("number1"));
		double number2 = Double.parseDouble(request.getParameter("number2"));
		
		MathLibrary maths = new MathLibrary();
		double addition = maths.addition(number1, number2);
		
		ModelAndView viewObject=new ModelAndView();
		viewObject.setViewName("ResultForm");
		viewObject.addObject("result",addition);
		return viewObject;
	}
}
