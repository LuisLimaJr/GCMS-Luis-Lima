package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}
	
	@RequestMapping("/luis")
	public @ResponseBody String greetingLuis() {
	return "Hello, Luis!";
	}
	
	@RequestMapping("/hotfix")
	public @ResponseBody String greetingHotfix() {
	return "Hello, Hotfix!";
	}

}
