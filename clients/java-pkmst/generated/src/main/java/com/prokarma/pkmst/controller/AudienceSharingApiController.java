package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AdAccountsAudiencesSharedAccountsList200Response;
import com.prokarma.pkmst.model.AudienceAccountType;
import com.prokarma.pkmst.model.AudiencesList200Response;
import com.prokarma.pkmst.model.BusinessSharedAudience;
import com.prokarma.pkmst.model.BusinessSharedAudienceResponse;
import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.SharedAudience;
import com.prokarma.pkmst.model.SharedAudienceResponse;

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
public class AudienceSharingApiController implements AudienceSharingApi {
    private final ObjectMapper objectMapper;
@Autowired
    public AudienceSharingApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response> adAccountsAudiencesSharedAccountsList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of the audience to use to filter the results.", required = true)  @RequestParam(value = "audience_id", required = true) String audienceId,
        @ApiParam(value = "Filter accounts by account type.", required = true, allowableValues = "AD_ACCOUNT, BUSINESS_ACCOUNT", defaultValue = "AD_ACCOUNT")  @RequestParam(value = "account_type", required = true, defaultValue="AD_ACCOUNT") AudienceAccountType accountType,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response>(objectMapper.readValue("", AdAccountsAudiencesSharedAccountsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response>(objectMapper.readValue("", AdAccountsAudiencesSharedAccountsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response>(objectMapper.readValue("", AdAccountsAudiencesSharedAccountsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response>(objectMapper.readValue("", AdAccountsAudiencesSharedAccountsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response> businessAccountAudiencesSharedAccountsList(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "Unique identifier of the audience to use to filter the results.", required = true)  @RequestParam(value = "audience_id", required = true) String audienceId,
        @ApiParam(value = "Filter accounts by account type.", required = true, allowableValues = "AD_ACCOUNT, BUSINESS_ACCOUNT", defaultValue = "AD_ACCOUNT")  @RequestParam(value = "account_type", required = true, defaultValue="AD_ACCOUNT") AudienceAccountType accountType,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response>(objectMapper.readValue("", AdAccountsAudiencesSharedAccountsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response>(objectMapper.readValue("", AdAccountsAudiencesSharedAccountsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response>(objectMapper.readValue("", AdAccountsAudiencesSharedAccountsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response>(objectMapper.readValue("", AdAccountsAudiencesSharedAccountsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<AudiencesList200Response> sharedAudiencesForBusinessList(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) String order,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AudiencesList200Response>(objectMapper.readValue("", AudiencesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AudiencesList200Response>(objectMapper.readValue("", AudiencesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AudiencesList200Response>(objectMapper.readValue("", AudiencesList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<AudiencesList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<SharedAudienceResponse> updateAdAccountToAdAccountSharedAudience(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody SharedAudience sharedAudience,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SharedAudienceResponse>(objectMapper.readValue("", SharedAudienceResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SharedAudienceResponse>(objectMapper.readValue("", SharedAudienceResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SharedAudienceResponse>(objectMapper.readValue("", SharedAudienceResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<SharedAudienceResponse>(HttpStatus.OK);
    }

    public ResponseEntity<BusinessSharedAudienceResponse> updateAdAccountToBusinessSharedAudience(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody BusinessSharedAudience businessSharedAudience,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessSharedAudienceResponse>(objectMapper.readValue("", BusinessSharedAudienceResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessSharedAudienceResponse>(objectMapper.readValue("", BusinessSharedAudienceResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessSharedAudienceResponse>(objectMapper.readValue("", BusinessSharedAudienceResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<BusinessSharedAudienceResponse>(HttpStatus.OK);
    }

    public ResponseEntity<SharedAudienceResponse> updateBusinessToAdAccountSharedAudience(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody SharedAudience sharedAudience,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SharedAudienceResponse>(objectMapper.readValue("", SharedAudienceResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SharedAudienceResponse>(objectMapper.readValue("", SharedAudienceResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SharedAudienceResponse>(objectMapper.readValue("", SharedAudienceResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<SharedAudienceResponse>(HttpStatus.OK);
    }

    public ResponseEntity<BusinessSharedAudienceResponse> updateBusinessToBusinessSharedAudience(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody BusinessSharedAudience businessSharedAudience,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessSharedAudienceResponse>(objectMapper.readValue("", BusinessSharedAudienceResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessSharedAudienceResponse>(objectMapper.readValue("", BusinessSharedAudienceResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessSharedAudienceResponse>(objectMapper.readValue("", BusinessSharedAudienceResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<BusinessSharedAudienceResponse>(HttpStatus.OK);
    }

}
