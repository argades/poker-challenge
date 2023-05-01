package com.argades.poker.pokerchallenge.adapters.out.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Member of poker session
 */
@Entity
@Table(name = "MEMBER")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id = null;

    private String nickName = null;

    @Column(name = "age", nullable = true)
    private int age;

    @ManyToOne
    @JoinColumn(name = "POKER_SESSION", nullable = false, updatable = false)
    private PokerSessionEntity pokerSessionEntity;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public MemberEntity id(Integer id) {
        this.id = id;
        return this;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public MemberEntity withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public MemberEntity withAge(int age) {
        this.age = age;
        return this;
    }
    public PokerSessionEntity getPokerSessionEntity() {
        return pokerSessionEntity;
    }
    public void setPokerSessionEntity(PokerSessionEntity pokerSessionEntity) {
        this.pokerSessionEntity = pokerSessionEntity;
    }
    public MemberEntity withPokerSessionEntity(PokerSessionEntity pokerSessionEntity) {
        this.pokerSessionEntity = pokerSessionEntity;
        return this;
    }
  
}
