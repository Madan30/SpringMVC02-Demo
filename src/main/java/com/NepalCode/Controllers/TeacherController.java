package com.NepalCode.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TeacherController {
	
	@ResponseBody
	@RequestMapping("/teacher")
	public String manageStudnet() {
		return "welcome to teacher controller";
	}

}
