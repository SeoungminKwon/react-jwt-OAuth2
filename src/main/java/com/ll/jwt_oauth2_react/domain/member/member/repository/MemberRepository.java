package com.ll.jwt_oauth2_react.domain.member.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ll.jwt_oauth2_react.domain.member.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
