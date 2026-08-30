package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.ConversionAccessToken;
import org.openapitools.model.OauthAccessToken;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.TokenGrantType;
import org.openapitools.model.TokenTypeHint;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface OauthApiService {
      Response oauthConversionToken(SecurityContext securityContext)
      throws NotFoundException;
      Response oauthToken(TokenGrantType grantType,String code,String continuousRefresh,String redirectUri,String refreshToken,String scope,SecurityContext securityContext)
      throws NotFoundException;
      Response tokenRevoke(String token,TokenTypeHint tokenTypeHint,SecurityContext securityContext)
      throws NotFoundException;


}
