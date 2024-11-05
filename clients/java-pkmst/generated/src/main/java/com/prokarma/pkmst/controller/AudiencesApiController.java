package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Audience;
import com.prokarma.pkmst.model.AudienceCreateCustomRequest;
import com.prokarma.pkmst.model.AudienceCreateRequest;
import com.prokarma.pkmst.model.AudienceUpdateRequest;
import com.prokarma.pkmst.model.AudiencesList200Response;
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
public class AudiencesApiController implements AudiencesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public AudiencesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Audience> audiencesCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "List of ads to create, size limit [1, 30]" ,required=true )   @RequestBody AudienceCreateRequest audienceCreateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Audience>(objectMapper.readValue("", Audience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Audience>(objectMapper.readValue("", Audience.class), HttpStatus.OK);
        }

        return new ResponseEntity<Audience>(HttpStatus.OK);
    }

    public ResponseEntity<Audience> audiencesCreateCustom(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Custom audience to create." ,required=true )   @RequestBody AudienceCreateCustomRequest audienceCreateCustomRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Audience>(objectMapper.readValue("", Audience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Audience>(objectMapper.readValue("", Audience.class), HttpStatus.OK);
        }

        return new ResponseEntity<Audience>(HttpStatus.OK);
    }

    public ResponseEntity<Audience> audiencesGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of an audience",required=true ) @PathVariable("audience_id") String audienceId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Audience>(objectMapper.readValue("", Audience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Audience>(objectMapper.readValue("", Audience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Audience>(objectMapper.readValue("", Audience.class), HttpStatus.OK);
        }

        return new ResponseEntity<Audience>(HttpStatus.OK);
    }

    public ResponseEntity<AudiencesList200Response> audiencesList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) String order,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Filter audiences by ownership type.", allowableValues = "OWNED, RECEIVED", defaultValue = "OWNED")  @RequestParam(value = "ownership_type", required = false, defaultValue="OWNED") String ownershipType,
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

    public ResponseEntity<Audience> audiencesUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of an audience",required=true ) @PathVariable("audience_id") String audienceId,
        @ApiParam(value = "The audience to be updated."  )   @RequestBody AudienceUpdateRequest audienceUpdateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Audience>(objectMapper.readValue("", Audience.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Audience>(objectMapper.readValue("", Audience.class), HttpStatus.OK);
        }

        return new ResponseEntity<Audience>(HttpStatus.OK);
    }

}
