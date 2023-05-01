package com.argades.poker.pokerchallenge.application.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import com.argades.poker.pokerchallenge.adapters.out.persistence.entity.MemberEntity;

public interface MemberService {
    /**
     * Get member by ID
     * @param id
     * @return
     */
    Optional<MemberEntity> getMemberById(Integer id);
    /**
     * Get Members by session Id
     * @param id
     * @return
     */
    Stream<MemberEntity> getMembersBySessionId(UUID id);
    /**
     * Save Member
     * @param memberEntity
     * @return
     */
    MemberEntity saveMemberEntity(MemberEntity memberEntity);
}
