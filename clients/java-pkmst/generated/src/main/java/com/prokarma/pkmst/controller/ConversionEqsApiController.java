package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.EventQualityScore;
import com.prokarma.pkmst.model.IngestionSourceOptions;
import java.util.List;
import com.prokarma.pkmst.model.LookbackPeriodOptions;
import com.prokarma.pkmst.model.PinterestLibError;
import com.prokarma.pkmst.model.SourcePlatformOptions;

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
public class ConversionEqsApiController implements ConversionEqsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ConversionEqsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<List<EventQualityScore>> conversionEqsList(@ApiParam(value = "Lookback window (number of days).", required = true, allowableValues = "1d, 14d")  @RequestParam(value = "lookback_period", required = true) LookbackPeriodOptions lookbackPeriod,
        @ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Source platform of event.", allowableValues = "WEB, MOBILE, MOBILE_ANDROID, MOBILE_IOS, OFFLINE, PINTEREST_WEB, PINTEREST_ANDROID, PINTEREST_IOS, POINT_OF_SALE")  @RequestParam(value = "source_platform", required = false) SourcePlatformOptions sourcePlatform,
        @ApiParam(value = "Ingestion source of event.", allowableValues = "TAG, MMP, FILE_UPLOAD, CONVERSIONS_API, NATIVE")  @RequestParam(value = "ingestion_source", required = false) IngestionSourceOptions ingestionSource,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<EventQualityScore>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<EventQualityScore>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<EventQualityScore>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<EventQualityScore>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<EventQualityScore>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<EventQualityScore>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<EventQualityScore>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<EventQualityScore>>(HttpStatus.OK);
    }

}
