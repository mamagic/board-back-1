package com.api.board.repository;

import com.api.board.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository  extends JpaRepository<Member, Long> {
    public Member findByEmail(final String email);
}
