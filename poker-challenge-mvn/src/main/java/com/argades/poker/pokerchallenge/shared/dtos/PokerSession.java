package com.argades.poker.pokerchallenge.shared.dtos;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * Session of poker game planned
 */
@Schema(description = "Session of poker game planned")
@Validated
public class PokerSession {
    @JsonProperty("id")
    private UUID id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("pokerType")
    private PokerType pokerType = null;

    @JsonProperty("members")
    private List<Member> members = null;

    public PokerSession id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * 
     * @return id
     **/
    @Schema(description = "")

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public PokerSession name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * 
     * @return name
     **/
    @Schema(required = true, description = "")
    @NotNull

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PokerSession pokerType(PokerType pokerType) {
        this.pokerType = pokerType;
        return this;
    }

    /**
     * Type Poker session available to select
     * 
     * @return pokerType
     **/
    @Schema(description = "Type Poker session available to select")

    public PokerType getPokerType() {
        return pokerType;
    }

    public void setPokerType(PokerType pokerType) {
        this.pokerType = pokerType;
    }

    public PokerSession members(List<Member> members) {
        this.members = members;
        return this;
    }

    /**
     * Members of poker session available
     * 
     * @return members
     **/
    @Schema(description = "Members of poker session available")

    public Object getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PokerSession pokerSession = (PokerSession) o;
        return Objects.equals(this.id, pokerSession.id) &&
                Objects.equals(this.name, pokerSession.name) &&
                Objects.equals(this.pokerType, pokerSession.pokerType) &&
                Objects.equals(this.members, pokerSession.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pokerType, members);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokerSession {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pokerType: ").append(toIndentedString(pokerType)).append("\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
