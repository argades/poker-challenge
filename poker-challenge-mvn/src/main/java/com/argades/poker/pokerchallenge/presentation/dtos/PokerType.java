package com.argades.poker.pokerchallenge.presentation.dtos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Poker Type
 */
public enum PokerType {
    TEXAS_HOLDEM("texas_holdem"),
    OMAHA("omaha"),
    CARIBENYO("caribenyo"),
    STRIP("strip"),
    CARD_DRAW("card_draw");

    private Object value;

    PokerType(Object value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static PokerType fromValue(String text) {
        for (PokerType b : PokerType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
