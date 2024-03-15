package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AdsCreditRedeemRequest;
import com.prokarma.pkmst.model.AdsCreditRedeemResponse;
import com.prokarma.pkmst.model.AdsCreditsDiscountsGet200Response;
import com.prokarma.pkmst.model.BillingProfilesGet200Response;
import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.SSIOAccountResponse;
import com.prokarma.pkmst.model.SSIOCreateInsertionOrderRequest;
import com.prokarma.pkmst.model.SSIOCreateInsertionOrderResponse;
import com.prokarma.pkmst.model.SSIOEditInsertionOrderRequest;
import com.prokarma.pkmst.model.SSIOEditInsertionOrderResponse;
import com.prokarma.pkmst.model.SSIOInsertionOrderStatusResponse;
import com.prokarma.pkmst.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import com.prokarma.pkmst.model.SsioOrderLinesGetByAdAccount200Response;

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
public class BillingApiController implements BillingApi {
    private final ObjectMapper objectMapper;
@Autowired
    public BillingApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<AdsCreditRedeemResponse> adsCreditRedeem(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Redeem ad credits request." ,required=true )   @RequestBody AdsCreditRedeemRequest adsCreditRedeemRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsCreditRedeemResponse>(objectMapper.readValue("", AdsCreditRedeemResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsCreditRedeemResponse>(objectMapper.readValue("", AdsCreditRedeemResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsCreditRedeemResponse>(objectMapper.readValue("", AdsCreditRedeemResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdsCreditRedeemResponse>(HttpStatus.OK);
    }

    public ResponseEntity<AdsCreditsDiscountsGet200Response> adsCreditsDiscountsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsCreditsDiscountsGet200Response>(objectMapper.readValue("", AdsCreditsDiscountsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsCreditsDiscountsGet200Response>(objectMapper.readValue("", AdsCreditsDiscountsGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdsCreditsDiscountsGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<BillingProfilesGet200Response> billingProfilesGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Return active billing profiles, if false return all billing profiles.", required = true)  @RequestParam(value = "is_active", required = true) Boolean isActive,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BillingProfilesGet200Response>(objectMapper.readValue("", BillingProfilesGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BillingProfilesGet200Response>(objectMapper.readValue("", BillingProfilesGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BillingProfilesGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<SSIOAccountResponse> ssioAccountsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SSIOAccountResponse>(objectMapper.readValue("", SSIOAccountResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SSIOAccountResponse>(objectMapper.readValue("", SSIOAccountResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SSIOAccountResponse>(objectMapper.readValue("", SSIOAccountResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<SSIOAccountResponse>(HttpStatus.OK);
    }

    public ResponseEntity<SSIOCreateInsertionOrderResponse> ssioInsertionOrderCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Order line to create." ,required=true )   @RequestBody SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SSIOCreateInsertionOrderResponse>(objectMapper.readValue("", SSIOCreateInsertionOrderResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SSIOCreateInsertionOrderResponse>(objectMapper.readValue("", SSIOCreateInsertionOrderResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SSIOCreateInsertionOrderResponse>(objectMapper.readValue("", SSIOCreateInsertionOrderResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<SSIOCreateInsertionOrderResponse>(HttpStatus.OK);
    }

    public ResponseEntity<SSIOEditInsertionOrderResponse> ssioInsertionOrderEdit(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Order line to create." ,required=true )   @RequestBody SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SSIOEditInsertionOrderResponse>(objectMapper.readValue("", SSIOEditInsertionOrderResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SSIOEditInsertionOrderResponse>(objectMapper.readValue("", SSIOEditInsertionOrderResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SSIOEditInsertionOrderResponse>(objectMapper.readValue("", SSIOEditInsertionOrderResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<SSIOEditInsertionOrderResponse>(HttpStatus.OK);
    }

    public ResponseEntity<SsioInsertionOrdersStatusGetByAdAccount200Response> ssioInsertionOrdersStatusGetByAdAccount(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SsioInsertionOrdersStatusGetByAdAccount200Response>(objectMapper.readValue("", SsioInsertionOrdersStatusGetByAdAccount200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SsioInsertionOrdersStatusGetByAdAccount200Response>(objectMapper.readValue("", SsioInsertionOrdersStatusGetByAdAccount200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SsioInsertionOrdersStatusGetByAdAccount200Response>(objectMapper.readValue("", SsioInsertionOrdersStatusGetByAdAccount200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<SsioInsertionOrdersStatusGetByAdAccount200Response>(HttpStatus.OK);
    }

    public ResponseEntity<SSIOInsertionOrderStatusResponse> ssioInsertionOrdersStatusGetByPinOrderId(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "The pin order id associated with the ssio insertion order",required=true ) @PathVariable("pin_order_id") String pinOrderId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SSIOInsertionOrderStatusResponse>(objectMapper.readValue("", SSIOInsertionOrderStatusResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SSIOInsertionOrderStatusResponse>(objectMapper.readValue("", SSIOInsertionOrderStatusResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SSIOInsertionOrderStatusResponse>(objectMapper.readValue("", SSIOInsertionOrderStatusResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<SSIOInsertionOrderStatusResponse>(HttpStatus.OK);
    }

    public ResponseEntity<SsioOrderLinesGetByAdAccount200Response> ssioOrderLinesGetByAdAccount(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The pin order id associated with the ssio insertino order")  @RequestParam(value = "pin_order_id", required = false) String pinOrderId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SsioOrderLinesGetByAdAccount200Response>(objectMapper.readValue("", SsioOrderLinesGetByAdAccount200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SsioOrderLinesGetByAdAccount200Response>(objectMapper.readValue("", SsioOrderLinesGetByAdAccount200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SsioOrderLinesGetByAdAccount200Response>(objectMapper.readValue("", SsioOrderLinesGetByAdAccount200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<SsioOrderLinesGetByAdAccount200Response>(HttpStatus.OK);
    }

}
