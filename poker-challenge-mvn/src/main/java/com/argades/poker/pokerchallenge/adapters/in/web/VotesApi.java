package com.argades.poker.pokerchallenge.adapters.in.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.argades.poker.pokerchallenge.domain.Vote;
import com.argades.poker.pokerchallenge.domain.Votes;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-16T16:35:44.158162492Z[GMT]")
@Valid
public interface VotesApi {

    @Operation(summary = "Add vote", description = "", tags = {})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successful vote added", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Vote.class))) })
    @RequestMapping(value = "/votes", produces = { "application/json" }, consumes = {
            "application/json" }, method = RequestMethod.POST)
    ResponseEntity<Vote> createVote(
            @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema()) @Valid @RequestBody Vote body);

    @Operation(summary = "get all votes of session", description = "", tags = {})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Get successful votes", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Votes.class))) })
    @RequestMapping(value = "/votes/session/{sessionId}", produces = { "application/json" }, method = RequestMethod.GET)
    ResponseEntity<Votes> getVotes(
            @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("sessionId") Object sessionId);

}
