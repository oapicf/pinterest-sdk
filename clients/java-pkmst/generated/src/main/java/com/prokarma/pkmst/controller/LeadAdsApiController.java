package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AdAccountsSubscriptionsGetList200Response;
import com.prokarma.pkmst.model.LeadSubscription;
import com.prokarma.pkmst.model.LeadSubscriptionPostParamsCreate;
import com.prokarma.pkmst.model.PinterestLibError;

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
public class LeadAdsApiController implements LeadAdsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public LeadAdsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<LeadSubscription> adAccountsSubscriptionsDelById(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a subscription.",required=true ) @PathVariable("subscription_id") String subscriptionId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }

        return new ResponseEntity<LeadSubscription>(HttpStatus.OK);
    }

    public ResponseEntity<LeadSubscription> adAccountsSubscriptionsGetById(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a subscription.",required=true ) @PathVariable("subscription_id") String subscriptionId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }

        return new ResponseEntity<LeadSubscription>(HttpStatus.OK);
    }

    public ResponseEntity<AdAccountsSubscriptionsGetList200Response> adAccountsSubscriptionsGetList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsSubscriptionsGetList200Response>(objectMapper.readValue("", AdAccountsSubscriptionsGetList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsSubscriptionsGetList200Response>(objectMapper.readValue("", AdAccountsSubscriptionsGetList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsSubscriptionsGetList200Response>(objectMapper.readValue("", AdAccountsSubscriptionsGetList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsSubscriptionsGetList200Response>(objectMapper.readValue("", AdAccountsSubscriptionsGetList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsSubscriptionsGetList200Response>(objectMapper.readValue("", AdAccountsSubscriptionsGetList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsSubscriptionsGetList200Response>(objectMapper.readValue("", AdAccountsSubscriptionsGetList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsSubscriptionsGetList200Response>(objectMapper.readValue("", AdAccountsSubscriptionsGetList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccountsSubscriptionsGetList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<LeadSubscription> adAccountsSubscriptionsPost(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadSubscription>(objectMapper.readValue("", LeadSubscription.class), HttpStatus.OK);
        }

        return new ResponseEntity<LeadSubscription>(HttpStatus.OK);
    }

}
