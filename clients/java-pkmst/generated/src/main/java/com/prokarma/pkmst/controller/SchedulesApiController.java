package com.prokarma.pkmst.controller;

import java.util.List;
import com.prokarma.pkmst.model.PinterestLibError;
import com.prokarma.pkmst.model.PinterestLibPaginationOrder;
import com.prokarma.pkmst.model.Schedule;
import com.prokarma.pkmst.model.ScheduleBatchUpdate;
import com.prokarma.pkmst.model.ScheduleCreate;
import com.prokarma.pkmst.model.ScheduleStatus;
import com.prokarma.pkmst.model.ScheduleType;
import com.prokarma.pkmst.model.SchedulesCreate200ResponseInner;
import com.prokarma.pkmst.model.SchedulesList200Response;

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
public class SchedulesApiController implements SchedulesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public SchedulesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<List<SchedulesCreate200ResponseInner>> schedulesCreate(@ApiParam(value = "",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody List<ScheduleCreate> scheduleCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(HttpStatus.OK);
    }

    public ResponseEntity<SchedulesList200Response> schedulesList(@ApiParam(value = "",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "List of Entity IDs, must be associated with the Ad Accound ID provided in the path.", required = true)  @RequestParam(value = "entity_ids", required = true) List<String> entityIds,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) PinterestLibPaginationOrder order,
        @ApiParam(value = "Filter schedules by status (one or more)")  @RequestParam(value = "schedule_statuses", required = false) List<ScheduleStatus> scheduleStatuses,
        @ApiParam(value = "Filter schedules by a type", allowableValues = "CAMPAIGN_BUDGET_CHANGE, CAMPAIGN_BID_MULTIPLIERS")  @RequestParam(value = "schedule_type", required = false) ScheduleType scheduleType,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SchedulesList200Response>(objectMapper.readValue("", SchedulesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SchedulesList200Response>(objectMapper.readValue("", SchedulesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SchedulesList200Response>(objectMapper.readValue("", SchedulesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SchedulesList200Response>(objectMapper.readValue("", SchedulesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SchedulesList200Response>(objectMapper.readValue("", SchedulesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SchedulesList200Response>(objectMapper.readValue("", SchedulesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SchedulesList200Response>(objectMapper.readValue("", SchedulesList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<SchedulesList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<List<SchedulesCreate200ResponseInner>> schedulesUpdate(@ApiParam(value = "",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody List<ScheduleBatchUpdate> scheduleBatchUpdate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<SchedulesCreate200ResponseInner>>(HttpStatus.OK);
    }

}
