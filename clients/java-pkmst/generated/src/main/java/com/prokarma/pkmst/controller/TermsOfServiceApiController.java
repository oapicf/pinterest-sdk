package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.TermsOfService;

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
public class TermsOfServiceApiController implements TermsOfServiceApi {
    private final ObjectMapper objectMapper;
@Autowired
    public TermsOfServiceApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<TermsOfService> termsOfServiceGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Return HTML in TOS text.", defaultValue = "false")  @RequestParam(value = "include_html", required = false, defaultValue="false") Boolean includeHtml,
        @ApiParam(value = "Request type.")  @RequestParam(value = "tos_type", required = false) String tosType,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TermsOfService>(objectMapper.readValue("", TermsOfService.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TermsOfService>(objectMapper.readValue("", TermsOfService.class), HttpStatus.OK);
        }

        return new ResponseEntity<TermsOfService>(HttpStatus.OK);
    }

}
