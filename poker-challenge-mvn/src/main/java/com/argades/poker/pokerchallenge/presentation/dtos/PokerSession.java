package com.argades.poker.pokerchallenge.presentation.dtos;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Session of poker game planned
 */
@Schema(description = "Session of poker game planned")
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-16T16:35:44.158162492Z[GMT]")

public class PokerSession {
    @JsonProperty("id")
    private Object id = null;

    @JsonProperty("name")
    private Object name = null;

    @JsonProperty("pokerType")
    private Object pokerType = null;

    @JsonProperty("members")
    private Object members = null;

    public PokerSession id(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * 
     * @return id
     **/
    @Schema(description = "")

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public PokerSession name(Object name) {
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

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public PokerSession pokerType(Object pokerType) {
        this.pokerType = pokerType;
        return this;
    }

    /**
     * Type Poker session available to select
     * 
     * @return pokerType
     **/
    @Schema(description = "Type Poker session available to select")

    public Object getPokerType() {
        return pokerType;
    }

    public void setPokerType(Object pokerType) {
        this.pokerType = pokerType;
    }

    public PokerSession members(Object members) {
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

    public void setMembers(Object members) {
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
