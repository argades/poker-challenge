package com.argades.poker.pokerchallenge.adapters.out.persistence.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.argades.poker.pokerchallenge.adapters.out.persistence.entity.PokerSessionEntity;

public interface PokerSessionRepository extends JpaRepository<PokerSessionEntity, UUID>{
    
}
