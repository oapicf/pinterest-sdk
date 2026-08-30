package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AdAccountToAdAccountSharedAudience;
import com.prokarma.pkmst.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody;
import com.prokarma.pkmst.model.AdAccountToBusinessSharedAudience;
import com.prokarma.pkmst.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody;
import com.prokarma.pkmst.model.AdAccountsAudiencesSharedAccountsList200Response;
import com.prokarma.pkmst.model.AudienceAccountType;
import com.prokarma.pkmst.model.BusinessToAdAccountSharedAudience;
import com.prokarma.pkmst.model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody;
import com.prokarma.pkmst.model.BusinessToBusinessSharedAudience;
import com.prokarma.pkmst.model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody;
import com.prokarma.pkmst.model.Order;
import com.prokarma.pkmst.model.PinterestLibError;
import com.prokarma.pkmst.model.SharedAudiencesForBusinessList200Response;

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
public class AudienceSharingApiController implements AudienceSharingApi {
    private final ObjectMapper objectMapper;
@Autowired
    public AudienceSharingApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response> adAccountsAudiencesSharedAccountsList(@ApiParam(value = "Unique identifier of the audience to use to filter the results.", required = true)  @RequestParam(value = "audience_id", required = true) String audienceId,
        @ApiParam(value = "Filter accounts by account type.", required = true, allowableValues = "AD_ACCOUNT, BUSINESS_ACCOUNT")  @RequestParam(value = "account_type", required = true) AudienceAccountType accountType,
        @ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
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
        @ApiParam(value = "Filter accounts by account type.", required = true, allowableValues = "AD_ACCOUNT, BUSINESS_ACCOUNT")  @RequestParam(value = "account_type", required = true) AudienceAccountType accountType,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
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

    public ResponseEntity<SharedAudiencesForBusinessList200Response> sharedAudiencesForBusinessList(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) Order order,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SharedAudiencesForBusinessList200Response>(objectMapper.readValue("", SharedAudiencesForBusinessList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SharedAudiencesForBusinessList200Response>(objectMapper.readValue("", SharedAudiencesForBusinessList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SharedAudiencesForBusinessList200Response>(objectMapper.readValue("", SharedAudiencesForBusinessList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SharedAudiencesForBusinessList200Response>(objectMapper.readValue("", SharedAudiencesForBusinessList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SharedAudiencesForBusinessList200Response>(objectMapper.readValue("", SharedAudiencesForBusinessList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SharedAudiencesForBusinessList200Response>(objectMapper.readValue("", SharedAudiencesForBusinessList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SharedAudiencesForBusinessList200Response>(objectMapper.readValue("", SharedAudiencesForBusinessList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<SharedAudiencesForBusinessList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<AdAccountToAdAccountSharedAudience> updateAdAccountToAdAccountSharedAudience(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountToAdAccountSharedAudience>(objectMapper.readValue("", AdAccountToAdAccountSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountToAdAccountSharedAudience>(objectMapper.readValue("", AdAccountToAdAccountSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountToAdAccountSharedAudience>(objectMapper.readValue("", AdAccountToAdAccountSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountToAdAccountSharedAudience>(objectMapper.readValue("", AdAccountToAdAccountSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountToAdAccountSharedAudience>(objectMapper.readValue("", AdAccountToAdAccountSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountToAdAccountSharedAudience>(objectMapper.readValue("", AdAccountToAdAccountSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountToAdAccountSharedAudience>(objectMapper.readValue("", AdAccountToAdAccountSharedAudience.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccountToAdAccountSharedAudience>(HttpStatus.OK);
    }

    public ResponseEntity<AdAccountToBusinessSharedAudience> updateAdAccountToBusinessSharedAudience(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountToBusinessSharedAudience>(objectMapper.readValue("", AdAccountToBusinessSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountToBusinessSharedAudience>(objectMapper.readValue("", AdAccountToBusinessSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountToBusinessSharedAudience>(objectMapper.readValue("", AdAccountToBusinessSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountToBusinessSharedAudience>(objectMapper.readValue("", AdAccountToBusinessSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountToBusinessSharedAudience>(objectMapper.readValue("", AdAccountToBusinessSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountToBusinessSharedAudience>(objectMapper.readValue("", AdAccountToBusinessSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountToBusinessSharedAudience>(objectMapper.readValue("", AdAccountToBusinessSharedAudience.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccountToBusinessSharedAudience>(HttpStatus.OK);
    }

    public ResponseEntity<BusinessToAdAccountSharedAudience> updateBusinessToAdAccountSharedAudience(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessToAdAccountSharedAudience>(objectMapper.readValue("", BusinessToAdAccountSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessToAdAccountSharedAudience>(objectMapper.readValue("", BusinessToAdAccountSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessToAdAccountSharedAudience>(objectMapper.readValue("", BusinessToAdAccountSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessToAdAccountSharedAudience>(objectMapper.readValue("", BusinessToAdAccountSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessToAdAccountSharedAudience>(objectMapper.readValue("", BusinessToAdAccountSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessToAdAccountSharedAudience>(objectMapper.readValue("", BusinessToAdAccountSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessToAdAccountSharedAudience>(objectMapper.readValue("", BusinessToAdAccountSharedAudience.class), HttpStatus.OK);
        }

        return new ResponseEntity<BusinessToAdAccountSharedAudience>(HttpStatus.OK);
    }

    public ResponseEntity<BusinessToBusinessSharedAudience> updateBusinessToBusinessSharedAudience(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessToBusinessSharedAudience>(objectMapper.readValue("", BusinessToBusinessSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessToBusinessSharedAudience>(objectMapper.readValue("", BusinessToBusinessSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessToBusinessSharedAudience>(objectMapper.readValue("", BusinessToBusinessSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessToBusinessSharedAudience>(objectMapper.readValue("", BusinessToBusinessSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessToBusinessSharedAudience>(objectMapper.readValue("", BusinessToBusinessSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessToBusinessSharedAudience>(objectMapper.readValue("", BusinessToBusinessSharedAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessToBusinessSharedAudience>(objectMapper.readValue("", BusinessToBusinessSharedAudience.class), HttpStatus.OK);
        }

        return new ResponseEntity<BusinessToBusinessSharedAudience>(HttpStatus.OK);
    }

}
