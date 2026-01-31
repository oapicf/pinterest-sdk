package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AdsCreditRedeemRequest;
import com.prokarma.pkmst.model.AdsCreditRedeemResponse;
import com.prokarma.pkmst.model.AdsCreditsDiscountsGet200Response;
import com.prokarma.pkmst.model.BillingInvoiceDownloadResponse;
import com.prokarma.pkmst.model.BillingInvoicesGet200Response;
import com.prokarma.pkmst.model.BillingProfilesGet200Response;
import com.prokarma.pkmst.model.Error;
import java.time.LocalDate;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
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

    public ResponseEntity<BillingInvoiceDownloadResponse> billingInvoiceDownloadGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a billing invoice.",required=true ) @PathVariable("billing_invoice_id") String billingInvoiceId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BillingInvoiceDownloadResponse>(objectMapper.readValue("", BillingInvoiceDownloadResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BillingInvoiceDownloadResponse>(objectMapper.readValue("", BillingInvoiceDownloadResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BillingInvoiceDownloadResponse>(objectMapper.readValue("", BillingInvoiceDownloadResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<BillingInvoiceDownloadResponse>(HttpStatus.OK);
    }

    public ResponseEntity<BillingInvoicesGet200Response> billingInvoicesGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Field of which to sort billing invoices", allowableValues = "DUE_DATE, BILLING_PERIOD, DOCUMENT_TYPE, TOTAL_AMOUNT, INVOICE_NUMBER", defaultValue = "DUE_DATE")  @RequestParam(value = "sort", required = false, defaultValue="DUE_DATE") String sort,
        @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) String order,
        @ApiParam(value = "Status of billing invoices to filter by", allowableValues = "OPEN, CLOSED")  @RequestParam(value = "status", required = false) String status,
        @ApiParam(value = "Document type of billing invoices to filter by", allowableValues = "INVOICE, CREDIT_MEMO")  @RequestParam(value = "document_type", required = false) String documentType,
        @ApiParam(value = "Starting point for due dates when searching for invoices. Format: YYYY-MM-DD")  @RequestParam(value = "start_due_date", required = false) LocalDate startDueDate,
        @ApiParam(value = "Ending point for due dates when searching for invoices. Format: YYYY-MM-DD")  @RequestParam(value = "end_due_date", required = false) LocalDate endDueDate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BillingInvoicesGet200Response>(objectMapper.readValue("", BillingInvoicesGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BillingInvoicesGet200Response>(objectMapper.readValue("", BillingInvoicesGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BillingInvoicesGet200Response>(objectMapper.readValue("", BillingInvoicesGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BillingInvoicesGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<BillingProfilesGet200Response> billingProfilesGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Return active billing profiles, if false return all billing profiles.", required = true)  @RequestParam(value = "is_active", required = true) Boolean isActive,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
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
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
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
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
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
