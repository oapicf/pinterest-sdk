package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AdAccountsAudience;
import com.prokarma.pkmst.model.AdAccountsAudienceCreate;
import com.prokarma.pkmst.model.AdAccountsAudienceUpdate;
import com.prokarma.pkmst.model.AudienceOwnershipType;
import com.prokarma.pkmst.model.AudiencesList200Response;
import com.prokarma.pkmst.model.PinterestLibError;
import com.prokarma.pkmst.model.PinterestLibPaginationOrder;

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
public class AudiencesApiController implements AudiencesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public AudiencesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<AdAccountsAudience> audiencesCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody AdAccountsAudienceCreate adAccountsAudienceCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccountsAudience>(HttpStatus.OK);
    }

    public ResponseEntity<AdAccountsAudience> audiencesGet(@ApiParam(value = "Audience ID.",required=true ) @PathVariable("audience_id") String audienceId,
        @ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccountsAudience>(HttpStatus.OK);
    }

    public ResponseEntity<AudiencesList200Response> audiencesList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) PinterestLibPaginationOrder order,
        @ApiParam(value = "", allowableValues = "OWNED, RECEIVED")  @RequestParam(value = "ownership_type", required = false) AudienceOwnershipType ownershipType,
        @ApiParam(value = "When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).", defaultValue = "false")  @RequestParam(value = "exclude_nca", required = false, defaultValue="false") Boolean excludeNca,
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


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AudiencesList200Response>(objectMapper.readValue("", AudiencesList200Response.class), HttpStatus.OK);
        }


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

    public ResponseEntity<AdAccountsAudience> audiencesUpdate(@ApiParam(value = "Audience ID.",required=true ) @PathVariable("audience_id") String audienceId,
        @ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody AdAccountsAudienceUpdate adAccountsAudienceUpdate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsAudience>(objectMapper.readValue("", AdAccountsAudience.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccountsAudience>(HttpStatus.OK);
    }

}
