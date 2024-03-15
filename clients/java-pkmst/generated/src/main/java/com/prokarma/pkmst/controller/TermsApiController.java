package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Error;
import java.util.List;
import com.prokarma.pkmst.model.RelatedTerms;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Controller
public class TermsApiController implements TermsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public TermsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<RelatedTerms> termsRelatedList(@ApiParam(value = "List of input terms.", required = true)  @RequestParam(value = "terms", required = true) List<String> terms,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<RelatedTerms>(objectMapper.readValue("", RelatedTerms.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<RelatedTerms>(objectMapper.readValue("", RelatedTerms.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<RelatedTerms>(objectMapper.readValue("", RelatedTerms.class), HttpStatus.OK);
        }

        return new ResponseEntity<RelatedTerms>(HttpStatus.OK);
    }

    public ResponseEntity<List<String>> termsSuggestedList(@ApiParam(value = "Input term.", required = true)  @RequestParam(value = "term", required = true) String term,
        @ApiParam(value = "Max suggested terms to return.", defaultValue = "4")  @RequestParam(value = "limit", required = false, defaultValue="4") Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<String>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<String>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<String>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<String>>(HttpStatus.OK);
    }

}
