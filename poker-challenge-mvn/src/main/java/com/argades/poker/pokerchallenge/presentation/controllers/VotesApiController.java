package com.argades.poker.pokerchallenge.presentation.controllers;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.argades.poker.pokerchallenge.shared.dtos.Vote;
import com.argades.poker.pokerchallenge.shared.dtos.Votes;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-16T16:35:44.158162492Z[GMT]")
@RestController
public class VotesApiController implements VotesApi {

    private static final Logger log = LoggerFactory.getLogger(VotesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    public VotesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Vote> createVote(
            @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema()) @Valid @RequestBody Vote body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Vote>(objectMapper.readValue(
                        "{\n  \"member\" : {\n    \"nickName\" : \"\",\n    \"id\" : \"\",\n    \"age\" : \"\"\n  },\n  \"id\" : \"\",\n  \"value\" : \"\"\n}",
                        Vote.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Vote>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Vote>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Votes> getVotes(
            @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("sessionId") Object sessionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Votes>(objectMapper.readValue("\"\"", Votes.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Votes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Votes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
