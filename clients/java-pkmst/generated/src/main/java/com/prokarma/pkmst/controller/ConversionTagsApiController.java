package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ConversionEventResponse;
import com.prokarma.pkmst.model.ConversionTag;
import com.prokarma.pkmst.model.ConversionTagCreate;
import com.prokarma.pkmst.model.ConversionTagsList200Response;
import java.util.List;
import java.util.Map;
import com.prokarma.pkmst.model.PageVisitConversionTagsGet200Response;
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
public class ConversionTagsApiController implements ConversionTagsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ConversionTagsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<ConversionTag> conversionTagsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody ConversionTagCreate conversionTagCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTag>(objectMapper.readValue("", ConversionTag.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTag>(objectMapper.readValue("", ConversionTag.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTag>(objectMapper.readValue("", ConversionTag.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTag>(objectMapper.readValue("", ConversionTag.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTag>(objectMapper.readValue("", ConversionTag.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTag>(objectMapper.readValue("", ConversionTag.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTag>(objectMapper.readValue("", ConversionTag.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTag>(objectMapper.readValue("", ConversionTag.class), HttpStatus.OK);
        }

        return new ResponseEntity<ConversionTag>(HttpStatus.OK);
    }

    public ResponseEntity<ConversionTag> conversionTagsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Id of the conversion tag.",required=true ) @PathVariable("conversion_tag_id") String conversionTagId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTag>(objectMapper.readValue("", ConversionTag.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTag>(objectMapper.readValue("", ConversionTag.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTag>(objectMapper.readValue("", ConversionTag.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTag>(objectMapper.readValue("", ConversionTag.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTag>(objectMapper.readValue("", ConversionTag.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTag>(objectMapper.readValue("", ConversionTag.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTag>(objectMapper.readValue("", ConversionTag.class), HttpStatus.OK);
        }

        return new ResponseEntity<ConversionTag>(HttpStatus.OK);
    }

    public ResponseEntity<ConversionTagsList200Response> conversionTagsList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Filter by deleted status", defaultValue = "false")  @RequestParam(value = "filter_deleted", required = false, defaultValue="false") Boolean filterDeleted,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTagsList200Response>(objectMapper.readValue("", ConversionTagsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTagsList200Response>(objectMapper.readValue("", ConversionTagsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTagsList200Response>(objectMapper.readValue("", ConversionTagsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTagsList200Response>(objectMapper.readValue("", ConversionTagsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTagsList200Response>(objectMapper.readValue("", ConversionTagsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTagsList200Response>(objectMapper.readValue("", ConversionTagsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionTagsList200Response>(objectMapper.readValue("", ConversionTagsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<ConversionTagsList200Response>(HttpStatus.OK);
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


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, List<ConversionEventResponse>>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, List<ConversionEventResponse>>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, List<ConversionEventResponse>>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, List<ConversionEventResponse>>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, List<ConversionEventResponse>>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }

        return new ResponseEntity<Map<String, List<ConversionEventResponse>>>(HttpStatus.OK);
    }

    public ResponseEntity<PageVisitConversionTagsGet200Response> pageVisitConversionTagsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) PinterestLibPaginationOrder order,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PageVisitConversionTagsGet200Response>(objectMapper.readValue("", PageVisitConversionTagsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PageVisitConversionTagsGet200Response>(objectMapper.readValue("", PageVisitConversionTagsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PageVisitConversionTagsGet200Response>(objectMapper.readValue("", PageVisitConversionTagsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PageVisitConversionTagsGet200Response>(objectMapper.readValue("", PageVisitConversionTagsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PageVisitConversionTagsGet200Response>(objectMapper.readValue("", PageVisitConversionTagsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PageVisitConversionTagsGet200Response>(objectMapper.readValue("", PageVisitConversionTagsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PageVisitConversionTagsGet200Response>(objectMapper.readValue("", PageVisitConversionTagsGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<PageVisitConversionTagsGet200Response>(HttpStatus.OK);
    }

}
