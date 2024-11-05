package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AdAccountCreateSubscriptionRequest;
import com.prokarma.pkmst.model.AdAccountCreateSubscriptionResponse;
import com.prokarma.pkmst.model.AdAccountGetSubscriptionResponse;
import com.prokarma.pkmst.model.AdAccountsSubscriptionsGetList200Response;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Controller
public class LeadAdsApiController implements LeadAdsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public LeadAdsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Void> adAccountsSubscriptionsDelById(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a subscription.",required=true ) @PathVariable("subscription_id") String subscriptionId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
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

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<AdAccountGetSubscriptionResponse> adAccountsSubscriptionsGetById(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a subscription.",required=true ) @PathVariable("subscription_id") String subscriptionId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountGetSubscriptionResponse>(objectMapper.readValue("", AdAccountGetSubscriptionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountGetSubscriptionResponse>(objectMapper.readValue("", AdAccountGetSubscriptionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountGetSubscriptionResponse>(objectMapper.readValue("", AdAccountGetSubscriptionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountGetSubscriptionResponse>(objectMapper.readValue("", AdAccountGetSubscriptionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountGetSubscriptionResponse>(objectMapper.readValue("", AdAccountGetSubscriptionResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccountGetSubscriptionResponse>(HttpStatus.OK);
    }

    public ResponseEntity<AdAccountsSubscriptionsGetList200Response> adAccountsSubscriptionsGetList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
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

        return new ResponseEntity<AdAccountsSubscriptionsGetList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<AdAccountCreateSubscriptionResponse> adAccountsSubscriptionsPost(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Subscription to create." ,required=true )   @RequestBody AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountCreateSubscriptionResponse>(objectMapper.readValue("", AdAccountCreateSubscriptionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountCreateSubscriptionResponse>(objectMapper.readValue("", AdAccountCreateSubscriptionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountCreateSubscriptionResponse>(objectMapper.readValue("", AdAccountCreateSubscriptionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountCreateSubscriptionResponse>(objectMapper.readValue("", AdAccountCreateSubscriptionResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccountCreateSubscriptionResponse>(HttpStatus.OK);
    }

}
