package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CatalogsListProductsByFilterRequest;
import com.prokarma.pkmst.model.CatalogsProductGroupPinsList200Response;
import com.prokarma.pkmst.model.CatalogsProductGroupProductCountsVertical;
import com.prokarma.pkmst.model.CatalogsProductGroupsCreateManyRequestItems;
import com.prokarma.pkmst.model.CatalogsProductGroupsCreateRequestSchema;
import com.prokarma.pkmst.model.CatalogsProductGroupsList200Response;
import com.prokarma.pkmst.model.CatalogsProductGroupsUpdateRequestSchema;
import com.prokarma.pkmst.model.CatalogsVerticalProductGroup;
import java.util.List;
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
public class CatalogProductGroupsApiController implements CatalogProductGroupsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CatalogProductGroupsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<CatalogsProductGroupPinsList200Response> catalogsProductGroupPinsList(@ApiParam(value = "Unique identifier of a product group",required=true ) @PathVariable("product_group_id") String productGroupId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", defaultValue = "false")  @RequestParam(value = "pin_metrics", required = false, defaultValue="false") Boolean pinMetrics,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupPinsList200Response>(objectMapper.readValue("", CatalogsProductGroupPinsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupPinsList200Response>(objectMapper.readValue("", CatalogsProductGroupPinsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupPinsList200Response>(objectMapper.readValue("", CatalogsProductGroupPinsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupPinsList200Response>(objectMapper.readValue("", CatalogsProductGroupPinsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupPinsList200Response>(objectMapper.readValue("", CatalogsProductGroupPinsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupPinsList200Response>(objectMapper.readValue("", CatalogsProductGroupPinsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupPinsList200Response>(objectMapper.readValue("", CatalogsProductGroupPinsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsProductGroupPinsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsVerticalProductGroup> catalogsProductGroupsCreate(@ApiParam(value = "" ,required=true )   @RequestBody CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsVerticalProductGroup>(HttpStatus.OK);
    }

    public ResponseEntity<List<String>> catalogsProductGroupsCreateMany(@ApiParam(value = "" ,required=true )   @RequestBody List<CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<String>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<String>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<String>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<String>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<String>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<String>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<String>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<String>>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsVerticalProductGroup> catalogsProductGroupsDelete(@ApiParam(value = "Unique identifier of a product group",required=true ) @PathVariable("product_group_id") String productGroupId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsVerticalProductGroup>(HttpStatus.OK);
    }

    public ResponseEntity<Void> catalogsProductGroupsDeleteMany(@ApiParam(value = "Comma-separated list of product group ids", required = true)  @RequestParam(value = "id", required = true) List<Integer> id,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
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

    public ResponseEntity<CatalogsVerticalProductGroup> catalogsProductGroupsGet(@ApiParam(value = "Unique identifier of a product group",required=true ) @PathVariable("product_group_id") String productGroupId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsVerticalProductGroup>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsProductGroupsList200Response> catalogsProductGroupsList(@ApiParam(value = "Comma-separated list of product group ids")  @RequestParam(value = "id", required = false) List<Integer> id,
        @ApiParam(value = "Filter entities for a given feed_id. If not given, all feeds are considered.")  @RequestParam(value = "feed_id", required = false) String feedId,
        @ApiParam(value = "Filter entities for a given catalog_id. If not given, all catalogs are considered.")  @RequestParam(value = "catalog_id", required = false) String catalogId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupsList200Response>(objectMapper.readValue("", CatalogsProductGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupsList200Response>(objectMapper.readValue("", CatalogsProductGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupsList200Response>(objectMapper.readValue("", CatalogsProductGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupsList200Response>(objectMapper.readValue("", CatalogsProductGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupsList200Response>(objectMapper.readValue("", CatalogsProductGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupsList200Response>(objectMapper.readValue("", CatalogsProductGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupsList200Response>(objectMapper.readValue("", CatalogsProductGroupsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsProductGroupsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsProductGroupProductCountsVertical> catalogsProductGroupsProductCountsGet(@ApiParam(value = "Unique identifier of a product group",required=true ) @PathVariable("product_group_id") String productGroupId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupProductCountsVertical>(objectMapper.readValue("", CatalogsProductGroupProductCountsVertical.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupProductCountsVertical>(objectMapper.readValue("", CatalogsProductGroupProductCountsVertical.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupProductCountsVertical>(objectMapper.readValue("", CatalogsProductGroupProductCountsVertical.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupProductCountsVertical>(objectMapper.readValue("", CatalogsProductGroupProductCountsVertical.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupProductCountsVertical>(objectMapper.readValue("", CatalogsProductGroupProductCountsVertical.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupProductCountsVertical>(objectMapper.readValue("", CatalogsProductGroupProductCountsVertical.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupProductCountsVertical>(objectMapper.readValue("", CatalogsProductGroupProductCountsVertical.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsProductGroupProductCountsVertical>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsVerticalProductGroup> catalogsProductGroupsUpdate(@ApiParam(value = "Unique identifier of a product group",required=true ) @PathVariable("product_group_id") String productGroupId,
        @ApiParam(value = "" ,required=true )   @RequestBody CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsVerticalProductGroup>(objectMapper.readValue("", CatalogsVerticalProductGroup.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsVerticalProductGroup>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsProductGroupPinsList200Response> productsByProductGroupFilterList(@ApiParam(value = "" ,required=true )   @RequestBody CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", defaultValue = "false")  @RequestParam(value = "pin_metrics", required = false, defaultValue="false") Boolean pinMetrics,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupPinsList200Response>(objectMapper.readValue("", CatalogsProductGroupPinsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupPinsList200Response>(objectMapper.readValue("", CatalogsProductGroupPinsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupPinsList200Response>(objectMapper.readValue("", CatalogsProductGroupPinsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupPinsList200Response>(objectMapper.readValue("", CatalogsProductGroupPinsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupPinsList200Response>(objectMapper.readValue("", CatalogsProductGroupPinsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupPinsList200Response>(objectMapper.readValue("", CatalogsProductGroupPinsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroupPinsList200Response>(objectMapper.readValue("", CatalogsProductGroupPinsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsProductGroupPinsList200Response>(HttpStatus.OK);
    }

}
