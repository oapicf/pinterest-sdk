package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.ConversionAccessToken;
import org.openapitools.model.OauthAccessToken;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.TokenGrantType;
import org.openapitools.model.TokenTypeHint;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OauthApiServiceImpl implements OauthApi {
      public Response oauthConversionToken(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response oauthToken(TokenGrantType grantType,String code,String continuousRefresh,String redirectUri,String refreshToken,String scope,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response tokenRevoke(String token,TokenTypeHint tokenTypeHint,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
