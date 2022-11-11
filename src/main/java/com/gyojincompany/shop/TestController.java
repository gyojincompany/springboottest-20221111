package com.gyojincompany.shop;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyojincompany.shop.dao.IDao;

@Controller
public class TestController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "test")
	public String test() {
		
		MemberDto dto = new MemberDto("홍길동",10,"abc@abc.com");
		System.out.println(dto.getName());		
		
		return "test";
	}
	
	@RequestMapping(value = "insert")
	public String insert() {
		
		String id="whitecat1";
		String pw="12345";
		String name="홍기동";
		String email="white@abc.com";
		
		IDao dao = sqlSession.getMapper(IDao.class);
		
		dao.joinMemberDao(id, pw, name, email);
		
		return "insert";
	}
}
