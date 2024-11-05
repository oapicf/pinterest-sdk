package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AdvancedAuctionItems;
import com.prokarma.pkmst.model.AdvancedAuctionItemsGetRequest;
import com.prokarma.pkmst.model.AdvancedAuctionItemsSubmitRequest;
import com.prokarma.pkmst.model.AdvancedAuctionProcessedItems;
import com.prokarma.pkmst.model.Error;

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
public class AdvancedAuctionApiController implements AdvancedAuctionApi {
    private final ObjectMapper objectMapper;
@Autowired
    public AdvancedAuctionApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<AdvancedAuctionItems> advancedAuctionItemsGetPost(@ApiParam(value = "Request object used to get bid options values for a batch of retail catalog items" ,required=true )   @RequestBody AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdvancedAuctionItems>(objectMapper.readValue("", AdvancedAuctionItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdvancedAuctionItems>(objectMapper.readValue("", AdvancedAuctionItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdvancedAuctionItems>(objectMapper.readValue("", AdvancedAuctionItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdvancedAuctionItems>(objectMapper.readValue("", AdvancedAuctionItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdvancedAuctionItems>(objectMapper.readValue("", AdvancedAuctionItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdvancedAuctionItems>(objectMapper.readValue("", AdvancedAuctionItems.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdvancedAuctionItems>(HttpStatus.OK);
    }

    public ResponseEntity<AdvancedAuctionProcessedItems> advancedAuctionItemsSubmitPost(@ApiParam(value = "Request object used to upsert or delete bid options for a batch of retail catalog items" ,required=true )   @RequestBody AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdvancedAuctionProcessedItems>(objectMapper.readValue("", AdvancedAuctionProcessedItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdvancedAuctionProcessedItems>(objectMapper.readValue("", AdvancedAuctionProcessedItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdvancedAuctionProcessedItems>(objectMapper.readValue("", AdvancedAuctionProcessedItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdvancedAuctionProcessedItems>(objectMapper.readValue("", AdvancedAuctionProcessedItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdvancedAuctionProcessedItems>(objectMapper.readValue("", AdvancedAuctionProcessedItems.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdvancedAuctionProcessedItems>(objectMapper.readValue("", AdvancedAuctionProcessedItems.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdvancedAuctionProcessedItems>(HttpStatus.OK);
    }

}
