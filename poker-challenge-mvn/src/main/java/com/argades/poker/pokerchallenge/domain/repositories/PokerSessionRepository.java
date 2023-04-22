package com.argades.poker.pokerchallenge.domain.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.argades.poker.pokerchallenge.domain.entities.PokerSessionEntity;

public interface PokerSessionRepository extends JpaRepository<PokerSessionEntity, UUID>{
    
}
