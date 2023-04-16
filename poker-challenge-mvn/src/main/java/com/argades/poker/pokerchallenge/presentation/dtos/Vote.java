package com.argades.poker.pokerchallenge.presentation.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.Valid;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;

/**
 * Votes of session
 */
@Schema(description = "Votes of session")
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-16T16:35:44.158162492Z[GMT]")

public class Vote {
    @JsonProperty("id")
    private Object id = null;

    @JsonProperty("member")
    private Member member = null;

    @JsonProperty("value")
    private Object value = null;

    public Vote id(Object id) {
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

    public Vote member(Member member) {
        this.member = member;
        return this;
    }

    /**
     * Get member
     * 
     * @return member
     **/
    @Schema(description = "")

    @Valid
    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Vote value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * 
     * @return value
     **/
    @Schema(description = "")

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vote vote = (Vote) o;
        return Objects.equals(this.id, vote.id) &&
                Objects.equals(this.member, vote.member) &&
                Objects.equals(this.value, vote.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, member, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Vote {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    member: ").append(toIndentedString(member)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
