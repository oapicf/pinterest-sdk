package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-08-30T09:54:04.171825690Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface OauthApiService {
      public Response oauthConversionToken(SecurityContext securityContext);
      public Response oauthToken(TokenGrantType grantType, String code, String continuousRefresh, String redirectUri, String refreshToken, String scope, SecurityContext securityContext);
      public Response tokenRevoke(String token, TokenTypeHint tokenTypeHint, SecurityContext securityContext);
}
