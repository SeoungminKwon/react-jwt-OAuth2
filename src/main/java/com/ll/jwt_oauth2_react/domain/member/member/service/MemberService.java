package com.ll.jwt_oauth2_react.domain.member.member.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ll.jwt_oauth2_react.domain.member.member.entity.Member;
import com.ll.jwt_oauth2_react.domain.member.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;

	public void join(Member member) {
		Member save = memberRepository.save(member);
	}
}
