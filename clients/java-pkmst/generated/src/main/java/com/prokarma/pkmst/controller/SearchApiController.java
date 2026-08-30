package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.BoardsList200Response;
import com.prokarma.pkmst.model.PinsList200Response;
import com.prokarma.pkmst.model.PinterestLibError;
import com.prokarma.pkmst.model.SearchPartnerPins200Response;

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
public class SearchApiController implements SearchApi {
    private final ObjectMapper objectMapper;
@Autowired
    public SearchApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<SearchPartnerPins200Response> searchPartnerPins(@ApiParam(value = "Search term to look up pins.", required = true)  @RequestParam(value = "term", required = true) String term,
        @ApiParam(value = "Two letter country code (ISO 3166-1 alpha-2)", required = true)  @RequestParam(value = "country_code", required = true) String countryCode,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Search locale.")  @RequestParam(value = "locale", required = false) String locale,
        @ApiParam(value = "Max search result size", defaultValue = "10")  @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchPartnerPins200Response>(objectMapper.readValue("", SearchPartnerPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchPartnerPins200Response>(objectMapper.readValue("", SearchPartnerPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchPartnerPins200Response>(objectMapper.readValue("", SearchPartnerPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchPartnerPins200Response>(objectMapper.readValue("", SearchPartnerPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchPartnerPins200Response>(objectMapper.readValue("", SearchPartnerPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchPartnerPins200Response>(objectMapper.readValue("", SearchPartnerPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchPartnerPins200Response>(objectMapper.readValue("", SearchPartnerPins200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<SearchPartnerPins200Response>(HttpStatus.OK);
    }

    public ResponseEntity<BoardsList200Response> searchUserBoardsGet(@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Search query. Can contain pin description keywords or comma-separated pin IDs.")  @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsList200Response>(objectMapper.readValue("", BoardsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsList200Response>(objectMapper.readValue("", BoardsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsList200Response>(objectMapper.readValue("", BoardsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsList200Response>(objectMapper.readValue("", BoardsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsList200Response>(objectMapper.readValue("", BoardsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsList200Response>(objectMapper.readValue("", BoardsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsList200Response>(objectMapper.readValue("", BoardsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BoardsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<PinsList200Response> searchUserPinsList(@ApiParam(value = "Search query. Can contain pin description keywords or comma-separated pin IDs.", required = true)  @RequestParam(value = "query", required = true) String query,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
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


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PinsList200Response>(objectMapper.readValue("", PinsList200Response.class), HttpStatus.OK);
        }


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

}
