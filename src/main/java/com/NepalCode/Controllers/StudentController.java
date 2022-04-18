package com.NepalCode.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	
	@ResponseBody
	@RequestMapping("/student")
	public String studnentInfo() {
		
		return " Welcome student controller";
		
	}

}
