package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.BulkDownload;
import com.prokarma.pkmst.model.BulkDownloadCreate;
import com.prokarma.pkmst.model.BulkJobData;
import com.prokarma.pkmst.model.BulkUpsertRequest;
import com.prokarma.pkmst.model.BulkUpsertResponse;
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
public class BulkApiController implements BulkApi {
    private final ObjectMapper objectMapper;
@Autowired
    public BulkApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<BulkDownload> bulkDownloadCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody BulkDownloadCreate bulkDownloadCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkDownload>(objectMapper.readValue("", BulkDownload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkDownload>(objectMapper.readValue("", BulkDownload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkDownload>(objectMapper.readValue("", BulkDownload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkDownload>(objectMapper.readValue("", BulkDownload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkDownload>(objectMapper.readValue("", BulkDownload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkDownload>(objectMapper.readValue("", BulkDownload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkDownload>(objectMapper.readValue("", BulkDownload.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkDownload>(objectMapper.readValue("", BulkDownload.class), HttpStatus.OK);
        }

        return new ResponseEntity<BulkDownload>(HttpStatus.OK);
    }

    public ResponseEntity<BulkJobData> bulkRequestGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Bulk request ID that is from one of the entities bulk endpoints",required=true ) @PathVariable("bulk_request_id") String bulkRequestId,
        @ApiParam(value = "If set to True then attach the errors/details to all the requests", defaultValue = "false")  @RequestParam(value = "include_details", required = false, defaultValue="false") Boolean includeDetails,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkJobData>(objectMapper.readValue("", BulkJobData.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkJobData>(objectMapper.readValue("", BulkJobData.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkJobData>(objectMapper.readValue("", BulkJobData.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkJobData>(objectMapper.readValue("", BulkJobData.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkJobData>(objectMapper.readValue("", BulkJobData.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkJobData>(objectMapper.readValue("", BulkJobData.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BulkJobData>(objectMapper.readValue("", BulkJobData.class), HttpStatus.OK);
        }

        return new ResponseEntity<BulkJobData>(HttpStatus.OK);
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
