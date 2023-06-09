package com.argades.poker.pokerchallenge.infraestructure.config;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.argades.poker.pokerchallenge.adapters.out.persistence.entity.MemberEntity;
import com.argades.poker.pokerchallenge.adapters.out.persistence.entity.PokerSessionEntity;
import com.argades.poker.pokerchallenge.adapters.out.persistence.repo.MemberRepository;
import com.argades.poker.pokerchallenge.adapters.out.persistence.repo.PokerSessionRepository;
import com.argades.poker.pokerchallenge.domain.PokerType;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class MemberRepositoryIT {
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    PokerSessionRepository pokerSessionRepository;

    @Test
    public void whenNewPokerSessionAndMemberProvided_PokerSessionAndMemberIsAdded(){
        PokerSessionEntity pokerSessionEntity = new PokerSessionEntity().name("NEW POKER SESSION")
                                                                        .type(PokerType.TEXAS_HOLDEM);
        pokerSessionEntity = this.pokerSessionRepository.save(pokerSessionEntity);
        
        assertTrue(pokerSessionEntity.getType().equals(PokerType.TEXAS_HOLDEM));

        MemberEntity memberEntity = new MemberEntity().withNickName("JOKER")
                                                      .withPokerSessionEntity(pokerSessionEntity);
        memberRepository.save(memberEntity);

        assertTrue(memberEntity.getPokerSessionEntity().getType().equals(PokerType.TEXAS_HOLDEM));
    }

}
