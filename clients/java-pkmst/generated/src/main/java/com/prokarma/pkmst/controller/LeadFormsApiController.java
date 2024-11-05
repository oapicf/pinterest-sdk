package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.LeadFormArrayResponse;
import com.prokarma.pkmst.model.LeadFormCreateRequest;
import com.prokarma.pkmst.model.LeadFormResponse;
import com.prokarma.pkmst.model.LeadFormTestRequest;
import com.prokarma.pkmst.model.LeadFormTestResponse;
import com.prokarma.pkmst.model.LeadFormUpdateRequest;
import com.prokarma.pkmst.model.LeadFormsList200Response;
import java.util.List;

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
public class LeadFormsApiController implements LeadFormsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public LeadFormsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<LeadFormResponse> leadFormGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a lead form.",required=true ) @PathVariable("lead_form_id") String leadFormId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormResponse>(objectMapper.readValue("", LeadFormResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormResponse>(objectMapper.readValue("", LeadFormResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormResponse>(objectMapper.readValue("", LeadFormResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormResponse>(objectMapper.readValue("", LeadFormResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<LeadFormResponse>(HttpStatus.OK);
    }

    public ResponseEntity<LeadFormTestResponse> leadFormTestCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a lead form.",required=true ) @PathVariable("lead_form_id") String leadFormId,
        @ApiParam(value = "Subscription to create." ,required=true )   @RequestBody LeadFormTestRequest leadFormTestRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormTestResponse>(objectMapper.readValue("", LeadFormTestResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormTestResponse>(objectMapper.readValue("", LeadFormTestResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormTestResponse>(objectMapper.readValue("", LeadFormTestResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormTestResponse>(objectMapper.readValue("", LeadFormTestResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<LeadFormTestResponse>(HttpStatus.OK);
    }

    public ResponseEntity<LeadFormArrayResponse> leadFormsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "List of lead forms to create, size limit [1, 30]." ,required=true )   @RequestBody List<LeadFormCreateRequest> leadFormCreateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormArrayResponse>(objectMapper.readValue("", LeadFormArrayResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormArrayResponse>(objectMapper.readValue("", LeadFormArrayResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormArrayResponse>(objectMapper.readValue("", LeadFormArrayResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<LeadFormArrayResponse>(HttpStatus.OK);
    }

    public ResponseEntity<LeadFormsList200Response> leadFormsList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) String order,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsList200Response>(objectMapper.readValue("", LeadFormsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsList200Response>(objectMapper.readValue("", LeadFormsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsList200Response>(objectMapper.readValue("", LeadFormsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<LeadFormsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<LeadFormArrayResponse> leadFormsUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "List of lead forms to update, size limit [1, 30]." ,required=true )   @RequestBody List<LeadFormUpdateRequest> leadFormUpdateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormArrayResponse>(objectMapper.readValue("", LeadFormArrayResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormArrayResponse>(objectMapper.readValue("", LeadFormArrayResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormArrayResponse>(objectMapper.readValue("", LeadFormArrayResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<LeadFormArrayResponse>(HttpStatus.OK);
    }

}
