package com.NepalCode.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LBEFController {
	
	// creaing method
	@ResponseBody
	@RequestMapping("/lbef")
	public String manageClass() {
		return "welcome to lbef-controller";
	}

}
