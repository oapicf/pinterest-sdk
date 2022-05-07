package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CatalogsFeed;
import com.prokarma.pkmst.model.CatalogsFeedsCreateRequest;
import com.prokarma.pkmst.model.CatalogsFeedsUpdateRequest;
import com.prokarma.pkmst.model.CatalogsItems;
import com.prokarma.pkmst.model.CatalogsItemsBatch;
import com.prokarma.pkmst.model.CatalogsItemsBatchRequest;
import com.prokarma.pkmst.model.CatalogsProductGroup;
import com.prokarma.pkmst.model.CatalogsProductGroupCreateRequest;
import com.prokarma.pkmst.model.CatalogsProductGroupUpdateRequest;
import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.Paginated;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-05-07T06:39:36.253940Z[Etc/UTC]")
@Controller
public class CatalogsApiController implements CatalogsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CatalogsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Object> catalogsProductGroupsCreate(@ApiParam(value = "Request object used to created a catalogs product group." ,required=true )   @RequestBody CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> catalogsProductGroupsDelete(@ApiParam(value = "Unique identifier of a product group",required=true ) @PathVariable("product_group_id") String productGroupId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Paginated> catalogsProductGroupsList(@ApiParam(value = "Unique identifier of a feed", required = true)  @RequestParam(value = "feed_id", required = true) String feedId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Paginated>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsProductGroup> catalogsProductGroupsUpdate(@ApiParam(value = "Unique identifier of a product group",required=true ) @PathVariable("product_group_id") String productGroupId,
        @ApiParam(value = "Request object used to Update a catalogs product group." ,required=true )   @RequestBody CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsProductGroup>(objectMapper.readValue("", CatalogsProductGroup.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsProductGroup>(HttpStatus.OK);
    }

    public ResponseEntity<Paginated> feedProcessingResultsList(@ApiParam(value = "Unique identifier of a feed",required=true ) @PathVariable("feed_id") String feedId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Paginated>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsFeed> feedsCreate(@ApiParam(value = "Request object used to created a feed." ,required=true )   @RequestBody CatalogsFeedsCreateRequest catalogsFeedsCreateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsFeed>(HttpStatus.OK);
    }

    public ResponseEntity<Void> feedsDelete(@ApiParam(value = "Unique identifier of a feed",required=true ) @PathVariable("feed_id") String feedId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsFeed> feedsGet(@ApiParam(value = "Unique identifier of a feed",required=true ) @PathVariable("feed_id") String feedId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsFeed>(HttpStatus.OK);
    }

    public ResponseEntity<Paginated> feedsList(@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Paginated>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsFeed> feedsUpdate(@ApiParam(value = "Unique identifier of a feed",required=true ) @PathVariable("feed_id") String feedId,
        @ApiParam(value = "Request object used to update a feed." ,required=true )   @RequestBody CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsFeed>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsItemsBatch> itemsBatchGet(@ApiParam(value = "Id of a catalogs items batch to fetch",required=true ) @PathVariable("batch_id") String batchId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItemsBatch>(objectMapper.readValue("", CatalogsItemsBatch.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsItemsBatch>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsItemsBatch> itemsBatchPost(@ApiParam(value = "Request object used to create catalogs items in a batch" ,required=true )   @RequestBody CatalogsItemsBatchRequest catalogsItemsBatchRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItemsBatch>(objectMapper.readValue("", CatalogsItemsBatch.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsItemsBatch>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsItems> itemsGet(@ApiParam(value = "Country for the Catalogs Items", required = true)  @RequestParam(value = "country", required = true) String country,
        @ApiParam(value = "Catalos Item ids", required = true)  @RequestParam(value = "item_ids", required = true) List<String> itemIds,
        @ApiParam(value = "Language for the Catalogs Items", required = true)  @RequestParam(value = "language", required = true) String language,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsItems>(objectMapper.readValue("", CatalogsItems.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsItems>(HttpStatus.OK);
    }

}
