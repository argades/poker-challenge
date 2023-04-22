package com.argades.poker.pokerchallenge.infraestructure.config;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.argades.poker.pokerchallenge.domain.entities.MemberEntity;
import com.argades.poker.pokerchallenge.domain.entities.PokerSessionEntity;
import com.argades.poker.pokerchallenge.domain.repositories.PokerSessionRepository;
import com.argades.poker.pokerchallenge.shared.dtos.PokerType;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class PokerSessionRepositoryIT {
    @Autowired
    PokerSessionRepository pokerSessionRepository;

    @Before
    public void setup(){
        PokerSessionEntity pokerSessionEntity = new PokerSessionEntity().name("DEFAULT-TEST")
                                                                        .type(PokerType.CARIBENYO);
        
        this.pokerSessionRepository.save(pokerSessionEntity);
    }

    @After
    public void cleanup(){
        this.pokerSessionRepository.deleteAll();
    }

    @Test
    public void whenNewPokerSessionProvided_PokerSessionIsAdded(){
        PokerSessionEntity pokerSessionEntity = new PokerSessionEntity().name("NEW SESSION")
                                                                        .type(PokerType.OMAHA);
        
        pokerSessionEntity = this.pokerSessionRepository.save(pokerSessionEntity);
        assertTrue(pokerSessionEntity.getType().equals(PokerType.OMAHA));
    }

}
