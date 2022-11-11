package com.gyojincompany.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping(value = "test")
	public String test() {
		
		MemberDto dto = new MemberDto("홍길동",10,"abc@abc.com");
		System.out.println(dto.getName());		
		
		return "test";
	}
}
