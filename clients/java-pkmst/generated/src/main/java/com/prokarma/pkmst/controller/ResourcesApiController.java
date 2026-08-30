package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AdAccountCountriesGet200Response;
import com.prokarma.pkmst.model.BookClosed;
import com.prokarma.pkmst.model.DeliveryMetricsGet200Response;
import java.util.List;
import com.prokarma.pkmst.model.PinterestLibError;
import com.prokarma.pkmst.model.PublicTargetingType;
import com.prokarma.pkmst.model.ReportType;
import com.prokarma.pkmst.model.SingleInterestTargetingOption;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Controller
public class ResourcesApiController implements ResourcesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ResourcesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<AdAccountCountriesGet200Response> adAccountCountriesGet(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountCountriesGet200Response>(objectMapper.readValue("", AdAccountCountriesGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountCountriesGet200Response>(objectMapper.readValue("", AdAccountCountriesGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountCountriesGet200Response>(objectMapper.readValue("", AdAccountCountriesGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountCountriesGet200Response>(objectMapper.readValue("", AdAccountCountriesGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountCountriesGet200Response>(objectMapper.readValue("", AdAccountCountriesGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountCountriesGet200Response>(objectMapper.readValue("", AdAccountCountriesGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountCountriesGet200Response>(objectMapper.readValue("", AdAccountCountriesGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccountCountriesGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<DeliveryMetricsGet200Response> deliveryMetricsGet(@ApiParam(value = "Report type.", allowableValues = "SYNC, ASYNC")  @RequestParam(value = "report_type", required = false) ReportType reportType,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeliveryMetricsGet200Response>(objectMapper.readValue("", DeliveryMetricsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeliveryMetricsGet200Response>(objectMapper.readValue("", DeliveryMetricsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeliveryMetricsGet200Response>(objectMapper.readValue("", DeliveryMetricsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeliveryMetricsGet200Response>(objectMapper.readValue("", DeliveryMetricsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeliveryMetricsGet200Response>(objectMapper.readValue("", DeliveryMetricsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeliveryMetricsGet200Response>(objectMapper.readValue("", DeliveryMetricsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeliveryMetricsGet200Response>(objectMapper.readValue("", DeliveryMetricsGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeliveryMetricsGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<SingleInterestTargetingOption> interestTargetingOptionsGet(@ApiParam(value = "Unique identifier of an interest.",required=true ) @PathVariable("interest_id") String interestId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SingleInterestTargetingOption>(objectMapper.readValue("", SingleInterestTargetingOption.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SingleInterestTargetingOption>(objectMapper.readValue("", SingleInterestTargetingOption.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SingleInterestTargetingOption>(objectMapper.readValue("", SingleInterestTargetingOption.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SingleInterestTargetingOption>(objectMapper.readValue("", SingleInterestTargetingOption.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SingleInterestTargetingOption>(objectMapper.readValue("", SingleInterestTargetingOption.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SingleInterestTargetingOption>(objectMapper.readValue("", SingleInterestTargetingOption.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SingleInterestTargetingOption>(objectMapper.readValue("", SingleInterestTargetingOption.class), HttpStatus.OK);
        }

        return new ResponseEntity<SingleInterestTargetingOption>(HttpStatus.OK);
    }

    public ResponseEntity<Void> leadFormQuestionsGet(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<BookClosed> metricsReadyStateGet(@ApiParam(value = "Analytics reports request date (UTC). Format: YYYY-MM-DD", required = true)  @RequestParam(value = "date", required = true) String date,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BookClosed>(objectMapper.readValue("", BookClosed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BookClosed>(objectMapper.readValue("", BookClosed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BookClosed>(objectMapper.readValue("", BookClosed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BookClosed>(objectMapper.readValue("", BookClosed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BookClosed>(objectMapper.readValue("", BookClosed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BookClosed>(objectMapper.readValue("", BookClosed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BookClosed>(objectMapper.readValue("", BookClosed.class), HttpStatus.OK);
        }

        return new ResponseEntity<BookClosed>(HttpStatus.OK);
    }

    public ResponseEntity<List<Object>> targetingOptionsGet(@ApiParam(value = "Public targeting type",required=true, allowableValues="{values=[APPTYPE, GENDER, LOCALE, AGE_BUCKET, LOCATION, GEO, INTEREST, KEYWORD, AUDIENCE_INCLUDE, AUDIENCE_EXCLUDE], enumVars=[{name=APPTYPE, isString=true, value="APPTYPE"}, {name=GENDER, isString=true, value="GENDER"}, {name=LOCALE, isString=true, value="LOCALE"}, {name=AGE_BUCKET, isString=true, value="AGE_BUCKET"}, {name=LOCATION, isString=true, value="LOCATION"}, {name=GEO, isString=true, value="GEO"}, {name=INTEREST, isString=true, value="INTEREST"}, {name=KEYWORD, isString=true, value="KEYWORD"}, {name=AUDIENCE_INCLUDE, isString=true, value="AUDIENCE_INCLUDE"}, {name=AUDIENCE_EXCLUDE, isString=true, value="AUDIENCE_EXCLUDE"}]}" ) @PathVariable("targeting_type") PublicTargetingType targetingType,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Client ID")  @RequestParam(value = "client_id", required = false) String clientId,
        @ApiParam(value = "Oauth signature")  @RequestParam(value = "oauth_signature", required = false) String oauthSignature,
        @ApiParam(value = "Timestamp.")  @RequestParam(value = "timestamp", required = false) String timestamp,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Object>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Object>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Object>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Object>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Object>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Object>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<Object>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<Object>>(HttpStatus.OK);
    }

}
