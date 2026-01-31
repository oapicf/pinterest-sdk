package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CatalogsItems;
import com.prokarma.pkmst.model.CatalogsItemsBatch;
import com.prokarma.pkmst.model.CatalogsItemsRequest;
import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.ItemsBatchPostRequest;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Controller
public class CatalogItemsApiController implements CatalogItemsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CatalogItemsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
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

}
