package com.api.board.service;

import com.api.board.dto.MemberDTO;
import com.api.board.entity.Member;
import com.api.board.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    @Transactional
    public boolean isUserAuthorized(final MemberDTO memberDTO){
        Member member = memberRepository.findByEmail(memberDTO.getEmail());
        return memberDTO.getPassword().equals(member.getPassword());
    }

    @Transactional
    public void save(Member member){
        memberRepository.save(member);
    }
}
