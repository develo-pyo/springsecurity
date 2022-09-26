package com.jpp.security.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "member")
public class MemberEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length=20, nullable=false)
    private String email;

    @Builder
    public MemberEntity(Long id, String email, String password){
        this.id = id;
        this.email = email;
        this.password = password;
    }


}
