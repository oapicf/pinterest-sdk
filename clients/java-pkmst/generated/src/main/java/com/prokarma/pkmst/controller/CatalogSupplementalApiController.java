package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CatalogsLocalStoresCreate200ResponseInner;
import com.prokarma.pkmst.model.CatalogsLocalStoresDelete200ResponseInner;
import com.prokarma.pkmst.model.CatalogsLocalStoresList200Response;
import java.util.List;
import com.prokarma.pkmst.model.LocalInventoryItemsBatch;
import com.prokarma.pkmst.model.LocalInventoryItemsBatchCreate;
import com.prokarma.pkmst.model.LocalInventoryItemsGet;
import com.prokarma.pkmst.model.LocalInventoryItemsGetCreate;
import com.prokarma.pkmst.model.LocalStore;
import com.prokarma.pkmst.model.LocalStoreBatchUpdate;
import com.prokarma.pkmst.model.LocalStoreCreate;
import com.prokarma.pkmst.model.PinterestLibError;
import com.prokarma.pkmst.model.SupplementalItemsBatchResponse;

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
public class CatalogSupplementalApiController implements CatalogSupplementalApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CatalogSupplementalApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<SupplementalItemsBatchResponse> catalogsLocalInventoryItemsBatchOperate(@ApiParam(value = "Unique identifier of a catalog.",required=true ) @PathVariable("catalog_id") String catalogId,
        @ApiParam(value = "" ,required=true )   @RequestBody LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SupplementalItemsBatchResponse>(objectMapper.readValue("", SupplementalItemsBatchResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SupplementalItemsBatchResponse>(objectMapper.readValue("", SupplementalItemsBatchResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SupplementalItemsBatchResponse>(objectMapper.readValue("", SupplementalItemsBatchResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SupplementalItemsBatchResponse>(objectMapper.readValue("", SupplementalItemsBatchResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SupplementalItemsBatchResponse>(objectMapper.readValue("", SupplementalItemsBatchResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SupplementalItemsBatchResponse>(objectMapper.readValue("", SupplementalItemsBatchResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SupplementalItemsBatchResponse>(objectMapper.readValue("", SupplementalItemsBatchResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SupplementalItemsBatchResponse>(objectMapper.readValue("", SupplementalItemsBatchResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<SupplementalItemsBatchResponse>(HttpStatus.OK);
    }

    public ResponseEntity<LocalInventoryItemsGet> catalogsLocalInventoryItemsPost(@ApiParam(value = "Unique identifier of a catalog.",required=true ) @PathVariable("catalog_id") String catalogId,
        @ApiParam(value = "" ,required=true )   @RequestBody LocalInventoryItemsGetCreate localInventoryItemsGetCreate,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LocalInventoryItemsGet>(objectMapper.readValue("", LocalInventoryItemsGet.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LocalInventoryItemsGet>(objectMapper.readValue("", LocalInventoryItemsGet.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LocalInventoryItemsGet>(objectMapper.readValue("", LocalInventoryItemsGet.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LocalInventoryItemsGet>(objectMapper.readValue("", LocalInventoryItemsGet.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LocalInventoryItemsGet>(objectMapper.readValue("", LocalInventoryItemsGet.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LocalInventoryItemsGet>(objectMapper.readValue("", LocalInventoryItemsGet.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LocalInventoryItemsGet>(objectMapper.readValue("", LocalInventoryItemsGet.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LocalInventoryItemsGet>(objectMapper.readValue("", LocalInventoryItemsGet.class), HttpStatus.OK);
        }

        return new ResponseEntity<LocalInventoryItemsGet>(HttpStatus.OK);
    }

    public ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>> catalogsLocalStoresCreate(@ApiParam(value = "Unique identifier of a catalog.",required=true ) @PathVariable("catalog_id") String catalogId,
        @ApiParam(value = "" ,required=true )   @RequestBody List<LocalStoreCreate> localStoreCreate,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(HttpStatus.OK);
    }

    public ResponseEntity<List<CatalogsLocalStoresDelete200ResponseInner>> catalogsLocalStoresDelete(@ApiParam(value = "Unique identifier of a catalog.",required=true ) @PathVariable("catalog_id") String catalogId,
        @ApiParam(value = "List of local store IDs to filter by.", required = true)  @RequestParam(value = "ids", required = true) List<String> ids,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresDelete200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresDelete200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresDelete200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresDelete200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresDelete200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresDelete200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresDelete200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<CatalogsLocalStoresDelete200ResponseInner>>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsLocalStoresList200Response> catalogsLocalStoresList(@ApiParam(value = "Unique identifier of a catalog.",required=true ) @PathVariable("catalog_id") String catalogId,
        @ApiParam(value = "List of local store IDs to filter by.")  @RequestParam(value = "ids", required = false) List<String> ids,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsLocalStoresList200Response>(objectMapper.readValue("", CatalogsLocalStoresList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsLocalStoresList200Response>(objectMapper.readValue("", CatalogsLocalStoresList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsLocalStoresList200Response>(objectMapper.readValue("", CatalogsLocalStoresList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsLocalStoresList200Response>(objectMapper.readValue("", CatalogsLocalStoresList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsLocalStoresList200Response>(objectMapper.readValue("", CatalogsLocalStoresList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsLocalStoresList200Response>(objectMapper.readValue("", CatalogsLocalStoresList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsLocalStoresList200Response>(objectMapper.readValue("", CatalogsLocalStoresList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsLocalStoresList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>> catalogsLocalStoresUpdate(@ApiParam(value = "Unique identifier of a catalog.",required=true ) @PathVariable("catalog_id") String catalogId,
        @ApiParam(value = "" ,required=true )   @RequestBody List<LocalStoreBatchUpdate> localStoreBatchUpdate,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>>(HttpStatus.OK);
    }

    public ResponseEntity<SupplementalItemsBatchResponse> catalogsSupplementalItemsBatchGet(@ApiParam(value = "Unique identifier of a catalog.",required=true ) @PathVariable("catalog_id") String catalogId,
        @ApiParam(value = "Unique identifier of an items batch operation.",required=true ) @PathVariable("batch_id") String batchId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SupplementalItemsBatchResponse>(objectMapper.readValue("", SupplementalItemsBatchResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SupplementalItemsBatchResponse>(objectMapper.readValue("", SupplementalItemsBatchResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SupplementalItemsBatchResponse>(objectMapper.readValue("", SupplementalItemsBatchResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SupplementalItemsBatchResponse>(objectMapper.readValue("", SupplementalItemsBatchResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SupplementalItemsBatchResponse>(objectMapper.readValue("", SupplementalItemsBatchResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SupplementalItemsBatchResponse>(objectMapper.readValue("", SupplementalItemsBatchResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SupplementalItemsBatchResponse>(objectMapper.readValue("", SupplementalItemsBatchResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<SupplementalItemsBatchResponse>(HttpStatus.OK);
    }

}
