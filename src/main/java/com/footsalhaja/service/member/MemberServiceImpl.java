package com.footsalhaja.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footsalhaja.domain.member.MemberDto;
import com.footsalhaja.mapper.member.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	//회원가입
	@Override
	public int insertMember(MemberDto member) {
		// name,value 를 -> member Bean 으로 받고, MemberDto 타입으로 리턴 !! 
		// 등록되면 cnt=1, 안되면 cnt=0  
		int cnt = memberMapper.insertMember(member);
		System.out.println(cnt);
		return cnt; 
	}
	
	//회원목록
	@Override
	public List<MemberDto> selectMemberList() {
		return memberMapper.selectMemberList();
		
	}
	
	//userId로 회원정보 가져오기 
	@Override
	public MemberDto selectMemberInfoByUserId(String userId) {
		
		return memberMapper.selectMemberInfoByUserId(userId);
	}
}
