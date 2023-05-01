package com.argades.poker.pokerchallenge.adapters.out.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.argades.poker.pokerchallenge.adapters.out.persistence.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Integer>{
    
}
