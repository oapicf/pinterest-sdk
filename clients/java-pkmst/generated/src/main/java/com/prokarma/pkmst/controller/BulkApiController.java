package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.BulkDownloadRequest;
import com.prokarma.pkmst.model.BulkDownloadResponse;
import com.prokarma.pkmst.model.BulkUpsertRequest;
import com.prokarma.pkmst.model.BulkUpsertResponse;
import com.prokarma.pkmst.model.BulkUpsertStatusResponse;
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
public class BulkApiController implements BulkApi {
    private final ObjectMapper objectMapper;
@Autowired
    public BulkApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<BulkDownloadResponse> bulkDownloadCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Parameters to get ad entities in bulk" ,required=true )   @RequestBody BulkDownloadRequest bulkDownloadRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkDownloadResponse>(objectMapper.readValue("", BulkDownloadResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkDownloadResponse>(objectMapper.readValue("", BulkDownloadResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<BulkDownloadResponse>(HttpStatus.OK);
    }

    public ResponseEntity<BulkUpsertStatusResponse> bulkRequestGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a bulk upsert request.",required=true ) @PathVariable("bulk_request_id") String bulkRequestId,
        @ApiParam(value = "if set to True then attach the errors/details to all the requests", defaultValue = "false")  @RequestParam(value = "include_details", required = false, defaultValue="false") Boolean includeDetails,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkUpsertStatusResponse>(objectMapper.readValue("", BulkUpsertStatusResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkUpsertStatusResponse>(objectMapper.readValue("", BulkUpsertStatusResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<BulkUpsertStatusResponse>(HttpStatus.OK);
    }

    public ResponseEntity<BulkUpsertResponse> bulkUpsertCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Parameters to get create/update ad entities in bulk" ,required=true )   @RequestBody BulkUpsertRequest bulkUpsertRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkUpsertResponse>(objectMapper.readValue("", BulkUpsertResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkUpsertResponse>(objectMapper.readValue("", BulkUpsertResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<BulkUpsertResponse>(HttpStatus.OK);
    }

}
