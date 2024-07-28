package springmvcproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/")
	public ModelAndView hello () {
		ModelAndView m=new ModelAndView();
		m.setViewName("welcome");
		return m;
	}
}
