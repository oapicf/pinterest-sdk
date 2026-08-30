package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CustomerList;
import com.prokarma.pkmst.model.CustomerListCreate;
import com.prokarma.pkmst.model.CustomerListUpdateWithRequiredBody;
import com.prokarma.pkmst.model.CustomerListsList200Response;
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
public class CustomerListsApiController implements CustomerListsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CustomerListsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<CustomerList> customerListsCreate(@ApiParam(value = "",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody CustomerListCreate customerListCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }

        return new ResponseEntity<CustomerList>(HttpStatus.OK);
    }

    public ResponseEntity<CustomerList> customerListsGet(@ApiParam(value = "",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Customer list ID.",required=true ) @PathVariable("customer_list_id") String customerListId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }

        return new ResponseEntity<CustomerList>(HttpStatus.OK);
    }

    public ResponseEntity<CustomerListsList200Response> customerListsList(@ApiParam(value = "",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) PinterestLibPaginationOrder order,
        @ApiParam(value = "When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).", defaultValue = "false")  @RequestParam(value = "exclude_nca", required = false, defaultValue="false") Boolean excludeNca,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListsList200Response>(objectMapper.readValue("", CustomerListsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListsList200Response>(objectMapper.readValue("", CustomerListsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListsList200Response>(objectMapper.readValue("", CustomerListsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListsList200Response>(objectMapper.readValue("", CustomerListsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListsList200Response>(objectMapper.readValue("", CustomerListsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListsList200Response>(objectMapper.readValue("", CustomerListsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerListsList200Response>(objectMapper.readValue("", CustomerListsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<CustomerListsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<CustomerList> customerListsUpdate(@ApiParam(value = "",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Customer list ID.",required=true ) @PathVariable("customer_list_id") String customerListId,
        @ApiParam(value = "" ,required=true )   @RequestBody CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CustomerList>(objectMapper.readValue("", CustomerList.class), HttpStatus.OK);
        }

        return new ResponseEntity<CustomerList>(HttpStatus.OK);
    }

}
