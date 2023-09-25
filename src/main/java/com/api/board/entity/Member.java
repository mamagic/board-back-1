package com.api.board.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Entity
@Table(name = "member")
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@RequiredArgsConstructor
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    @Column
    private final String displayPath;

    @Column
    private final String email;

    @Column
    private final String password;

    @Column
    private final String socialProvider;
}
