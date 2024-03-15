package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.OrderLine;
import com.prokarma.pkmst.model.OrderLinesList200Response;

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
public class OrderLinesApiController implements OrderLinesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public OrderLinesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<OrderLine> orderLinesGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of an order line.",required=true ) @PathVariable("order_line_id") String orderLineId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OrderLine>(objectMapper.readValue("", OrderLine.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OrderLine>(objectMapper.readValue("", OrderLine.class), HttpStatus.OK);
        }

        return new ResponseEntity<OrderLine>(HttpStatus.OK);
    }

    public ResponseEntity<OrderLinesList200Response> orderLinesList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) String order,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OrderLinesList200Response>(objectMapper.readValue("", OrderLinesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OrderLinesList200Response>(objectMapper.readValue("", OrderLinesList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<OrderLinesList200Response>(HttpStatus.OK);
    }

}
