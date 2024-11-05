package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.LeadsExportCreateRequest;
import com.prokarma.pkmst.model.LeadsExportCreateResponse;
import com.prokarma.pkmst.model.LeadsExportResponseData;

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
public class LeadsExportApiController implements LeadsExportApi {
    private final ObjectMapper objectMapper;
@Autowired
    public LeadsExportApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<LeadsExportCreateResponse> leadsExportCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody LeadsExportCreateRequest leadsExportCreateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExportCreateResponse>(objectMapper.readValue("", LeadsExportCreateResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExportCreateResponse>(objectMapper.readValue("", LeadsExportCreateResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<LeadsExportCreateResponse>(objectMapper.readValue("", LeadsExportCreateResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<LeadsExportCreateResponse>(HttpStatus.OK);
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

        return new ResponseEntity<LeadsExportResponseData>(HttpStatus.OK);
    }

}
