package com.pe.luvao.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LuvaoController {

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView view(HttpServletRequest request) {
		return new ModelAndView("index");
	}
}
