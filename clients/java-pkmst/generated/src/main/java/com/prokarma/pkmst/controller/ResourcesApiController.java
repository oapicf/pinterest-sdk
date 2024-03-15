package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AdAccountsCountryResponse;
import com.prokarma.pkmst.model.BookClosedResponse;
import com.prokarma.pkmst.model.DeliveryMetricsResponse;
import com.prokarma.pkmst.model.Error;
import java.util.List;
import com.prokarma.pkmst.model.SingleInterestTargetingOptionResponse;

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
public class ResourcesApiController implements ResourcesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ResourcesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<AdAccountsCountryResponse> adAccountCountriesGet(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsCountryResponse>(objectMapper.readValue("", AdAccountsCountryResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsCountryResponse>(objectMapper.readValue("", AdAccountsCountryResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccountsCountryResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DeliveryMetricsResponse> deliveryMetricsGet(@ApiParam(value = "Report type.", allowableValues = "SYNC, ASYNC")  @RequestParam(value = "report_type", required = false) String reportType,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeliveryMetricsResponse>(objectMapper.readValue("", DeliveryMetricsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeliveryMetricsResponse>(objectMapper.readValue("", DeliveryMetricsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeliveryMetricsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<SingleInterestTargetingOptionResponse> interestTargetingOptionsGet(@ApiParam(value = "Unique identifier of an interest.",required=true ) @PathVariable("interest_id") String interestId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SingleInterestTargetingOptionResponse>(objectMapper.readValue("", SingleInterestTargetingOptionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SingleInterestTargetingOptionResponse>(objectMapper.readValue("", SingleInterestTargetingOptionResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<SingleInterestTargetingOptionResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Void> leadFormQuestionsGet(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<BookClosedResponse> metricsReadyStateGet(@ApiParam(value = "Analytics reports request date (UTC). Format: YYYY-MM-DD", required = true)  @RequestParam(value = "date", required = true) String date,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BookClosedResponse>(objectMapper.readValue("", BookClosedResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BookClosedResponse>(objectMapper.readValue("", BookClosedResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<BookClosedResponse>(HttpStatus.OK);
    }

    public ResponseEntity<List<Object>> targetingOptionsGet(@ApiParam(value = "Public targeting type.",required=true, allowableValues="{values=[APPTYPE, GENDER, LOCALE, AGE_BUCKET, LOCATION, GEO, INTEREST, KEYWORD, AUDIENCE_INCLUDE, AUDIENCE_EXCLUDE], enumVars=[{name=APPTYPE, isString=true, value="APPTYPE"}, {name=GENDER, isString=true, value="GENDER"}, {name=LOCALE, isString=true, value="LOCALE"}, {name=AGE_BUCKET, isString=true, value="AGE_BUCKET"}, {name=LOCATION, isString=true, value="LOCATION"}, {name=GEO, isString=true, value="GEO"}, {name=INTEREST, isString=true, value="INTEREST"}, {name=KEYWORD, isString=true, value="KEYWORD"}, {name=AUDIENCE_INCLUDE, isString=true, value="AUDIENCE_INCLUDE"}, {name=AUDIENCE_EXCLUDE, isString=true, value="AUDIENCE_EXCLUDE"}]}" ) @PathVariable("targeting_type") String targetingType,
        @ApiParam(value = "Client ID.")  @RequestParam(value = "client_id", required = false) String clientId,
        @ApiParam(value = "Oauth signature")  @RequestParam(value = "oauth_signature", required = false) String oauthSignature,
        @ApiParam(value = "Timestamp")  @RequestParam(value = "timestamp", required = false) String timestamp,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Object>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Object>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<Object>>(HttpStatus.OK);
    }

}
