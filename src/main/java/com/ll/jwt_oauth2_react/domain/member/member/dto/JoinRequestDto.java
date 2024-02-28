package com.ll.jwt_oauth2_react.domain.member.member.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoinRequestDto {
	private String name;
	private String email;
	private String password;
}
