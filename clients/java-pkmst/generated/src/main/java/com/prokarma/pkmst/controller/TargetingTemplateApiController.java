package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.TargetingTemplateCreate;
import com.prokarma.pkmst.model.TargetingTemplateGetResponseData;
import com.prokarma.pkmst.model.TargetingTemplateList200Response;
import com.prokarma.pkmst.model.TargetingTemplateUpdateRequest;

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
public class TargetingTemplateApiController implements TargetingTemplateApi {
    private final ObjectMapper objectMapper;
@Autowired
    public TargetingTemplateApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<TargetingTemplateGetResponseData> targetingTemplateCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "targeting template creation entity" ,required=true )   @RequestBody TargetingTemplateCreate targetingTemplateCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TargetingTemplateGetResponseData>(objectMapper.readValue("", TargetingTemplateGetResponseData.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TargetingTemplateGetResponseData>(objectMapper.readValue("", TargetingTemplateGetResponseData.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TargetingTemplateGetResponseData>(objectMapper.readValue("", TargetingTemplateGetResponseData.class), HttpStatus.OK);
        }

        return new ResponseEntity<TargetingTemplateGetResponseData>(HttpStatus.OK);
    }

    public ResponseEntity<TargetingTemplateList200Response> targetingTemplateList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) String order,
        @ApiParam(value = "Include audience sizing in result or not", defaultValue = "false")  @RequestParam(value = "include_sizing", required = false, defaultValue="false") Boolean includeSizing,
        @ApiParam(value = "Search keyword for targeting templates")  @RequestParam(value = "search_query", required = false) String searchQuery,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TargetingTemplateList200Response>(objectMapper.readValue("", TargetingTemplateList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TargetingTemplateList200Response>(objectMapper.readValue("", TargetingTemplateList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TargetingTemplateList200Response>(objectMapper.readValue("", TargetingTemplateList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<TargetingTemplateList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<Void> targetingTemplateUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Operation type and targeting template ID" ,required=true )   @RequestBody TargetingTemplateUpdateRequest targetingTemplateUpdateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
