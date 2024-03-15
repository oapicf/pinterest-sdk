package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AdAccountsCatalogsProductGroupsList200Response;
import com.prokarma.pkmst.model.Error;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Controller
public class ProductGroupsApiController implements ProductGroupsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ProductGroupsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<AdAccountsCatalogsProductGroupsList200Response> adAccountsCatalogsProductGroupsList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "The feed profile id whose catalog product groups we want to return.")  @RequestParam(value = "feed_profile_id", required = false) String feedProfileId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsCatalogsProductGroupsList200Response>(objectMapper.readValue("", AdAccountsCatalogsProductGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsCatalogsProductGroupsList200Response>(objectMapper.readValue("", AdAccountsCatalogsProductGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsCatalogsProductGroupsList200Response>(objectMapper.readValue("", AdAccountsCatalogsProductGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsCatalogsProductGroupsList200Response>(objectMapper.readValue("", AdAccountsCatalogsProductGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsCatalogsProductGroupsList200Response>(objectMapper.readValue("", AdAccountsCatalogsProductGroupsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccountsCatalogsProductGroupsList200Response>(HttpStatus.OK);
    }

}
