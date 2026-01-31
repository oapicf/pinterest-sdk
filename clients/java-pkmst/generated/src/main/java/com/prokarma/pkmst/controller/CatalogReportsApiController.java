package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CatalogsCreateReportResponse;
import com.prokarma.pkmst.model.CatalogsReport;
import com.prokarma.pkmst.model.CatalogsReportParameters;
import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.ReportsStats200Response;
import com.prokarma.pkmst.model.ReportsStatsParametersParameter;

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
public class CatalogReportsApiController implements CatalogReportsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CatalogReportsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<CatalogsCreateReportResponse> reportsCreate(@ApiParam(value = "Request object to asynchronously create a report." ,required=true )   @RequestBody CatalogsReportParameters catalogsReportParameters,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsCreateReportResponse>(objectMapper.readValue("", CatalogsCreateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsCreateReportResponse>(objectMapper.readValue("", CatalogsCreateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsCreateReportResponse>(objectMapper.readValue("", CatalogsCreateReportResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsCreateReportResponse>(objectMapper.readValue("", CatalogsCreateReportResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsCreateReportResponse>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsReport> reportsGet(@ApiParam(value = "Token returned from async build report call", required = true)  @RequestParam(value = "token", required = true) String token,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsReport>(objectMapper.readValue("", CatalogsReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsReport>(objectMapper.readValue("", CatalogsReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsReport>(objectMapper.readValue("", CatalogsReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsReport>(objectMapper.readValue("", CatalogsReport.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsReport>(HttpStatus.OK);
    }

    public ResponseEntity<ReportsStats200Response> reportsStats(@ApiParam(value = "Contains the parameters for report identification.", required = true)  @RequestParam(value = "parameters", required = true) ReportsStatsParametersParameter parameters,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ReportsStats200Response>(objectMapper.readValue("", ReportsStats200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ReportsStats200Response>(objectMapper.readValue("", ReportsStats200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ReportsStats200Response>(objectMapper.readValue("", ReportsStats200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<ReportsStats200Response>(HttpStatus.OK);
    }

}
