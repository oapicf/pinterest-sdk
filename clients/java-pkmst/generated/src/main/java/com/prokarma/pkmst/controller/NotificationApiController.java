package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.NotificationPostRequest;
import com.prokarma.pkmst.model.NotificationResponse;
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
public class NotificationApiController implements NotificationApi {
    private final ObjectMapper objectMapper;
@Autowired
    public NotificationApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<NotificationResponse> notificationPost(@ApiParam(value = "" ,required=true )   @RequestBody NotificationPostRequest notificationPostRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<NotificationResponse>(objectMapper.readValue("", NotificationResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<NotificationResponse>(objectMapper.readValue("", NotificationResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<NotificationResponse>(objectMapper.readValue("", NotificationResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<NotificationResponse>(HttpStatus.OK);
    }

}
