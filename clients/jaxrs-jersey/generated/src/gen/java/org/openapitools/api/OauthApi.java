package org.openapitools.api;

import org.openapitools.api.OauthApiService;
import org.openapitools.api.factories.OauthApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ConversionAccessTokenResponse;
import org.openapitools.model.Error;
import org.openapitools.model.OauthAccessTokenResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/oauth")


@io.swagger.annotations.Api(description = "the oauth API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-31T04:54:42.155723473Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class OauthApi  {
   private final OauthApiService delegate;

   public OauthApi(@Context ServletConfig servletContext) {
      OauthApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("OauthApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (OauthApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = OauthApiServiceFactory.getOauthApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/conversion_token")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Generate OAuth access token for conversion API", notes = "Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.", response = ConversionAccessTokenResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "oauth", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = ConversionAccessTokenResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response oauthConversionToken(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.oauthConversionToken(securityContext);
    }
    @javax.ws.rs.POST
    @Path("/token")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Generate OAuth access token", notes = "Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.", response = OauthAccessTokenResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basic")
    }, tags={ "oauth", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = OauthAccessTokenResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response oauthToken(@ApiParam(value = "", required=true, allowableValues="authorization_code, refresh_token, client_credentials")  @FormParam("grant_type")  String grantType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.oauthToken(grantType, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/token/revoke")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Revoke a token", notes = "Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basic")
    }, tags={ "oauth", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful token revocation. No content is returned.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Client authentication error.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Client is not allowed to revoke token.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response tokenRevoke(@ApiParam(value = "The token to revoke.", required=true)  @FormParam("token")  String token,@ApiParam(value = "The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.", allowableValues="access_token, refresh_token")  @FormParam("token_type_hint")  String tokenTypeHint,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.tokenRevoke(token, tokenTypeHint, securityContext);
    }
}
