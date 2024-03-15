package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AudienceDefinitionResponse;
import com.prokarma.pkmst.model.AudienceInsightType;
import com.prokarma.pkmst.model.AudienceInsightsResponse;
import com.prokarma.pkmst.model.Error;

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
public class AudienceInsightsApiController implements AudienceInsightsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public AudienceInsightsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<AudienceInsightsResponse> audienceInsightsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Type of audience insights.", required = true, allowableValues = "YOUR_TOTAL_AUDIENCE, YOUR_ENGAGED_AUDIENCE, PINTEREST_TOTAL_AUDIENCE", defaultValue = "YOUR_TOTAL_AUDIENCE")  @RequestParam(value = "audience_insight_type", required = true, defaultValue="YOUR_TOTAL_AUDIENCE") AudienceInsightType audienceInsightType,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AudienceInsightsResponse>(objectMapper.readValue("", AudienceInsightsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AudienceInsightsResponse>(objectMapper.readValue("", AudienceInsightsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<AudienceInsightsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<AudienceDefinitionResponse> audienceInsightsScopeAndTypeGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AudienceDefinitionResponse>(objectMapper.readValue("", AudienceDefinitionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AudienceDefinitionResponse>(objectMapper.readValue("", AudienceDefinitionResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<AudienceDefinitionResponse>(HttpStatus.OK);
    }

}
