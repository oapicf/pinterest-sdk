package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.DetailedError;
import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.IntegrationLogsRequest;
import com.prokarma.pkmst.model.IntegrationLogsSuccessResponse;
import com.prokarma.pkmst.model.IntegrationMetadata;
import com.prokarma.pkmst.model.IntegrationRecord;
import com.prokarma.pkmst.model.IntegrationRequest;
import com.prokarma.pkmst.model.IntegrationRequestPatch;
import com.prokarma.pkmst.model.IntegrationsGetList200Response;

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
public class IntegrationsApiController implements IntegrationsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public IntegrationsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Void> integrationsCommerceDel(@ApiParam(value = "External business ID for the integration.",required=true ) @PathVariable("external_business_id") String externalBusinessId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<IntegrationMetadata> integrationsCommerceGet(@ApiParam(value = "External business ID for the integration.",required=true ) @PathVariable("external_business_id") String externalBusinessId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationMetadata>(objectMapper.readValue("", IntegrationMetadata.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationMetadata>(objectMapper.readValue("", IntegrationMetadata.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationMetadata>(objectMapper.readValue("", IntegrationMetadata.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationMetadata>(objectMapper.readValue("", IntegrationMetadata.class), HttpStatus.OK);
        }

        return new ResponseEntity<IntegrationMetadata>(HttpStatus.OK);
    }

    public ResponseEntity<IntegrationMetadata> integrationsCommercePatch(@ApiParam(value = "External business ID for the integration.",required=true ) @PathVariable("external_business_id") String externalBusinessId,
        @ApiParam(value = "Parameters to get create/update the Integration Metadata"  )   @RequestBody IntegrationRequestPatch integrationRequestPatch,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationMetadata>(objectMapper.readValue("", IntegrationMetadata.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationMetadata>(objectMapper.readValue("", IntegrationMetadata.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationMetadata>(objectMapper.readValue("", IntegrationMetadata.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationMetadata>(objectMapper.readValue("", IntegrationMetadata.class), HttpStatus.OK);
        }

        return new ResponseEntity<IntegrationMetadata>(HttpStatus.OK);
    }

    public ResponseEntity<IntegrationMetadata> integrationsCommercePost(@ApiParam(value = "Parameters to get create/update the Integration Metadata"  )   @RequestBody IntegrationRequest integrationRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationMetadata>(objectMapper.readValue("", IntegrationMetadata.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationMetadata>(objectMapper.readValue("", IntegrationMetadata.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationMetadata>(objectMapper.readValue("", IntegrationMetadata.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationMetadata>(objectMapper.readValue("", IntegrationMetadata.class), HttpStatus.OK);
        }

        return new ResponseEntity<IntegrationMetadata>(HttpStatus.OK);
    }

    public ResponseEntity<IntegrationRecord> integrationsGetById(@ApiParam(value = "Integration ID.",required=true ) @PathVariable("id") String id,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationRecord>(objectMapper.readValue("", IntegrationRecord.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationRecord>(objectMapper.readValue("", IntegrationRecord.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationRecord>(objectMapper.readValue("", IntegrationRecord.class), HttpStatus.OK);
        }

        return new ResponseEntity<IntegrationRecord>(HttpStatus.OK);
    }

    public ResponseEntity<IntegrationsGetList200Response> integrationsGetList(@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationsGetList200Response>(objectMapper.readValue("", IntegrationsGetList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationsGetList200Response>(objectMapper.readValue("", IntegrationsGetList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<IntegrationsGetList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<IntegrationLogsSuccessResponse> integrationsLogsPost(@ApiParam(value = "Ingest log information from external integration application." ,required=true )   @RequestBody IntegrationLogsRequest integrationLogsRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationLogsSuccessResponse>(objectMapper.readValue("", IntegrationLogsSuccessResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationLogsSuccessResponse>(objectMapper.readValue("", IntegrationLogsSuccessResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<IntegrationLogsSuccessResponse>(objectMapper.readValue("", IntegrationLogsSuccessResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<IntegrationLogsSuccessResponse>(HttpStatus.OK);
    }

}
