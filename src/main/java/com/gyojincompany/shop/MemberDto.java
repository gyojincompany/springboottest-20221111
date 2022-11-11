package com.gyojincompany.shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//lombok 사용
@Getter//getter 자동생성
@Setter//setter 자동생성
@AllArgsConstructor//모든 속성을 사용한 생성자 자동생성
@NoArgsConstructor//속성이 없는 생성자 자동생성
public class MemberDto {
	
	private String name;
	private int age;
	private String email;	
	
}
