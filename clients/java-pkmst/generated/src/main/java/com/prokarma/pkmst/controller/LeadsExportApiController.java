package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.LeadsExportResponseData;
import com.prokarma.pkmst.model.LeadsExports;
import com.prokarma.pkmst.model.LeadsExportsCreate;
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
public class LeadsExportApiController implements LeadsExportApi {
    private final ObjectMapper objectMapper;
@Autowired
    public LeadsExportApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<LeadsExports> leadsExportCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody LeadsExportsCreate leadsExportsCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExports>(objectMapper.readValue("", LeadsExports.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExports>(objectMapper.readValue("", LeadsExports.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExports>(objectMapper.readValue("", LeadsExports.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExports>(objectMapper.readValue("", LeadsExports.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExports>(objectMapper.readValue("", LeadsExports.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExports>(objectMapper.readValue("", LeadsExports.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExports>(objectMapper.readValue("", LeadsExports.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExports>(objectMapper.readValue("", LeadsExports.class), HttpStatus.OK);
        }

        return new ResponseEntity<LeadsExports>(HttpStatus.OK);
    }

    public ResponseEntity<LeadsExportResponseData> leadsExportGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "lead_export_id token returned from the create a lead export endpoint",required=true ) @PathVariable("leads_export_id") String leadsExportId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExportResponseData>(objectMapper.readValue("", LeadsExportResponseData.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExportResponseData>(objectMapper.readValue("", LeadsExportResponseData.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExportResponseData>(objectMapper.readValue("", LeadsExportResponseData.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExportResponseData>(objectMapper.readValue("", LeadsExportResponseData.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExportResponseData>(objectMapper.readValue("", LeadsExportResponseData.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExportResponseData>(objectMapper.readValue("", LeadsExportResponseData.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExportResponseData>(objectMapper.readValue("", LeadsExportResponseData.class), HttpStatus.OK);
        }

        return new ResponseEntity<LeadsExportResponseData>(HttpStatus.OK);
    }

}
