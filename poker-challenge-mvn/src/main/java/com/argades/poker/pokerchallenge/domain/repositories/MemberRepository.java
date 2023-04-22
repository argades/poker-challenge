package com.argades.poker.pokerchallenge.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.argades.poker.pokerchallenge.domain.entities.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Integer>{
    
}
