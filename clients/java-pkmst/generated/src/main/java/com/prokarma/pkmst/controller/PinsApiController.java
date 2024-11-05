package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Error;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;
import com.prokarma.pkmst.model.Pin;
import com.prokarma.pkmst.model.PinAnalyticsMetricsResponse;
import com.prokarma.pkmst.model.PinCreate;
import com.prokarma.pkmst.model.PinUpdate;
import com.prokarma.pkmst.model.PinsAnalyticsMetricTypesParameterInner;
import com.prokarma.pkmst.model.PinsList200Response;
import com.prokarma.pkmst.model.PinsSaveRequest;

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
public class PinsApiController implements PinsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public PinsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Map<String, Map<String>> multiPinsAnalytics(@ApiParam(value = "List of Pin IDs.", required = true)  @RequestParam(value = "pin_ids", required = true) List<String> pinIds,
        @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,
        @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,
        @ApiParam(value = "Pin metric types to get data for.", required = true)  @RequestParam(value = "metric_types", required = true) List<PinsAnalyticsMetricTypesParameterInner> metricTypes,
        @ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues = "ALL, MOBILE, TABLET, WEB", defaultValue = "ALL")  @RequestParam(value = "app_types", required = false, defaultValue="ALL") String appTypes,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, Map<String>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, Map<String>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, Map<String>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, Map<String>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, Map<String>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }

        return new ResponseEntity<Map<String, Map<String>>(HttpStatus.OK);
    }

    public ResponseEntity<Map<String, PinAnalyticsMetricsResponse>> pinsAnalytics(@ApiParam(value = "Unique identifier of a Pin.",required=true ) @PathVariable("pin_id") String pinId,
        @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,
        @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,
        @ApiParam(value = "Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before <code>2023-03-20</code>, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than <code>NO_SPLIT</code>.", required = true)  @RequestParam(value = "metric_types", required = true) List<PinsAnalyticsMetricTypesParameterInner> metricTypes,
        @ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues = "ALL, MOBILE, TABLET, WEB", defaultValue = "ALL")  @RequestParam(value = "app_types", required = false, defaultValue="ALL") String appTypes,
        @ApiParam(value = "How to split the data into groups. Not including this param means data won't be split.", allowableValues = "NO_SPLIT, APP_TYPE", defaultValue = "NO_SPLIT")  @RequestParam(value = "split_field", required = false, defaultValue="NO_SPLIT") String splitField,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, PinAnalyticsMetricsResponse>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, PinAnalyticsMetricsResponse>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, PinAnalyticsMetricsResponse>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, PinAnalyticsMetricsResponse>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }

        return new ResponseEntity<Map<String, PinAnalyticsMetricsResponse>>(HttpStatus.OK);
    }

    public ResponseEntity<Pin> pinsCreate(@ApiParam(value = "Create a new Pin." ,required=true )   @RequestBody PinCreate pinCreate,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }

        return new ResponseEntity<Pin>(HttpStatus.OK);
    }

    public ResponseEntity<Void> pinsDelete(@ApiParam(value = "Unique identifier of a Pin.",required=true ) @PathVariable("pin_id") String pinId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Pin> pinsGet(@ApiParam(value = "Unique identifier of a Pin.",required=true ) @PathVariable("pin_id") String pinId,
        @ApiParam(value = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", defaultValue = "false")  @RequestParam(value = "pin_metrics", required = false, defaultValue="false") Boolean pinMetrics,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }

        return new ResponseEntity<Pin>(HttpStatus.OK);
    }

    public ResponseEntity<PinsList200Response> pinsList(@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Pin filter.", allowableValues = "exclude_native, exclude_repins, has_been_promoted")  @RequestParam(value = "pin_filter", required = false) String pinFilter,
        @ApiParam(value = "Specify if return pins from protected boards", defaultValue = "false")  @RequestParam(value = "include_protected_pins", required = false, defaultValue="false") Boolean includeProtectedPins,
        @ApiParam(value = "The type of pins to return, currently only enabled for private pins", allowableValues = "PRIVATE")  @RequestParam(value = "pin_type", required = false) String pinType,
        @ApiParam(value = "Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.", allowableValues = "REGULAR, VIDEO, SHOPPING, CAROUSEL, MAX_VIDEO, SHOP_THE_PIN, COLLECTION, IDEA")  @RequestParam(value = "creative_types", required = false) List<String> creativeTypes,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", defaultValue = "false")  @RequestParam(value = "pin_metrics", required = false, defaultValue="false") Boolean pinMetrics,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PinsList200Response>(objectMapper.readValue("", PinsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PinsList200Response>(objectMapper.readValue("", PinsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PinsList200Response>(objectMapper.readValue("", PinsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<PinsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<Pin> pinsSave(@ApiParam(value = "Unique identifier of a Pin.",required=true ) @PathVariable("pin_id") String pinId,
        @ApiParam(value = "Request object used to save an existing pin" ,required=true )   @RequestBody PinsSaveRequest pinsSaveRequest,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }

        return new ResponseEntity<Pin>(HttpStatus.OK);
    }

    public ResponseEntity<Pin> pinsUpdate(@ApiParam(value = "Unique identifier of a Pin.",required=true ) @PathVariable("pin_id") String pinId,
        @ApiParam(value = "" ,required=true )   @RequestBody PinUpdate pinUpdate,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pin>(objectMapper.readValue("", Pin.class), HttpStatus.OK);
        }

        return new ResponseEntity<Pin>(HttpStatus.OK);
    }

}
