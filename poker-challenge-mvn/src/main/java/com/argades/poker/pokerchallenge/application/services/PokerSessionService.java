package com.argades.poker.pokerchallenge.application.services;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import com.argades.poker.pokerchallenge.domain.entities.PokerSessionEntity;

public interface PokerSessionService {
    /**
     * Get all poker sessions available
     * @return
     */
    Stream<PokerSessionEntity> getPokerSessions();
    /**
     * Get PokerSession by ID
     * @param id
     * @return
     */
    Optional<PokerSessionEntity> getPokerSessionById(UUID id);
    /**
     * Save Poker session
     * @param pokerSessionEntity
     * @return
     */
    PokerSessionEntity savePokerSession(PokerSessionEntity pokerSessionEntity);
}
