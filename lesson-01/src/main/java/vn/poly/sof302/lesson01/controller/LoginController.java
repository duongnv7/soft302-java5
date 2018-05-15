package vn.poly.sof302.lesson01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Login sample controller
 * 
 * @author duongnguyen
 */
@Controller
@RequestMapping("/")
public class LoginController {

	/**
	 * Show login form
	 * 
	 * @return Login form
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String login() {
		
		return "login";
	}

	/**
	 * Show login result
	 * 
	 * @return Welcome page
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String reuslt() {
		
		return "result";
	}
}
