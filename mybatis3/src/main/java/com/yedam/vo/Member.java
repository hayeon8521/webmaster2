package com.yedam.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//lombok 활용. (2가지 타입)
//1. 이클립스에 설치
//2. 라이브러리
//어노테이션 방식으로 이제 추가 가능해짐 [@Getter] <- 이거
@Getter // 이렇게만 선언하고 임포트 하면 다 추가됨
@Setter
@ToString
public class Member {
	
	private String memberid;
	private String password;
	private String memberName;
	private String phone;
	private String responsibility;
	private Date creationDate;
}
