package com.argades.poker.pokerchallenge.adapters.out.persistence.entity;

import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import com.argades.poker.pokerchallenge.domain.PokerType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Session of poker game planned
 */
@Entity
@Table(name = "POKER_SESSION")
public class PokerSessionEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name="NAME", nullable=true, length=50)
    private String name;
    @Column(name="TYPE", nullable=true, length=20)
    private PokerType type;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pokerSessionEntity")
    private List<MemberEntity> members;
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public PokerSessionEntity id(UUID id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public PokerSessionEntity name(String name) {
        this.name = name;
        return this;
    }
    public PokerType getType() {
        return type;
    }
    public void setType(PokerType type) {
        this.type = type;
    }
    public PokerSessionEntity type(PokerType type) {
        this.type = type;
        return this;
    }
    public List<MemberEntity> getMembers() {
        return members;
    }
    public void setMembers(List<MemberEntity> members) {
        this.members = members;
    }

}
