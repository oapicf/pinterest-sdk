package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.PinterestLibError;
import com.prokarma.pkmst.model.PinterestLibPaginationOrder;
import com.prokarma.pkmst.model.TargetingTemplate;
import com.prokarma.pkmst.model.TargetingTemplateCreate;
import com.prokarma.pkmst.model.TargetingTemplateList200Response;
import com.prokarma.pkmst.model.TargetingTemplateUpdateRequestReadOrUpdate;

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
public class TargetingTemplateApiController implements TargetingTemplateApi {
    private final ObjectMapper objectMapper;
@Autowired
    public TargetingTemplateApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<TargetingTemplate> targetingTemplateCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody TargetingTemplateCreate targetingTemplateCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TargetingTemplate>(objectMapper.readValue("", TargetingTemplate.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TargetingTemplate>(objectMapper.readValue("", TargetingTemplate.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TargetingTemplate>(objectMapper.readValue("", TargetingTemplate.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TargetingTemplate>(objectMapper.readValue("", TargetingTemplate.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TargetingTemplate>(objectMapper.readValue("", TargetingTemplate.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TargetingTemplate>(objectMapper.readValue("", TargetingTemplate.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TargetingTemplate>(objectMapper.readValue("", TargetingTemplate.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TargetingTemplate>(objectMapper.readValue("", TargetingTemplate.class), HttpStatus.OK);
        }

        return new ResponseEntity<TargetingTemplate>(HttpStatus.OK);
    }

    public ResponseEntity<TargetingTemplateList200Response> targetingTemplateList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) PinterestLibPaginationOrder order,
        @ApiParam(value = "Include audience sizing in result or not", defaultValue = "false")  @RequestParam(value = "include_sizing", required = false, defaultValue="false") Boolean includeSizing,
        @ApiParam(value = "Search query. Can contain pin description keywords or comma-separated pin IDs.")  @RequestParam(value = "search_query", required = false) String searchQuery,
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


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TargetingTemplateList200Response>(objectMapper.readValue("", TargetingTemplateList200Response.class), HttpStatus.OK);
        }


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
        @ApiParam(value = "" ,required=true )   @RequestBody TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
