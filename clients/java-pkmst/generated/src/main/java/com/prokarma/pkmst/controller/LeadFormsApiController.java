package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.LeadForm;
import com.prokarma.pkmst.model.LeadFormBatchUpdate;
import com.prokarma.pkmst.model.LeadFormCreate;
import com.prokarma.pkmst.model.LeadFormTest;
import com.prokarma.pkmst.model.LeadFormTestCreate;
import com.prokarma.pkmst.model.LeadFormsCreate200Response;
import com.prokarma.pkmst.model.LeadFormsList200Response;
import java.util.List;
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
public class LeadFormsApiController implements LeadFormsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public LeadFormsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<LeadForm> leadFormGet(@ApiParam(value = "The ID of this lead form",required=true ) @PathVariable("lead_form_id") String leadFormId,
        @ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadForm>(objectMapper.readValue("", LeadForm.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadForm>(objectMapper.readValue("", LeadForm.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadForm>(objectMapper.readValue("", LeadForm.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadForm>(objectMapper.readValue("", LeadForm.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadForm>(objectMapper.readValue("", LeadForm.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadForm>(objectMapper.readValue("", LeadForm.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadForm>(objectMapper.readValue("", LeadForm.class), HttpStatus.OK);
        }

        return new ResponseEntity<LeadForm>(HttpStatus.OK);
    }

    public ResponseEntity<LeadFormTest> leadFormTestCreate(@ApiParam(value = "",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a lead form.",required=true ) @PathVariable("lead_form_id") String leadFormId,
        @ApiParam(value = "" ,required=true )   @RequestBody LeadFormTestCreate leadFormTestCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormTest>(objectMapper.readValue("", LeadFormTest.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormTest>(objectMapper.readValue("", LeadFormTest.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormTest>(objectMapper.readValue("", LeadFormTest.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormTest>(objectMapper.readValue("", LeadFormTest.class), HttpStatus.OK);
        }

        return new ResponseEntity<LeadFormTest>(HttpStatus.OK);
    }

    public ResponseEntity<LeadFormsCreate200Response> leadFormsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody List<LeadFormCreate> leadFormCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsCreate200Response>(objectMapper.readValue("", LeadFormsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsCreate200Response>(objectMapper.readValue("", LeadFormsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsCreate200Response>(objectMapper.readValue("", LeadFormsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsCreate200Response>(objectMapper.readValue("", LeadFormsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsCreate200Response>(objectMapper.readValue("", LeadFormsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsCreate200Response>(objectMapper.readValue("", LeadFormsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsCreate200Response>(objectMapper.readValue("", LeadFormsCreate200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<LeadFormsCreate200Response>(HttpStatus.OK);
    }

    public ResponseEntity<LeadFormsList200Response> leadFormsList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) PinterestLibPaginationOrder order,
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


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsList200Response>(objectMapper.readValue("", LeadFormsList200Response.class), HttpStatus.OK);
        }


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

    public ResponseEntity<LeadFormsCreate200Response> leadFormsUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody List<LeadFormBatchUpdate> leadFormBatchUpdate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsCreate200Response>(objectMapper.readValue("", LeadFormsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsCreate200Response>(objectMapper.readValue("", LeadFormsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsCreate200Response>(objectMapper.readValue("", LeadFormsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsCreate200Response>(objectMapper.readValue("", LeadFormsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsCreate200Response>(objectMapper.readValue("", LeadFormsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsCreate200Response>(objectMapper.readValue("", LeadFormsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadFormsCreate200Response>(objectMapper.readValue("", LeadFormsCreate200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<LeadFormsCreate200Response>(HttpStatus.OK);
    }

}
