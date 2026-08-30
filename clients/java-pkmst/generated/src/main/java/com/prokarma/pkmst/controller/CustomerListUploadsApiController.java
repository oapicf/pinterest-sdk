package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CustomerListUpload;
import com.prokarma.pkmst.model.CustomerListUploadCreateRequest;
import com.prokarma.pkmst.model.CustomerListUploadCreateResponse;
import com.prokarma.pkmst.model.PinterestLibError;

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
public class CustomerListUploadsApiController implements CustomerListUploadsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CustomerListUploadsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<CustomerListUploadCreateResponse> customerListUploadsCreate(@ApiParam(value = "",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Customer list ID.",required=true ) @PathVariable("customer_list_id") String customerListId,
        @ApiParam(value = "" ,required=true )   @RequestBody CustomerListUploadCreateRequest customerListUploadCreateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUploadCreateResponse>(objectMapper.readValue("", CustomerListUploadCreateResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUploadCreateResponse>(objectMapper.readValue("", CustomerListUploadCreateResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUploadCreateResponse>(objectMapper.readValue("", CustomerListUploadCreateResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUploadCreateResponse>(objectMapper.readValue("", CustomerListUploadCreateResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUploadCreateResponse>(objectMapper.readValue("", CustomerListUploadCreateResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUploadCreateResponse>(objectMapper.readValue("", CustomerListUploadCreateResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUploadCreateResponse>(objectMapper.readValue("", CustomerListUploadCreateResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CustomerListUploadCreateResponse>(HttpStatus.OK);
    }

    public ResponseEntity<CustomerListUpload> customerListUploadsGet(@ApiParam(value = "",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Customer list ID.",required=true ) @PathVariable("customer_list_id") String customerListId,
        @ApiParam(value = "Customer List Upload ID.",required=true ) @PathVariable("customer_list_upload_id") String customerListUploadId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUpload>(objectMapper.readValue("", CustomerListUpload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUpload>(objectMapper.readValue("", CustomerListUpload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUpload>(objectMapper.readValue("", CustomerListUpload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUpload>(objectMapper.readValue("", CustomerListUpload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUpload>(objectMapper.readValue("", CustomerListUpload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUpload>(objectMapper.readValue("", CustomerListUpload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUpload>(objectMapper.readValue("", CustomerListUpload.class), HttpStatus.OK);
        }

        return new ResponseEntity<CustomerListUpload>(HttpStatus.OK);
    }

    public ResponseEntity<CustomerListUpload> customerListUploadsRun(@ApiParam(value = "",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Customer list ID.",required=true ) @PathVariable("customer_list_id") String customerListId,
        @ApiParam(value = "Customer List Upload ID.",required=true ) @PathVariable("customer_list_upload_id") String customerListUploadId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUpload>(objectMapper.readValue("", CustomerListUpload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUpload>(objectMapper.readValue("", CustomerListUpload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUpload>(objectMapper.readValue("", CustomerListUpload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUpload>(objectMapper.readValue("", CustomerListUpload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUpload>(objectMapper.readValue("", CustomerListUpload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUpload>(objectMapper.readValue("", CustomerListUpload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListUpload>(objectMapper.readValue("", CustomerListUpload.class), HttpStatus.OK);
        }

        return new ResponseEntity<CustomerListUpload>(HttpStatus.OK);
    }

}
