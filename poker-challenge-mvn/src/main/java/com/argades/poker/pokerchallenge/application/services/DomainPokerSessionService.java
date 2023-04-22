package com.argades.poker.pokerchallenge.application.services;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import com.argades.poker.pokerchallenge.domain.entities.PokerSessionEntity;
import com.argades.poker.pokerchallenge.domain.repositories.PokerSessionRepository;

public class DomainPokerSessionService implements PokerSessionService {
    final PokerSessionRepository pokerSessionRepository;
  //  final MemberRepository memberRepository;

    public DomainPokerSessionService(PokerSessionRepository pokerSessionRepository) {
        this.pokerSessionRepository = pokerSessionRepository;
    }
/*    public DomainPokerSessionService(PokerSessionRepository pokerSessionRepository,
        MemberRepository memberRepository) {
        this.pokerSessionRepository = pokerSessionRepository;
        this.memberRepository = memberRepository;
    }
*/
    @Override
    public Stream<PokerSessionEntity> getPokerSessions() {
        return (Stream<PokerSessionEntity>) this.pokerSessionRepository.findAll().stream();
    }

    @Override
    public Optional<PokerSessionEntity> getPokerSessionById(UUID id) {
        return this.pokerSessionRepository.findById(id);
    }

    @Override
    public PokerSessionEntity savePokerSession(PokerSessionEntity pokerSessionEntity) {
        return this.pokerSessionRepository.save(pokerSessionEntity);
    }

}
