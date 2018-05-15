/**
 * 
 */
package vn.poly.duongnv21.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author duongnguyen
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {

	@RequestMapping("")
	public String index() {
		
		return "index";
	}
}
