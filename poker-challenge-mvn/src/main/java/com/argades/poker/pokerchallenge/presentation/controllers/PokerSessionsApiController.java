package com.argades.poker.pokerchallenge.presentation.controllers;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.argades.poker.pokerchallenge.shared.dtos.Member;
import com.argades.poker.pokerchallenge.shared.dtos.PokerSession;
import com.argades.poker.pokerchallenge.shared.dtos.PokerSessionList;
import com.argades.poker.pokerchallenge.shared.dtos.PokerType;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-15T17:20:46.339067375Z[GMT]")
@RestController
public class PokerSessionsApiController implements PokerSessionsApi {

    private static final Logger log = LoggerFactory.getLogger(PokerSessionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    public PokerSessionsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Member> addMember(
            @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("sessionId") UUID sessionId,
            @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema()) @Valid @RequestBody List<Member> body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Member>(objectMapper.readValue(
                        "{\n  \"nickName\" : \"nickName\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"age\" : 0.8008281904610115\n}",
                        Member.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Member>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Member>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PokerSession> createPokerSession() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PokerSession>(objectMapper.readValue(
                        "{\n  \"pokerType\" : \"\",\n  \"members\" : [ {\n    \"nickName\" : \"nickName\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"age\" : 0.8008281904610115\n  }, {\n    \"nickName\" : \"nickName\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"age\" : 0.8008281904610115\n  } ],\n  \"name\" : \"name\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}",
                        PokerSession.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PokerSession>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PokerSession>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PokerSession> getPokerSession(
            @Parameter(in = ParameterIn.PATH, description = "Session id of planned poker session", required = true, schema = @Schema()) @PathVariable("sessionId") UUID sessionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PokerSession>(objectMapper.readValue(
                        "{\n  \"pokerType\" : \"\",\n  \"members\" : [ {\n    \"nickName\" : \"nickName\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"age\" : 0.8008281904610115\n  }, {\n    \"nickName\" : \"nickName\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"age\" : 0.8008281904610115\n  } ],\n  \"name\" : \"name\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}",
                        PokerSession.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PokerSession>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PokerSession>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PokerSessionList> getPokerSessions(
            @Parameter(in = ParameterIn.QUERY, description = "Type of poker session", schema = @Schema()) @Valid @RequestParam(value = "pokerType", required = false) PokerType pokerType) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PokerSessionList>(objectMapper.readValue(
                        "[ {\n  \"pokerType\" : \"\",\n  \"members\" : [ {\n    \"nickName\" : \"nickName\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"age\" : 0.8008281904610115\n  }, {\n    \"nickName\" : \"nickName\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"age\" : 0.8008281904610115\n  } ],\n  \"name\" : \"name\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}, {\n  \"pokerType\" : \"\",\n  \"members\" : [ {\n    \"nickName\" : \"nickName\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"age\" : 0.8008281904610115\n  }, {\n    \"nickName\" : \"nickName\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"age\" : 0.8008281904610115\n  } ],\n  \"name\" : \"name\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n} ]",
                        PokerSessionList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PokerSessionList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PokerSessionList>(HttpStatus.NOT_IMPLEMENTED);
    }

}
