package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Error;
import java.util.List;
import com.prokarma.pkmst.model.PromotionCreateRequest;
import com.prokarma.pkmst.model.PromotionResponse;
import com.prokarma.pkmst.model.PromotionUpdateRequest;
import com.prokarma.pkmst.model.PromotionsList200Response;
import com.prokarma.pkmst.model.PromotionsResponse;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Controller
public class PromotionsApiController implements PromotionsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public PromotionsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<PromotionsResponse> promotionsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "List of promotions to create, size limit [1, 30]." ,required=true )   @RequestBody List<PromotionCreateRequest> promotionCreateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PromotionsResponse>(objectMapper.readValue("", PromotionsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PromotionsResponse>(objectMapper.readValue("", PromotionsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PromotionsResponse>(objectMapper.readValue("", PromotionsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<PromotionsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Void> promotionsDelete(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a promotion",required=true ) @PathVariable("promotion_id") String promotionId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<PromotionResponse> promotionsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a promotion",required=true ) @PathVariable("promotion_id") String promotionId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PromotionResponse>(objectMapper.readValue("", PromotionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PromotionResponse>(objectMapper.readValue("", PromotionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PromotionResponse>(objectMapper.readValue("", PromotionResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<PromotionResponse>(HttpStatus.OK);
    }

    public ResponseEntity<PromotionsList200Response> promotionsList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) String order,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PromotionsList200Response>(objectMapper.readValue("", PromotionsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PromotionsList200Response>(objectMapper.readValue("", PromotionsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PromotionsList200Response>(objectMapper.readValue("", PromotionsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<PromotionsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<PromotionsResponse> promotionsUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "List of promotions to create, size limit [1, 30]." ,required=true )   @RequestBody List<PromotionUpdateRequest> promotionUpdateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PromotionsResponse>(objectMapper.readValue("", PromotionsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PromotionsResponse>(objectMapper.readValue("", PromotionsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PromotionsResponse>(objectMapper.readValue("", PromotionsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<PromotionsResponse>(HttpStatus.OK);
    }

}
