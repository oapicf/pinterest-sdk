package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ConversionEventResponse;
import com.prokarma.pkmst.model.ConversionTagCreate;
import com.prokarma.pkmst.model.ConversionTagListResponse;
import com.prokarma.pkmst.model.ConversionTagResponse;
import com.prokarma.pkmst.model.Error;
import java.util.List;
import java.util.Map;
import com.prokarma.pkmst.model.PageVisitConversionTagsGet200Response;

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
public class ConversionTagsApiController implements ConversionTagsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ConversionTagsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<ConversionTagResponse> conversionTagsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Conversion Tag to create" ,required=true )   @RequestBody ConversionTagCreate conversionTagCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTagResponse>(objectMapper.readValue("", ConversionTagResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTagResponse>(objectMapper.readValue("", ConversionTagResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ConversionTagResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ConversionTagResponse> conversionTagsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Id of the conversion tag.",required=true ) @PathVariable("conversion_tag_id") String conversionTagId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTagResponse>(objectMapper.readValue("", ConversionTagResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTagResponse>(objectMapper.readValue("", ConversionTagResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ConversionTagResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ConversionTagListResponse> conversionTagsList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Filter out deleted tags.", defaultValue = "false")  @RequestParam(value = "filter_deleted", required = false, defaultValue="false") Boolean filterDeleted,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTagListResponse>(objectMapper.readValue("", ConversionTagListResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTagListResponse>(objectMapper.readValue("", ConversionTagListResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ConversionTagListResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Map<String, List<ConversionEventResponse>>> ocpmEligibleConversionTagsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, List<ConversionEventResponse>>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, List<ConversionEventResponse>>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }

        return new ResponseEntity<Map<String, List<ConversionEventResponse>>>(HttpStatus.OK);
    }

    public ResponseEntity<PageVisitConversionTagsGet200Response> pageVisitConversionTagsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) String order,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PageVisitConversionTagsGet200Response>(objectMapper.readValue("", PageVisitConversionTagsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PageVisitConversionTagsGet200Response>(objectMapper.readValue("", PageVisitConversionTagsGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<PageVisitConversionTagsGet200Response>(HttpStatus.OK);
    }

}
