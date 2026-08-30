package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ConversionAccessToken;
import com.prokarma.pkmst.model.OauthAccessToken;
import com.prokarma.pkmst.model.PinterestLibError;
import com.prokarma.pkmst.model.TokenGrantType;
import com.prokarma.pkmst.model.TokenTypeHint;

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
public class OauthApiController implements OauthApi {
    private final ObjectMapper objectMapper;
@Autowired
    public OauthApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<ConversionAccessToken> oauthConversionToken(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionAccessToken>(objectMapper.readValue("", ConversionAccessToken.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionAccessToken>(objectMapper.readValue("", ConversionAccessToken.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionAccessToken>(objectMapper.readValue("", ConversionAccessToken.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionAccessToken>(objectMapper.readValue("", ConversionAccessToken.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionAccessToken>(objectMapper.readValue("", ConversionAccessToken.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionAccessToken>(objectMapper.readValue("", ConversionAccessToken.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionAccessToken>(objectMapper.readValue("", ConversionAccessToken.class), HttpStatus.OK);
        }

        return new ResponseEntity<ConversionAccessToken>(HttpStatus.OK);
    }

    public ResponseEntity<OauthAccessToken> oauthToken(@ApiParam(value = "", required=true, allowableValues="authorization_code, refresh_token, client_credentials") @RequestPart(value="grant_type", required=true)  TokenGrantType grantType,
        @ApiParam(value = "") @RequestPart(value="code", required=false)  String code,
        @ApiParam(value = "  If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.") @RequestPart(value="continuous_refresh", required=false)  String continuousRefresh,
        @ApiParam(value = "") @RequestPart(value="redirect_uri", required=false)  String redirectUri,
        @ApiParam(value = "") @RequestPart(value="refresh_token", required=false)  String refreshToken,
        @ApiParam(value = "") @RequestPart(value="scope", required=false)  String scope,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OauthAccessToken>(objectMapper.readValue("", OauthAccessToken.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OauthAccessToken>(objectMapper.readValue("", OauthAccessToken.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OauthAccessToken>(objectMapper.readValue("", OauthAccessToken.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OauthAccessToken>(objectMapper.readValue("", OauthAccessToken.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OauthAccessToken>(objectMapper.readValue("", OauthAccessToken.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OauthAccessToken>(objectMapper.readValue("", OauthAccessToken.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OauthAccessToken>(objectMapper.readValue("", OauthAccessToken.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OauthAccessToken>(objectMapper.readValue("", OauthAccessToken.class), HttpStatus.OK);
        }

        return new ResponseEntity<OauthAccessToken>(HttpStatus.OK);
    }

    public ResponseEntity<Void> tokenRevoke(@ApiParam(value = "The token to revoke.", required=true) @RequestPart(value="token", required=true)  String token,
        @ApiParam(value = "The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.", allowableValues="access_token, refresh_token") @RequestPart(value="token_type_hint", required=false)  TokenTypeHint tokenTypeHint,
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
