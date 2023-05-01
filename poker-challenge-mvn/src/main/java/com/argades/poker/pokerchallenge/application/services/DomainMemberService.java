package com.argades.poker.pokerchallenge.application.services;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import com.argades.poker.pokerchallenge.adapters.out.persistence.entity.MemberEntity;
import com.argades.poker.pokerchallenge.adapters.out.persistence.repo.MemberRepository;

public class DomainMemberService implements MemberService {

    final MemberRepository memberRepository;
    
    public DomainMemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Optional<MemberEntity> getMemberById(Integer id) {
        return this.memberRepository.findById(id);
    }

    @Override
    public Stream<MemberEntity> getMembersBySessionId(UUID id) {
        return this.memberRepository.findAll().stream();
    }

    @Override
    public MemberEntity saveMemberEntity(MemberEntity memberEntity) {
        return this.memberRepository.save(memberEntity);
    }
    
}
