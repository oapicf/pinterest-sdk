package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CustomerList;
import com.prokarma.pkmst.model.CustomerListRequest;
import com.prokarma.pkmst.model.CustomerListUpdateRequest;
import com.prokarma.pkmst.model.CustomerListsList200Response;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Controller
public class CustomerListsApiController implements CustomerListsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CustomerListsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<CustomerList> customerListsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Parameters to get Customer lists info" ,required=true )   @RequestBody CustomerListRequest customerListRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }

        return new ResponseEntity<CustomerList>(HttpStatus.OK);
    }

    public ResponseEntity<CustomerList> customerListsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a customer list",required=true ) @PathVariable("customer_list_id") String customerListId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }

        return new ResponseEntity<CustomerList>(HttpStatus.OK);
    }

    public ResponseEntity<CustomerListsList200Response> customerListsList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) String order,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListsList200Response>(objectMapper.readValue("", CustomerListsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListsList200Response>(objectMapper.readValue("", CustomerListsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<CustomerListsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<CustomerList> customerListsUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a customer list",required=true ) @PathVariable("customer_list_id") String customerListId,
        @ApiParam(value = "" ,required=true )   @RequestBody CustomerListUpdateRequest customerListUpdateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }

        return new ResponseEntity<CustomerList>(HttpStatus.OK);
    }

}
