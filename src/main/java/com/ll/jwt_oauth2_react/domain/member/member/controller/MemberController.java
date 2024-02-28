package com.ll.jwt_oauth2_react.domain.member.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ll.jwt_oauth2_react.domain.member.member.dto.JoinRequestDto;
import com.ll.jwt_oauth2_react.domain.member.member.entity.Member;
import com.ll.jwt_oauth2_react.domain.member.member.service.MemberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class MemberController {
	private final MemberService memberService;

	@PostMapping("/join")
	public String join(@RequestBody JoinRequestDto dto) {
		Member member = new Member();
		member.setUsername(dto.getName());
		member.setPassword(dto.getPassword());
		member.setEmail(dto.getEmail());
		memberService.join(member);

		return "ok";
	}
}
