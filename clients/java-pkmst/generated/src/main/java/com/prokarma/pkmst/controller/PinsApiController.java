package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AnalyticsMetricsResponse;
import com.prokarma.pkmst.model.Error;
import org.threeten.bp.LocalDate;
import com.prokarma.pkmst.model.Pin;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-05-08T00:31:47.777767Z[Etc/UTC]")
@Controller
public class PinsApiController implements PinsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public PinsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Map<String, AnalyticsMetricsResponse>> pinsAnalytics(@ApiParam(value = "Unique identifier of a Pin.",required=true ) @PathVariable("pin_id") String pinId,
        @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,
        @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,
        @ApiParam(value = "Pin metric types to get data for, default is all.", required = true, allowableValues = "IMPRESSION, SAVE, PIN_CLICK, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW")  @RequestParam(value = "metric_types", required = true) List<String> metricTypes,
        @ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues = "ALL, MOBILE, TABLET, WEB", defaultValue = "ALL")  @RequestParam(value = "app_types", required = false, defaultValue="ALL") String appTypes,
        @ApiParam(value = "How to split the data into groups. Not including this param means data won't be split.", allowableValues = "NO_SPLIT, APP_TYPE", defaultValue = "NO_SPLIT")  @RequestParam(value = "split_field", required = false, defaultValue="NO_SPLIT") String splitField,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Map<String, AnalyticsMetricsResponse>>(HttpStatus.OK);
    }

    public ResponseEntity<Pin> pinsCreate(@ApiParam(value = "Create a new Pin." ,required=true )   @RequestBody Pin pin,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }

        return new ResponseEntity<Pin>(HttpStatus.OK);
    }

    public ResponseEntity<Void> pinsDelete(@ApiParam(value = "Unique identifier of a Pin.",required=true ) @PathVariable("pin_id") String pinId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Pin> pinsGet(@ApiParam(value = "Unique identifier of a Pin.",required=true ) @PathVariable("pin_id") String pinId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }

        return new ResponseEntity<Pin>(HttpStatus.OK);
    }

}
