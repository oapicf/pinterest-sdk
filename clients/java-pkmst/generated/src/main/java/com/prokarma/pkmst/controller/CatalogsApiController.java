package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Catalog;
import com.prokarma.pkmst.model.CatalogsCreateReportResponse;
import com.prokarma.pkmst.model.CatalogsCreateRequest;
import com.prokarma.pkmst.model.CatalogsFeed;
import com.prokarma.pkmst.model.CatalogsFeedIngestion;
import com.prokarma.pkmst.model.CatalogsItemValidationIssue;
import com.prokarma.pkmst.model.CatalogsItems;
import com.prokarma.pkmst.model.CatalogsItemsBatch;
import com.prokarma.pkmst.model.CatalogsItemsFilters;
import com.prokarma.pkmst.model.CatalogsItemsRequest;
import com.prokarma.pkmst.model.CatalogsList200Response;
import com.prokarma.pkmst.model.CatalogsListProductsByFilterRequest;
import com.prokarma.pkmst.model.CatalogsProductGroupPinsList200Response;
import com.prokarma.pkmst.model.CatalogsProductGroupProductCountsVertical;
import com.prokarma.pkmst.model.CatalogsProductGroupsList200Response;
import com.prokarma.pkmst.model.CatalogsProductGroupsUpdateRequest;
import com.prokarma.pkmst.model.CatalogsReport;
import com.prokarma.pkmst.model.CatalogsReportParameters;
import com.prokarma.pkmst.model.CatalogsVerticalProductGroup;
import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.FeedProcessingResultsList200Response;
import com.prokarma.pkmst.model.FeedsCreateRequest;
import com.prokarma.pkmst.model.FeedsList200Response;
import com.prokarma.pkmst.model.FeedsUpdateRequest;
import com.prokarma.pkmst.model.ItemsBatchPostRequest;
import com.prokarma.pkmst.model.ItemsIssuesList200Response;
import java.util.List;
import com.prokarma.pkmst.model.MultipleProductGroupsInner;
import com.prokarma.pkmst.model.ReportsStats200Response;

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
public class CatalogsApiController implements CatalogsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CatalogsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Catalog> catalogsCreate(@ApiParam(value = "Request object used to created a feed." ,required=true )   @RequestBody CatalogsCreateRequest catalogsCreateRequest,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Catalog>(objectMapper.readValue("", Catalog.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Catalog>(objectMapper.readValue("", Catalog.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Catalog>(objectMapper.readValue("", Catalog.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Catalog>(objectMapper.readValue("", Catalog.class), HttpStatus.OK);
        }

        return new ResponseEntity<Catalog>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsList200Response> catalogsList(@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsList200Response>(objectMapper.readValue("", CatalogsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsList200Response>(objectMapper.readValue("", CatalogsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsList200Response>(objectMapper.readValue("", CatalogsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsList200Response>(objectMapper.readValue("", CatalogsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsProductGroupPinsList200Response> catalogsProductGroupPinsList(@ApiParam(value = "Unique identifier of a product group",required=true ) @PathVariable("product_group_id") String productGroupId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", defaultValue = "false")  @RequestParam(value = "pin_metrics", required = false, defaultValue="false") Boolean pinMetrics,
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

        return new ResponseEntity<CatalogsProductGroupPinsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsVerticalProductGroup> catalogsProductGroupsCreate(@ApiParam(value = "Request object used to create a single catalogs product groups." ,required=true )   @RequestBody MultipleProductGroupsInner multipleProductGroupsInner,
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

        return new ResponseEntity<CatalogsVerticalProductGroup>(HttpStatus.OK);
    }

    public ResponseEntity<List<String>> catalogsProductGroupsCreateMany(@ApiParam(value = "Request object used to create one or more catalogs product groups." ,required=true )   @RequestBody List<MultipleProductGroupsInner> multipleProductGroupsInner,
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

        return new ResponseEntity<List<String>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> catalogsProductGroupsDelete(@ApiParam(value = "Unique identifier of a product group",required=true ) @PathVariable("product_group_id") String productGroupId,
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
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
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

        return new ResponseEntity<CatalogsProductGroupProductCountsVertical>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsVerticalProductGroup> catalogsProductGroupsUpdate(@ApiParam(value = "Unique identifier of a product group",required=true ) @PathVariable("product_group_id") String productGroupId,
        @ApiParam(value = "Request object used to Update a catalogs product group." ,required=true )   @RequestBody CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest,
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

    public ResponseEntity<FeedProcessingResultsList200Response> feedProcessingResultsList(@ApiParam(value = "Unique identifier of a feed",required=true ) @PathVariable("feed_id") String feedId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedProcessingResultsList200Response>(objectMapper.readValue("", FeedProcessingResultsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedProcessingResultsList200Response>(objectMapper.readValue("", FeedProcessingResultsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedProcessingResultsList200Response>(objectMapper.readValue("", FeedProcessingResultsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedProcessingResultsList200Response>(objectMapper.readValue("", FeedProcessingResultsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedProcessingResultsList200Response>(objectMapper.readValue("", FeedProcessingResultsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<FeedProcessingResultsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsFeed> feedsCreate(@ApiParam(value = "Request object used to created a feed." ,required=true )   @RequestBody FeedsCreateRequest feedsCreateRequest,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsFeed>(HttpStatus.OK);
    }

    public ResponseEntity<Void> feedsDelete(@ApiParam(value = "Unique identifier of a feed",required=true ) @PathVariable("feed_id") String feedId,
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

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsFeed> feedsGet(@ApiParam(value = "Unique identifier of a feed",required=true ) @PathVariable("feed_id") String feedId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsFeed>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsFeedIngestion> feedsIngest(@ApiParam(value = "Unique identifier of a feed",required=true ) @PathVariable("feed_id") String feedId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeedIngestion>(objectMapper.readValue("", CatalogsFeedIngestion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeedIngestion>(objectMapper.readValue("", CatalogsFeedIngestion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeedIngestion>(objectMapper.readValue("", CatalogsFeedIngestion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeedIngestion>(objectMapper.readValue("", CatalogsFeedIngestion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeedIngestion>(objectMapper.readValue("", CatalogsFeedIngestion.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsFeedIngestion>(HttpStatus.OK);
    }

    public ResponseEntity<FeedsList200Response> feedsList(@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Filter entities for a given catalog_id. If not given, all catalogs are considered.")  @RequestParam(value = "catalog_id", required = false) String catalogId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedsList200Response>(objectMapper.readValue("", FeedsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedsList200Response>(objectMapper.readValue("", FeedsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedsList200Response>(objectMapper.readValue("", FeedsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedsList200Response>(objectMapper.readValue("", FeedsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<FeedsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsFeed> feedsUpdate(@ApiParam(value = "Unique identifier of a feed",required=true ) @PathVariable("feed_id") String feedId,
        @ApiParam(value = "Request object used to update a feed." ,required=true )   @RequestBody FeedsUpdateRequest feedsUpdateRequest,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsFeed>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsItemsBatch> itemsBatchGet(@ApiParam(value = "Id of a catalogs items batch to fetch",required=true ) @PathVariable("batch_id") String batchId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItemsBatch>(objectMapper.readValue("", CatalogsItemsBatch.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItemsBatch>(objectMapper.readValue("", CatalogsItemsBatch.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItemsBatch>(objectMapper.readValue("", CatalogsItemsBatch.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItemsBatch>(objectMapper.readValue("", CatalogsItemsBatch.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItemsBatch>(objectMapper.readValue("", CatalogsItemsBatch.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItemsBatch>(objectMapper.readValue("", CatalogsItemsBatch.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsItemsBatch>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsItemsBatch> itemsBatchPost(@ApiParam(value = "Request object used to create catalogs items in a batch" ,required=true )   @RequestBody ItemsBatchPostRequest itemsBatchPostRequest,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItemsBatch>(objectMapper.readValue("", CatalogsItemsBatch.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItemsBatch>(objectMapper.readValue("", CatalogsItemsBatch.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItemsBatch>(objectMapper.readValue("", CatalogsItemsBatch.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItemsBatch>(objectMapper.readValue("", CatalogsItemsBatch.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItemsBatch>(objectMapper.readValue("", CatalogsItemsBatch.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsItemsBatch>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsItems> itemsGet(@ApiParam(value = "Country for the Catalogs Items", required = true)  @RequestParam(value = "country", required = true) String country,
        @ApiParam(value = "Language for the Catalogs Items", required = true)  @RequestParam(value = "language", required = true) String language,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "This parameter is deprecated. Use filters instead.")  @RequestParam(value = "item_ids", required = false) List<String> itemIds,
        @ApiParam(value = "Identifies items to be retrieved. This is a required parameter.")  @RequestParam(value = "filters", required = false) CatalogsItemsFilters filters,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItems>(objectMapper.readValue("", CatalogsItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItems>(objectMapper.readValue("", CatalogsItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItems>(objectMapper.readValue("", CatalogsItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItems>(objectMapper.readValue("", CatalogsItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItems>(objectMapper.readValue("", CatalogsItems.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsItems>(HttpStatus.OK);
    }

    public ResponseEntity<ItemsIssuesList200Response> itemsIssuesList(@ApiParam(value = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).",required=true ) @PathVariable("processing_result_id") String processingResultId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.")  @RequestParam(value = "item_numbers", required = false) List<Integer> itemNumbers,
        @ApiParam(value = "Filter item validation issues that have a given type of item validation issue.", allowableValues = "AD_LINK_FORMAT_WARNING, AD_LINK_SAME_AS_LINK, ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, ADDITIONAL_IMAGE_LINK_WARNING, ADULT_INVALID, ADWORDS_FORMAT_INVALID, ADWORDS_FORMAT_WARNING, ADWORDS_SAME_AS_LINK, AGE_GROUP_INVALID, ANDROID_DEEP_LINK_INVALID, AVAILABILITY_DATE_INVALID, AVAILABILITY_INVALID, BLOCKLISTED_IMAGE_SIGNATURE, COUNTRY_DOES_NOT_MAP_TO_CURRENCY, CUSTOM_LABEL_LENGTH_TOO_LONG, DESCRIPTION_LENGTH_TOO_LONG, DESCRIPTION_MISSING, DUPLICATE_PRODUCTS, EXPIRATION_DATE_INVALID, GENDER_INVALID, GTIN_INVALID, IMAGE_LINK_INVALID, IMAGE_LINK_LENGTH_TOO_LONG, IMAGE_LINK_MISSING, IMAGE_LINK_WARNING, INVALID_DOMAIN, IOS_DEEP_LINK_INVALID, IS_BUNDLE_INVALID, ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, ITEMID_MISSING, LINK_FORMAT_INVALID, LINK_FORMAT_WARNING, LINK_LENGTH_TOO_LONG, LIST_PRICE_INVALID, MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, MIN_AD_PRICE_INVALID, MPN_INVALID, MULTIPACK_INVALID, OPTIONAL_CONDITION_INVALID, OPTIONAL_CONDITION_MISSING, OPTIONAL_PRODUCT_CATEGORY_INVALID, OPTIONAL_PRODUCT_CATEGORY_MISSING, PARSE_LINE_ERROR, PINJOIN_CONTENT_UNSAFE, PRICE_CANNOT_BE_DETERMINED, PRICE_MISSING, PRODUCT_CATEGORY_DEPTH_WARNING, PRODUCT_LINK_MISSING, PRODUCT_PRICE_INVALID, PRODUCT_TYPE_LENGTH_TOO_LONG, SALE_DATE_INVALID, SALES_PRICE_INVALID, SALES_PRICE_TOO_HIGH, SALES_PRICE_TOO_LOW, SHIPPING_INVALID, SHIPPING_HEIGHT_INVALID, SHIPPING_WEIGHT_INVALID, SHIPPING_WIDTH_INVALID, SIZE_SYSTEM_INVALID, SIZE_TYPE_INVALID, TAX_INVALID, TITLE_LENGTH_TOO_LONG, TITLE_MISSING, TOO_MANY_ADDITIONAL_IMAGE_LINKS, UTM_SOURCE_AUTO_CORRECTED, WEIGHT_UNIT_INVALID")  @RequestParam(value = "item_validation_issue", required = false) CatalogsItemValidationIssue itemValidationIssue,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemsIssuesList200Response>(objectMapper.readValue("", ItemsIssuesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemsIssuesList200Response>(objectMapper.readValue("", ItemsIssuesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemsIssuesList200Response>(objectMapper.readValue("", ItemsIssuesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemsIssuesList200Response>(objectMapper.readValue("", ItemsIssuesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemsIssuesList200Response>(objectMapper.readValue("", ItemsIssuesList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<ItemsIssuesList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsItems> itemsPost(@ApiParam(value = "Request object used to get catalogs items" ,required=true )   @RequestBody CatalogsItemsRequest catalogsItemsRequest,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItems>(objectMapper.readValue("", CatalogsItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItems>(objectMapper.readValue("", CatalogsItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItems>(objectMapper.readValue("", CatalogsItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItems>(objectMapper.readValue("", CatalogsItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItems>(objectMapper.readValue("", CatalogsItems.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsItems>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsProductGroupPinsList200Response> productsByProductGroupFilterList(@ApiParam(value = "Object holding a group of filters for a catalog product group" ,required=true )   @RequestBody CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", defaultValue = "false")  @RequestParam(value = "pin_metrics", required = false, defaultValue="false") Boolean pinMetrics,
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

        return new ResponseEntity<CatalogsProductGroupPinsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsCreateReportResponse> reportsCreate(@ApiParam(value = "Request object to asynchronously create a report." ,required=true )   @RequestBody CatalogsReportParameters catalogsReportParameters,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsCreateReportResponse>(objectMapper.readValue("", CatalogsCreateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsCreateReportResponse>(objectMapper.readValue("", CatalogsCreateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsCreateReportResponse>(objectMapper.readValue("", CatalogsCreateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsCreateReportResponse>(objectMapper.readValue("", CatalogsCreateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsCreateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsReport> reportsGet(@ApiParam(value = "Token returned from async build report call", required = true)  @RequestParam(value = "token", required = true) String token,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsReport>(objectMapper.readValue("", CatalogsReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsReport>(objectMapper.readValue("", CatalogsReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsReport>(objectMapper.readValue("", CatalogsReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsReport>(objectMapper.readValue("", CatalogsReport.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsReport>(HttpStatus.OK);
    }

    public ResponseEntity<ReportsStats200Response> reportsStats(@ApiParam(value = "Contains the parameters for report identification.", required = true)  @RequestParam(value = "parameters", required = true) CatalogsReportParameters parameters,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ReportsStats200Response>(objectMapper.readValue("", ReportsStats200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ReportsStats200Response>(objectMapper.readValue("", ReportsStats200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ReportsStats200Response>(objectMapper.readValue("", ReportsStats200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<ReportsStats200Response>(HttpStatus.OK);
    }

}
