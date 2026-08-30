package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ConversionEvents;
import com.prokarma.pkmst.model.ConversionEventsCreate;
import com.prokarma.pkmst.model.DetailedError;
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
public class ConversionEventsApiController implements ConversionEventsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ConversionEventsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<ConversionEvents> eventsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody ConversionEventsCreate conversionEventsCreate,
        @ApiParam(value = "Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.")  @RequestParam(value = "test", required = false) Boolean test,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionEvents>(objectMapper.readValue("", ConversionEvents.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionEvents>(objectMapper.readValue("", ConversionEvents.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionEvents>(objectMapper.readValue("", ConversionEvents.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionEvents>(objectMapper.readValue("", ConversionEvents.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionEvents>(objectMapper.readValue("", ConversionEvents.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionEvents>(objectMapper.readValue("", ConversionEvents.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionEvents>(objectMapper.readValue("", ConversionEvents.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionEvents>(objectMapper.readValue("", ConversionEvents.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionEvents>(objectMapper.readValue("", ConversionEvents.class), HttpStatus.OK);
        }

        return new ResponseEntity<ConversionEvents>(HttpStatus.OK);
    }

}
