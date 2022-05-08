package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Account;
import com.prokarma.pkmst.model.AnalyticsMetricsResponse;
import com.prokarma.pkmst.model.Error;
import org.threeten.bp.LocalDate;

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
public class UserAccountApiController implements UserAccountApi {
    private final ObjectMapper objectMapper;
@Autowired
    public UserAccountApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Map<String, AnalyticsMetricsResponse>> userAccountAnalytics(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,
        @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,
        @ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues = "OTHER, CLAIMED, BOTH", defaultValue = "BOTH")  @RequestParam(value = "from_claimed_content", required = false, defaultValue="BOTH") String fromClaimedContent,
        @ApiParam(value = "Pin formats to get data for, default is all.", allowableValues = "ALL, PRODUCT, REGULAR, VIDEO", defaultValue = "ALL")  @RequestParam(value = "pin_format", required = false, defaultValue="ALL") String pinFormat,
        @ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues = "ALL, MOBILE, TABLET, WEB", defaultValue = "ALL")  @RequestParam(value = "app_types", required = false, defaultValue="ALL") String appTypes,
        @ApiParam(value = "Metric types to get data for, default is all. ", allowableValues = "ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE")  @RequestParam(value = "metric_types", required = false) List<String> metricTypes,
        @ApiParam(value = "How to split the data into groups. Not including this param means data won't be split.", allowableValues = "NO_SPLIT, APP_TYPE, OWNED_CONTENT, PIN_FORMAT", defaultValue = "NO_SPLIT")  @RequestParam(value = "split_field", required = false, defaultValue="NO_SPLIT") String splitField,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Map<String, AnalyticsMetricsResponse>>(HttpStatus.OK);
    }

    public ResponseEntity<Account> userAccountGet(@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Account>(objectMapper.readValue("", Account.class), HttpStatus.OK);
        }

        return new ResponseEntity<Account>(HttpStatus.OK);
    }

}
