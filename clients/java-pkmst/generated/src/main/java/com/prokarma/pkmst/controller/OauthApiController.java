package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ConversionAccessTokenResponse;
import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.OauthAccessTokenResponse;

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
public class OauthApiController implements OauthApi {
    private final ObjectMapper objectMapper;
@Autowired
    public OauthApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<ConversionAccessTokenResponse> oauthConversionToken(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionAccessTokenResponse>(objectMapper.readValue("", ConversionAccessTokenResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionAccessTokenResponse>(objectMapper.readValue("", ConversionAccessTokenResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ConversionAccessTokenResponse>(HttpStatus.OK);
    }

    public ResponseEntity<OauthAccessTokenResponse> oauthToken(@ApiParam(value = "", required=true, allowableValues="authorization_code, refresh_token, client_credentials") @RequestPart(value="grant_type", required=true)  String grantType,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OauthAccessTokenResponse>(objectMapper.readValue("", OauthAccessTokenResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OauthAccessTokenResponse>(objectMapper.readValue("", OauthAccessTokenResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<OauthAccessTokenResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Void> tokenRevoke(@ApiParam(value = "The token to revoke.", required=true) @RequestPart(value="token", required=true)  String token,
        @ApiParam(value = "The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.", allowableValues="access_token, refresh_token") @RequestPart(value="token_type_hint", required=false)  String tokenTypeHint,
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

}
