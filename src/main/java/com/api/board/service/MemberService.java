package com.api.board.service;

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
    public boolean isUserAuthorized(final Member client){
        Member member = memberRepository.findByEmail(client.getEmail());
        return client.getPassword().equals(member.getPassword());
    }

    @Transactional
    public void save(Member member){
        memberRepository.save(member);
    }
}
