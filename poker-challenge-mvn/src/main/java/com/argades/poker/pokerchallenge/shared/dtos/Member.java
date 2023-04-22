package com.argades.poker.pokerchallenge.shared.dtos;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Member of poker session
 */
@Schema(description = "Member of poker session")
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-16T16:35:44.158162492Z[GMT]")

public class Member {
    @JsonProperty("id")
    private Integer id = null;

    @JsonProperty("nickName")
    private String nickName = null;

    @JsonProperty("age")
    private int age;

    public Member id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * 
     * @return id
     **/
    @Schema(description = "")

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Member nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * Get nickName
     * 
     * @return nickName
     **/
    @Schema(required = true, description = "")
    @NotNull

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Member age(int age) {
        this.age = age;
        return this;
    }

    /**
     * Get age
     * 
     * @return age
     **/
    @Schema(description = "")

    public Object getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Member member = (Member) o;
        return Objects.equals(this.id, member.id) &&
                Objects.equals(this.nickName, member.nickName) &&
                Objects.equals(this.age, member.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickName, age);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Member {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    age: ").append(toIndentedString(age)).append("\n");
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
