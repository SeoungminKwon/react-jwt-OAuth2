package com.ll.jwt_oauth2_react.domain.member.member.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class JwtToken {
	private String grantType; //JWT에 대한 인증 타입
	private String accessToken;
	private String refreshToken;
}
