package com.argades.poker.pokerchallenge.presentation.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.argades.poker.pokerchallenge.presentation.dtos.Member;
import com.argades.poker.pokerchallenge.presentation.dtos.PokerSession;
import com.argades.poker.pokerchallenge.presentation.dtos.PokerSessionList;
import com.argades.poker.pokerchallenge.presentation.dtos.PokerType;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-15T17:20:46.339067375Z[GMT]")
@Validated
public interface PokerSessionsApi {

    @Operation(summary = "Add member to poker session.", description = "", tags = {})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Member successful added to poker session.",
                         content = @Content(mediaType = "application/json",
                         schema = @Schema(implementation = Member.class))) 
        })
    @RequestMapping(value = "/poker-sessions/{sessionId}/members", produces = { "application/json" }, consumes = {
            "application/json" }, method = RequestMethod.POST)
    ResponseEntity<Member> addMember(
            @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("sessionId") UUID sessionId,
            @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema()) @Valid @RequestBody List<Member> body);

    @Operation(summary = "Create poker session", description = "", tags = { "pokerSession" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Poker session Successful created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PokerSession.class))) })
    @RequestMapping(value = "/poker-sessions", produces = { "application/json" }, consumes = {
            "application/json" }, method = RequestMethod.POST)
    ResponseEntity<PokerSession> createPokerSession();

    @Operation(summary = "", description = "", tags = { "pokerSession" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PokerSession.class))) })
    @RequestMapping(value = "/poker-sessions/{sessionId}", produces = {
            "application/json" }, method = RequestMethod.GET)
    ResponseEntity<PokerSession> getPokerSession(
            @Parameter(in = ParameterIn.PATH, description = "Session id of planned poker session", required = true, schema = @Schema()) @PathVariable("sessionId") UUID sessionId);

    @Operation(summary = "", description = "", tags = { "pokerSession" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PokerSessionList.class))) })
    @RequestMapping(value = "/poker-sessions", produces = { "application/json" }, method = RequestMethod.GET)
    ResponseEntity<PokerSessionList> getPokerSessions(
            @Parameter(in = ParameterIn.QUERY, description = "Type of poker session", schema = @Schema()) @Valid @RequestParam(value = "pokerType", required = false) PokerType pokerType);

}
