package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CustomerListUploadCreateRequest;
import com.prokarma.pkmst.model.CustomerListUploadCreateResponse;
import com.prokarma.pkmst.model.CustomerListUploadResponse;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Controller
public class CustomerListUploadsApiController implements CustomerListUploadsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CustomerListUploadsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<CustomerListUploadCreateResponse> customerListUploadsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a customer list",required=true ) @PathVariable("customer_list_id") String customerListId,
        @ApiParam(value = "Parameters to create a customer list upload request" ,required=true )   @RequestBody CustomerListUploadCreateRequest customerListUploadCreateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUploadCreateResponse>(objectMapper.readValue("", CustomerListUploadCreateResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUploadCreateResponse>(objectMapper.readValue("", CustomerListUploadCreateResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CustomerListUploadCreateResponse>(HttpStatus.OK);
    }

    public ResponseEntity<CustomerListUploadResponse> customerListUploadsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a customer list",required=true ) @PathVariable("customer_list_id") String customerListId,
        @ApiParam(value = "Unique identifier of a customer list upload",required=true ) @PathVariable("customer_list_upload_id") String customerListUploadId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUploadResponse>(objectMapper.readValue("", CustomerListUploadResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUploadResponse>(objectMapper.readValue("", CustomerListUploadResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CustomerListUploadResponse>(HttpStatus.OK);
    }

    public ResponseEntity<CustomerListUploadResponse> customerListUploadsRun(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a customer list",required=true ) @PathVariable("customer_list_id") String customerListId,
        @ApiParam(value = "Unique identifier of a customer list upload",required=true ) @PathVariable("customer_list_upload_id") String customerListUploadId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUploadResponse>(objectMapper.readValue("", CustomerListUploadResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUploadResponse>(objectMapper.readValue("", CustomerListUploadResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CustomerListUploadResponse>(HttpStatus.OK);
    }

}
